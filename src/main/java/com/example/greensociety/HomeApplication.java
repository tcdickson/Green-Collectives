package com.example.greensociety;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.util.Objects;

public class HomeApplication extends Application {
    private double previousSceneHeight = 850;
    private double previousSceneWidth = 925;

    String css = Objects.requireNonNull(this.getClass().getResource("CssFiles/drives.css")).toExternalForm();


    @Override
    public void start(Stage stage) throws IOException {
        Image customIcon = new Image(Objects.requireNonNull(getClass().getResourceAsStream("JavaPics/greenSocietyIcon.png")));
       stage.getIcons().add(customIcon);
        stage.initStyle(StageStyle.DECORATED);
        launchHomePage(stage);

    }

    public void switchHome(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        saveCurrentSceneDimensions(stage);
        launchHomePage(stage);
    }

    private void launchHomePage(Stage stage) throws IOException {


        FXMLLoader fxmlLoader = new FXMLLoader(HomeApplication.class.getResource("fxmlFiles/greenSociety.fxml"));
        Parent root = fxmlLoader.load();
        String css = Objects.requireNonNull(this.getClass().getResource("CssFiles/home.css")).toExternalForm();
        Scene scene = new Scene(root, previousSceneWidth, previousSceneHeight);
        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.setTitle("Green Collectives");
        stage.show();
    }

    public void switchResources(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        saveCurrentSceneDimensions(stage);

        Parent root = FXMLLoader.load(Objects.requireNonNull(HomeApplication.class.getResource("fxmlFiles/resources.fxml")));
        Scene scene = new Scene(root, previousSceneWidth, previousSceneHeight);
        String css2 = Objects.requireNonNull(this.getClass().getResource("CssFiles/Resources.css")).toExternalForm();
        scene.getStylesheets().add(css2);
        stage.setScene(scene);
        stage.setTitle("Resources");
        stage.show();
    }

    public void switchWorkouts(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        saveCurrentSceneDimensions(stage);

        Parent root = FXMLLoader.load(Objects.requireNonNull(HomeApplication.class.getResource("fxmlFiles/fitnessPlans.fxml")));
        Scene scene = new Scene(root, previousSceneWidth, previousSceneHeight);
        String css3 = Objects.requireNonNull(this.getClass().getResource("CssFiles/workouts.css")).toExternalForm();
        scene.getStylesheets().add(css3);
        stage.setScene(scene);
        stage.setTitle("Workouts");
        stage.show();
    }

    public void switchLinks(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        saveCurrentSceneDimensions(stage);

        Parent root = FXMLLoader.load(Objects.requireNonNull(HomeApplication.class.getResource("fxmlFiles/links.fxml")));
        Scene scene = new Scene(root, previousSceneWidth, previousSceneHeight);
        String css = Objects.requireNonNull(this.getClass().getResource("CssFiles/links.css")).toExternalForm();
        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.setTitle("Links");
        stage.show();
    }

    public void switchRanges(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        saveCurrentSceneDimensions(stage);

        Parent root = FXMLLoader.load(Objects.requireNonNull(HomeApplication.class.getResource("fxmlFiles/ranges.fxml")));
        Scene scene = new Scene(root, previousSceneWidth, previousSceneHeight);
        String css = Objects.requireNonNull(this.getClass().getResource("CssFiles/ranges.css")).toExternalForm();
        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.setTitle("Range Builder");
        stage.show();
    }

    public void switchNews(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        saveCurrentSceneDimensions(stage);

        Parent root = FXMLLoader.load(Objects.requireNonNull(HomeApplication.class.getResource("fxmlFiles/news.fxml")));
        Scene scene = new Scene(root, previousSceneWidth, previousSceneHeight);
        String css = Objects.requireNonNull(this.getClass().getResource("CssFiles/news.css")).toExternalForm();
        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.setTitle("News");
        stage.show();
    }

    public void switchDisclaimer(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        saveCurrentSceneDimensions(stage);

        Parent root = FXMLLoader.load(Objects.requireNonNull(HomeApplication.class.getResource("fxmlFiles/disclaimer.fxml")));
        Scene scene = new Scene(root, previousSceneWidth, previousSceneHeight);
        String css = Objects.requireNonNull(this.getClass().getResource("CssFiles/home.css")).toExternalForm();
        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.setTitle("Disclaimer");
        stage.show();
    }

    public void switchInfantry(javafx.scene.input.MouseEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        saveCurrentSceneDimensions(stage);

        Parent root = FXMLLoader.load(Objects.requireNonNull(HomeApplication.class.getResource("fxmlFiles/driveInfantry.fxml")));
        Scene scene = new Scene(root, previousSceneWidth, previousSceneHeight);
        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.setTitle("Infantry Drive");
        stage.show();
    }
    public void switchSpecialForces(javafx.scene.input.MouseEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        saveCurrentSceneDimensions(stage);

        Parent root = FXMLLoader.load(Objects.requireNonNull(HomeApplication.class.getResource("fxmlFiles/driveSpecialForces.fxml")));
        Scene scene = new Scene(root, previousSceneWidth, previousSceneHeight);
        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.setTitle("Special Forces Drive");
        stage.show();
    }
    public void switchArmor(javafx.scene.input.MouseEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        saveCurrentSceneDimensions(stage);

        Parent root = FXMLLoader.load(Objects.requireNonNull(HomeApplication.class.getResource("fxmlFiles/driveArmor.fxml")));
        Scene scene = new Scene(root, previousSceneWidth, previousSceneHeight);
        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.setTitle("Armor Drive");
        stage.show();
    }
    public void switchAviation(javafx.scene.input.MouseEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        saveCurrentSceneDimensions(stage);

        Parent root = FXMLLoader.load(Objects.requireNonNull(HomeApplication.class.getResource("fxmlFiles/driveAviation.fxml")));
        Scene scene = new Scene(root, previousSceneWidth, previousSceneHeight);
        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.setTitle("Aviation Drive");
        stage.show();
    }
    public void switchMilitaryPolice(javafx.scene.input.MouseEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        saveCurrentSceneDimensions(stage);

        Parent root = FXMLLoader.load(Objects.requireNonNull(HomeApplication.class.getResource("fxmlFiles/driveMilitaryPolice.fxml")));
        Scene scene = new Scene(root, previousSceneWidth, previousSceneHeight);
        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.setTitle("Military Police Drive");
        stage.show();
    }
    public void switchChaplain(javafx.scene.input.MouseEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        saveCurrentSceneDimensions(stage);

        Parent root = FXMLLoader.load(Objects.requireNonNull(HomeApplication.class.getResource("fxmlFiles/driveChaplain.fxml")));
        Scene scene = new Scene(root, previousSceneWidth, previousSceneHeight);
        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.setTitle("Chaplain Drive");
        stage.show();
    }
    public void switchSignal(javafx.scene.input.MouseEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        saveCurrentSceneDimensions(stage);

        Parent root = FXMLLoader.load(Objects.requireNonNull(HomeApplication.class.getResource("fxmlFiles/driveSignal.fxml")));
        Scene scene = new Scene(root, previousSceneWidth, previousSceneHeight);
        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.setTitle("Signal Drive");
        stage.show();
    }
    public void switchCyber(javafx.scene.input.MouseEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        saveCurrentSceneDimensions(stage);

        Parent root = FXMLLoader.load(Objects.requireNonNull(HomeApplication.class.getResource("fxmlFiles/driveCyber.fxml")));
        Scene scene = new Scene(root, previousSceneWidth, previousSceneHeight);
        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.setTitle("Cyber Drive");
        stage.show();
    }
    public void switchChemical(javafx.scene.input.MouseEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        saveCurrentSceneDimensions(stage);

        Parent root = FXMLLoader.load(Objects.requireNonNull(HomeApplication.class.getResource("fxmlFiles/driveChemical.fxml")));
        Scene scene = new Scene(root, previousSceneWidth, previousSceneHeight);
        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.setTitle("Chemical Drive");
        stage.show();
    }
    public void switchQM(javafx.scene.input.MouseEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        saveCurrentSceneDimensions(stage);

        Parent root = FXMLLoader.load(Objects.requireNonNull(HomeApplication.class.getResource("fxmlFiles/driveQM.fxml")));
        Scene scene = new Scene(root, previousSceneWidth, previousSceneHeight);
        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.setTitle("Quartermaster Drive");
        stage.show();
    }
    public void switchTranspo(javafx.scene.input.MouseEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        saveCurrentSceneDimensions(stage);

        Parent root = FXMLLoader.load(Objects.requireNonNull(HomeApplication.class.getResource("fxmlFiles/driveTranspo.fxml")));
        Scene scene = new Scene(root, previousSceneWidth, previousSceneHeight);
        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.setTitle("Transportation Drive");
        stage.show();
    }
    public void switchMed(javafx.scene.input.MouseEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        saveCurrentSceneDimensions(stage);

        Parent root = FXMLLoader.load(Objects.requireNonNull(HomeApplication.class.getResource("fxmlFiles/driveMed.fxml")));
        Scene scene = new Scene(root, previousSceneWidth, previousSceneHeight);
        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.setTitle("Medical/Nurse Drive");
        stage.show();
    }
    public void switchJag(javafx.scene.input.MouseEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        saveCurrentSceneDimensions(stage);

        Parent root = FXMLLoader.load(Objects.requireNonNull(HomeApplication.class.getResource("fxmlFiles/driveJag.fxml")));
        Scene scene = new Scene(root, previousSceneWidth, previousSceneHeight);
        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.setTitle("JAG Drive");
        stage.show();
    }
    public void switchAdjutant(javafx.scene.input.MouseEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        saveCurrentSceneDimensions(stage);

        Parent root = FXMLLoader.load(Objects.requireNonNull(HomeApplication.class.getResource("fxmlFiles/driveAdjutant.fxml")));
        Scene scene = new Scene(root, previousSceneWidth, previousSceneHeight);
        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.setTitle("Adjutant General Drive");
        stage.show();
    }
    public void switchFinance(javafx.scene.input.MouseEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        saveCurrentSceneDimensions(stage);

        Parent root = FXMLLoader.load(Objects.requireNonNull(HomeApplication.class.getResource("fxmlFiles/driveFinance.fxml")));
        Scene scene = new Scene(root, previousSceneWidth, previousSceneHeight);
        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.setTitle("Finance Drive");
        stage.show();
    }
    public void switchCivilAffairs(javafx.scene.input.MouseEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        saveCurrentSceneDimensions(stage);

        Parent root = FXMLLoader.load(Objects.requireNonNull(HomeApplication.class.getResource("fxmlFiles/driveCA.fxml")));
        Scene scene = new Scene(root, previousSceneWidth, previousSceneHeight);
        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.setTitle("Civil Affairs Drive");
        stage.show();
    }
    public void switchOrdnance(javafx.scene.input.MouseEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        saveCurrentSceneDimensions(stage);

        Parent root = FXMLLoader.load(Objects.requireNonNull(HomeApplication.class.getResource("fxmlFiles/driveOrdnance.fxml")));
        Scene scene = new Scene(root, previousSceneWidth, previousSceneHeight);
        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.setTitle("Ordnance Drive");
        stage.show();
    }
    public void switchEngineer(javafx.scene.input.MouseEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        saveCurrentSceneDimensions(stage);

        Parent root = FXMLLoader.load(Objects.requireNonNull(HomeApplication.class.getResource("fxmlFiles/driveEngineer.fxml")));
        Scene scene = new Scene(root, previousSceneWidth, previousSceneHeight);
        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.setTitle("Engineer Drive");
        stage.show();
    }
    public void switchFieldArtillery(javafx.scene.input.MouseEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        saveCurrentSceneDimensions(stage);

        Parent root = FXMLLoader.load(Objects.requireNonNull(HomeApplication.class.getResource("fxmlFiles/driveFieldArtillery.fxml")));
        Scene scene = new Scene(root, previousSceneWidth, previousSceneHeight);
        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.setTitle("Field Artillery Drive");
        stage.show();
    }
    private void saveCurrentSceneDimensions(Stage stage) {
        Scene currentScene = stage.getScene();
        if (currentScene != null) {
            previousSceneWidth = currentScene.getWidth();
            previousSceneHeight = currentScene.getHeight();
        }
    }


    public static void main(String[] args) {
        launch();
    }
}