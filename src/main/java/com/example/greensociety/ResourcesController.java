package com.example.greensociety;

import javafx.animation.ScaleTransition;
import javafx.application.HostServices;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.util.Duration;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class ResourcesController extends HomeApplication implements Initializable{

    @FXML
    VBox vBox;
    @FXML
    private ImageView faEffect;
    @FXML
    private ImageView InfantryEffect;
    @FXML
    private ImageView armorEffect;
    @FXML
    private ImageView engineerEffect;
    @FXML
    private ImageView specialForcesEffect;
    @FXML
    ImageView chapEffect;
    @FXML
    private ImageView civilAffairsEffect;
    @FXML
    private ImageView financeEffect;
    @FXML
    private ImageView qmEffect;
    @FXML
    private ImageView ordnanceEffect;
    @FXML
    private ImageView aviationEffect;
    @FXML
    private ImageView mpEffect;
    @FXML
    private ImageView adjutantEffect;
    @FXML
    private ImageView jagEffect;
    @FXML
    private ImageView medEffect;
    @FXML
    private ImageView transpoEffect;
    @FXML
    private ImageView chemEffect;
    @FXML
    private ImageView cyberEffect;
    @FXML
    private ImageView signalEffect;

    private List<ImageView> effects = new ArrayList<>();
    private List<ScaleTransition> scaleInTransitions = new ArrayList<>();
    private List<ScaleTransition> scaleOutTransitions = new ArrayList<>();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        initializeEffects();
        initializeTransitions();
        setupMouseEvents();
    }
    private void initializeEffects() {
        effects.add(faEffect);
        effects.add(InfantryEffect);
        effects.add(armorEffect);
        effects.add(engineerEffect);
        effects.add(specialForcesEffect);
        effects.add(chapEffect);
        effects.add(civilAffairsEffect);
        effects.add(financeEffect);
        effects.add(qmEffect);
        effects.add(ordnanceEffect);
        effects.add(aviationEffect);
        effects.add(mpEffect);
        effects.add(adjutantEffect);
        effects.add(medEffect);
        effects.add(transpoEffect);
        effects.add(chemEffect);
        effects.add(cyberEffect);
        effects.add(signalEffect);
        effects.add(jagEffect);

    }
    private void initializeTransitions() {
        for (ImageView effect : effects) {
            DropShadow dropShadow = new DropShadow(10, javafx.scene.paint.Color.GRAY);
            effect.setEffect(dropShadow);

            ScaleTransition scaleOutTransition = new ScaleTransition(Duration.millis(300), effect);
            scaleOutTransition.setToX(1);
            scaleOutTransition.setToY(1);
            scaleOutTransitions.add(scaleOutTransition);

            ScaleTransition scaleInTransition = new ScaleTransition(Duration.millis(300), effect);
            scaleInTransition.setToX(1.4);
            scaleInTransition.setToY(1.4);
            scaleInTransitions.add(scaleInTransition);
        }
    }
    private void setupMouseEvents() {
        for (int i = 0; i < effects.size(); i++) {
            ImageView effect = effects.get(i);
            ScaleTransition scaleOutTransition = scaleOutTransitions.get(i);
            ScaleTransition scaleInTransition = scaleInTransitions.get(i);

            effect.setOnMouseExited(event -> scaleOutTransition.play());
//            effect.setCursor(Cursor.DEFAULT);
            effect.setOnMouseEntered(event -> scaleInTransition.play());
//            effect.setCursor(Cursor.HAND);
        }
    }

    public void openSite(ActionEvent actionEvent) {
        HostServices hostServices = getHostServices();
        hostServices.showDocument("http://www.greencollectives.com");
    }
}

