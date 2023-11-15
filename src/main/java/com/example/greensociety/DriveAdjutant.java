package com.example.greensociety;

import javafx.application.HostServices;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.net.URL;
import java.util.ResourceBundle;

public class DriveAdjutant extends HomeApplication implements Initializable {

    @FXML
    private ListView<String> filePane;

    @FXML
    private Button conops, doctrine, classes, ranges, other;
    private static final String API_URL = "https://ycph2c2an0.execute-api.us-west-1.amazonaws.com";


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        setupButtonActions();
    }

    private void setupButtonActions() {
        conops.setOnAction(event -> {
            try {
                fetchAndDisplayFiles("Adjutant-General-Corps", "CONOPS");
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        });
        doctrine.setOnAction(event -> {
            try {
                fetchAndDisplayFiles("Adjutant-General-Corps", "Doctrine");
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        });
        classes.setOnAction(event -> {
            try {
                fetchAndDisplayFiles("Adjutant-General-Corps", "Classes");
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        });
        ranges.setOnAction(event -> {
            try {
                fetchAndDisplayFiles("Adjutant-General-Corps", "Ranges");
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        });
        other.setOnAction(event -> {
            try {
                fetchAndDisplayFiles("Adjutant-General-Corps", "Other");
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        });
    }

    public JSONArray fetchFiles(String folder, String category) {
        String fullURL = API_URL + "/list/" + folder + "/" + category;

        try (CloseableHttpClient client = HttpClients.createDefault()) {
            HttpGet request = new HttpGet(fullURL);
            try (CloseableHttpResponse response = client.execute(request)) {
                String responseBody = EntityUtils.toString(response.getEntity());
                JSONObject jsonResponse = new JSONObject(responseBody);
                return jsonResponse.getJSONArray("files");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private void fetchAndDisplayFiles(String folder, String category) throws JSONException {
        JSONArray files = fetchFiles(folder, category);
        filePane.getItems().clear();

        String prefixToRemove = folder + "/" + category + "/";
        for (int i = 0; i < files.length(); i++) {
            String fileKey = files.getString(i);
            String displayKey = fileKey.replace(prefixToRemove, "");
            if (!displayKey.isEmpty()) {
                filePane.getItems().add(displayKey);
            }
        }
        filePane.setOnMouseClicked(event -> {
            if (event.getClickCount() == 1) {
                String selectedFileDisplayKey = filePane.getSelectionModel().getSelectedItem();
                if (selectedFileDisplayKey != null && !selectedFileDisplayKey.isEmpty()) {
                    downloadFile(folder, category, selectedFileDisplayKey);
                }
            }
        });
        filePane.setOnMouseClicked(event -> {
            if (event.getClickCount() == 1) {
                String selectedFileDisplayKey = filePane.getSelectionModel().getSelectedItem();
                if (selectedFileDisplayKey != null && !selectedFileDisplayKey.isEmpty()) {
                    downloadFile(folder, category, selectedFileDisplayKey);
                }
            }
        });

    }

    private String getDownloadUrl(String folder, String category, String filename) {
        String fullURL = API_URL + "/download/" + folder + "/" + category + "/" + filename;

        try (CloseableHttpClient client = HttpClients.createDefault()) {
            HttpGet request = new HttpGet(fullURL);
            try (CloseableHttpResponse response = client.execute(request)) {
                String responseBody = EntityUtils.toString(response.getEntity());
                JSONObject jsonResponse = new JSONObject(responseBody);
                return jsonResponse.getString("files");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private void downloadFile(String folder, String category, String filename) {
        String downloadUrl = getDownloadUrl(folder, category, filename);

        if (downloadUrl != null) {
            try {
                openBrowser(downloadUrl);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Failed to obtain download URL");
        }
    }

    private void openBrowser(String url) {
        try {
            HostServices hostServices = getHostServices();
            hostServices.showDocument(url);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}