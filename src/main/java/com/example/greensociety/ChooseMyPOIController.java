package com.example.greensociety;

import javafx.application.HostServices;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType0Font;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

import static javafx.scene.text.FontPosture.REGULAR;

public class ChooseMyPOIController extends HomeApplication implements Initializable {

    private List<String> selectedItems;
    private Map<String, Integer> pistolDrillToAmmoMap;
    private Map<String, Integer> rifleDrillToAmmoMap;

    @FXML
    private VBox leftVbox;

    @FXML
    private VBox rightVbox;


    List<Spinner<Integer>> shooterSpinners = new ArrayList<>();
    List<Spinner<Integer>> iterationSpinners = new ArrayList<>();
    List<File> generatedPDFs = new ArrayList<>();
    public void initializeGeneratedPDFsList(List<File> generatedPDFs) {
        this.generatedPDFs = generatedPDFs;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void initializeSelectedItems(List<String> selectedItems, Map<String, Integer> pistolDrillToAmmo, Map<String, Integer> rifleDrillToAmmo) {
        this.pistolDrillToAmmoMap = pistolDrillToAmmo;
        this.rifleDrillToAmmoMap = rifleDrillToAmmo;
        this.selectedItems = selectedItems;
        populateSelectedItems();
    }

    private void populateSelectedItems() {
        if (selectedItems != null) {

            for (String item : selectedItems) {
                Label label = new Label(item);
                label.setFont(Font.font("Arial Black", FontWeight.BOLD, REGULAR, 19));
                label.setPadding(new Insets(2, 0, 10, 10));

                Label label1 = new Label("Number of Shooters");
                label1.setFont(Font.font("Arial Black", FontWeight.BOLD, REGULAR, 16));
                label1.setPadding(new Insets(0, 0, 5, 10));

                Label label2 = new Label("Iterations");
                label2.setFont(Font.font("Arial Black", FontWeight.BOLD, REGULAR, 14));
                label2.setPadding(new Insets(5, 0, 5, 10));

                int minValue = 0;
                int maxValue = 100;
                Spinner<Integer> spinner1 = new Spinner<>();
                Spinner<Integer> spinner2 = new Spinner<>();

                spinner1.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(minValue, maxValue));
                spinner1.setEditable(true);
                spinner1.setMaxWidth(80);
                shooterSpinners.add(spinner1);

                spinner2.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(minValue, maxValue));
                spinner2.setEditable(true);
                spinner2.setMaxWidth(80);
                iterationSpinners.add(spinner2);

                VBox vboxInput1 = new VBox(label1, spinner1);
                VBox vboxInput2 = new VBox(label2, spinner2);
                vboxInput1.setPadding(new Insets(0, 0, 0, 10));
                vboxInput2.setPadding(new Insets(0, 0, 0, 10));

                leftVbox.getChildren().addAll(label, vboxInput1, vboxInput2);
            }
        }
    }


    @FXML
    private void handleAmmoExpenditure() {
        rightVbox.getChildren().clear();
        int totalAmmoExpenditurePistol = 0;
        int totalAmmoExpenditureRifle = 0;
        for (int i = 0; i < selectedItems.size(); i++) {
            int associatedValuePistol = pistolDrillToAmmoMap.getOrDefault(selectedItems.get(i), 0);
            int associatedValueRifle = rifleDrillToAmmoMap.getOrDefault(selectedItems.get(i), 0);

            int iterations = iterationSpinners.get(i).getValue();
            int shooterMultiplier = shooterSpinners.get(i).getValue();
            int currentAmmoExpenditurePistol = associatedValuePistol * iterations * shooterMultiplier;
            int currentAmmoExpenditureRifle = associatedValueRifle * iterations * shooterMultiplier;

            totalAmmoExpenditurePistol += currentAmmoExpenditurePistol;
            totalAmmoExpenditureRifle += currentAmmoExpenditureRifle;

            System.out.println("associated value Pistol: " + associatedValuePistol + " associated value Rifle: " + associatedValueRifle + " iterations: " + iterations + " shootermultiplier " + shooterMultiplier); //debug

            String printDescription = "Breakdown for " + selectedItems.get(i) + ":" + "\nNumber of Shooters: " + shooterMultiplier + "\nIterations: " + iterations + "\nAmmo Expenditure: \n" + currentAmmoExpenditurePistol + " (pistol) \n" + currentAmmoExpenditureRifle + " (rifle)" + "\n\n"; //debug

            Label ammoLabel = new Label(printDescription);
            ammoLabel.setFont(Font.font("EdgyFont", FontWeight.BOLD, REGULAR, 14));

            rightVbox.getChildren().add(ammoLabel);
        }

        Label totalExpenditureLabel = new Label("Total Ammo Expenditure: \n" + totalAmmoExpenditurePistol + " (pistol)\n" + totalAmmoExpenditureRifle + " (rifle)");
        totalExpenditureLabel.setFont(Font.font("EdgyFont", FontWeight.BOLD, REGULAR, 14));
        rightVbox.getChildren().add(0, totalExpenditureLabel);

        Button printToPDF = new Button("Save to PDF");
        printToPDF.getStyleClass().add("savePOI");
        HBox wrapper = new HBox(printToPDF);
        wrapper.setAlignment(Pos.CENTER);
        VBox.setMargin(wrapper, new Insets(0, 0, 0, 110));
        rightVbox.getChildren().add(0, wrapper);

        HostServices hostServices = getHostServices();

        //        String destinationDirectory = System.getenv("SNAP_USER_DATA");
        String destinationDirectory = "Files";

        String pdfFileName = "My Range";

//        String pdfFilePath = destinationDirectory + "/pdf-files/" + pdfFileName;
        String pdfFilePath = destinationDirectory + pdfFileName;

        printToPDF.setOnAction(e -> {
            System.out.println("button triggered!"); //Debug

            try (InputStream is = getClass().getResourceAsStream("Files/Template.pdf");
                 PDDocument templateDocument = PDDocument.load(is)) {
                PDPage templatePage = templateDocument.getPage(0);
                PDPageContentStream contentStream = new PDPageContentStream(templateDocument, templatePage, PDPageContentStream.AppendMode.APPEND, true);

                InputStream fontStream = getClass().getResourceAsStream("Fonts/times.ttf");

                PDType0Font font = PDType0Font.load(templateDocument, fontStream);

                float x = 40;
                float y = templatePage.getMediaBox().getHeight() - 50;
                int currentPageLines = 0;
                int maxLinesPerPage = 43;

                for (Node node : rightVbox.getChildren()) {
                    if (node instanceof Label) {
                        String labelText = ((Label) node).getText();
                        String[] lines = labelText.split("\\n");
                        float lineHeight = font.getFontDescriptor().getFontBoundingBox().getHeight() / 1000 * 14;

                        for (String line : lines) {
                            if (currentPageLines >= maxLinesPerPage) {
                                contentStream.close();
                                PDPage newPage = new PDPage();
                                templateDocument.addPage(newPage);
                                contentStream = new PDPageContentStream(templateDocument, newPage);
                                y = newPage.getMediaBox().getHeight() - 50;
                                currentPageLines = 0;
                            }

                            contentStream.beginText();
                            contentStream.newLineAtOffset(x, y);
                            contentStream.setFont(font, 14);
                            contentStream.showText(line);
                            contentStream.endText();

                            y -= lineHeight;
                            currentPageLines++;
                        }

                        for (int i = 0; i < 2; i++) {
                            if (currentPageLines >= maxLinesPerPage) {
                                contentStream.close();
                                PDPage newPage = new PDPage();
                                templateDocument.addPage(newPage);
                                contentStream = new PDPageContentStream(templateDocument, newPage);
                                y = newPage.getMediaBox().getHeight() - 50;
                                currentPageLines = 0;
                            }
                            y -= lineHeight;
                            currentPageLines++;
                        }
                    }
                }
                contentStream.close();
                try (FileOutputStream fos = new FileOutputStream(pdfFilePath)) {

                    File pdfFile = new File(pdfFilePath);
                    String uniqueFileName = pdfFilePath.replace(".pdf", "_" + System.currentTimeMillis() + ".pdf");
                    pdfFile.renameTo(new File(uniqueFileName));
                    pdfFile = new File(uniqueFileName);
                    templateDocument.save(pdfFile);

                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                File pdfFile = new File(pdfFilePath);
                String uniqueFileName = pdfFilePath.replace(".pdf", "_" + System.currentTimeMillis() + ".pdf");
                pdfFile.renameTo(new File(uniqueFileName));
                pdfFile = new File(uniqueFileName);
                templateDocument.save(pdfFile);

                templateDocument.close();
                hostServices.showDocument(pdfFile.toURI().toString());


            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
    }
}