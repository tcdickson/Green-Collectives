package com.example.greensociety;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.effect.BlurType;
import javafx.scene.effect.InnerShadow;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.*;


public class RangesController extends HomeApplication implements Initializable {

    @FXML
    private VBox vbox;
    private ListView<String> pistolList;
    private ListView<String> rifleList;
    private final List<String> mySelectedItems = new ArrayList<>();
    private final Map<String, Integer> itemToVariableMap = new HashMap<>();
    private final Map<String, Integer> pistolDrillToAmmoMap = new HashMap<>();
    private final Map<String, Integer> rifleDrillToAmmoMap = new HashMap<>();

    private final HBox hbox = new HBox();

    private final VBox drillContentBox = new VBox();
    private final ScrollPane scrollPane = new ScrollPane();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        pistolList = new ListView<>();
        pistolList.setPrefWidth(450);
        pistolList.setPrefHeight(600);

        rifleList = new ListView<>();
        rifleList.setPrefWidth(450);
        rifleList.setPrefHeight(600);
        initPistolAndRifleList();

        setListWithCheckBox(pistolList);
        setListWithCheckBox(rifleList);

        scrollPane.setPrefWidth(500);
        scrollPane.setPrefHeight(600);

        Label label1 = new Label("Pistol Drills");
        label1.setFont(Font.font("Arial Black", FontWeight.BOLD, 16));
        label1.setTextFill(Color.DARKSLATEGRAY);
        label1.setEffect(new InnerShadow(BlurType.THREE_PASS_BOX, Color.rgb(0, 0, 0, 0.7), 6, 0.0, 0, 2));
        label1.setTranslateX(-360);
        label1.setTranslateY(25);

        Label label2 = new Label("Rifle Drills");
        label2.setFont(Font.font("Arial Black", FontWeight.BOLD, 16));
        label2.setTextFill(Color.DARKSLATEGRAY);
        label2.setEffect(new InnerShadow(BlurType.THREE_PASS_BOX, Color.rgb(0, 0, 0, 0.7), 6, 0.0, 0, 2));
        label2.setTranslateX(0);
        label2.setTranslateY(25);

        Label label3 = new Label("Drill Description");
        label3.setFont(Font.font("Arial Black", FontWeight.BOLD, 16));
        label3.setTextFill(Color.DARKSLATEGRAY);
        label3.setEffect(new InnerShadow(BlurType.THREE_PASS_BOX, Color.rgb(0, 0, 0, 0.7), 6, 0.0, 0, 2));
        label3.setTranslateX(360);
        label3.setTranslateY(25);

        hbox.setPrefWidth(1100);
        hbox.setPrefHeight(700);
        hbox.setSpacing(10);
        hbox.setTranslateY(25);
        HBox.setHgrow(pistolList, Priority.ALWAYS);
        HBox.setHgrow(rifleList, Priority.ALWAYS);
        HBox.setHgrow(scrollPane, Priority.ALWAYS);
        HBox.setHgrow(label1, Priority.ALWAYS);
        HBox.setHgrow(label2, Priority.ALWAYS);
        HBox.setHgrow(label3, Priority.ALWAYS);


        hbox.getChildren().addAll(label1, label2, label3, pistolList, rifleList, scrollPane);

        StackPane labelButtonStack = new StackPane();

        Button buildMyPoi = new Button("Build My Range");
        buildMyPoi.getStyleClass().add("custom-button");
        buildMyPoi.setId("buildMyPoi");
        buildMyPoi.setFont(Font.font("Arial", 25));

        buildMyPoi.setTranslateX(0);
        buildMyPoi.setTranslateY(0);

        buildMyPoi.setOnAction(event -> {
            try {
                buildMyPoi(event);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        labelButtonStack.getChildren().addAll(label1, label2, label3, buildMyPoi);

        vbox.getChildren().addAll(labelButtonStack, hbox);
    }

    private void buildMyPoi(ActionEvent event) throws IOException {

        System.out.println("Selected Items Size: " + mySelectedItems.size()); // Debug
        System.out.println("itemtovariablemap size:" + itemToVariableMap.size()); //Debug
        FXMLLoader loader = new FXMLLoader(HomeApplication.class.getResource("fxmlFiles/choosePOI.fxml"));
        Parent root = loader.load();
        ChooseMyPOIController chooseMyPOIController = loader.getController();
        chooseMyPOIController.initializeSelectedItems(mySelectedItems, pistolDrillToAmmoMap, rifleDrillToAmmoMap);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root, 925, 850);
        String css = Objects.requireNonNull(this.getClass().getResource("CssFiles/chooseMyPOI.css")).toExternalForm();
        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.setTitle("Selected POI");
        stage.show();
    }

    private void setListWithCheckBox(ListView<String> listView) {
        listView.setCellFactory(param -> new ListCell<>() {
            private final CheckBox checkBox = new CheckBox();
            private final Button previewButton = new Button("Preview");
            private final Label label = new Label();
            private final HBox container = new HBox(checkBox, label, previewButton);

            {
                HBox.setHgrow(container.getChildren().get(1), Priority.ALWAYS);
                setGraphic(container);

                HBox.setMargin(container.getChildren().get(1), new Insets(0, 10, 0, 0));

                checkBox.selectedProperty().addListener((obs, oldVal, newVal) -> {
                    String item = getItem();
                    System.out.println("Checkbox for item '" + item + "' selected: " + newVal);
                    if (newVal) {
                        mySelectedItems.add(item);
                        if (pistolList.getItems().contains(item)) {
                            itemToVariableMap.put(item, pistolDrillToAmmoMap.get(item));
                        } else if (rifleList.getItems().contains(item)) {
                            itemToVariableMap.put(item, rifleDrillToAmmoMap.get(item));
                        }
                    } else {
                        mySelectedItems.remove(item);
                        itemToVariableMap.remove(item);
                    }
                });

                label.setOnMouseClicked(event -> {
                    checkBox.setSelected(!checkBox.isSelected());
                    event.consume();
                });

                previewButton.setOnAction(event -> {
                    String selectedItem = getItem();
                    if (selectedItem != null) {
                        switch (selectedItem) {
                            case "Basic Drill: One and Two Shots with a Scan":
                                previewContent(selectedItem, BasicDrillController.BASIC_DRILL, "https://www.youtube.com/watch?v=H6ZTfn0ad6E", true);
                                break;
                            case "Single Shot with a Scan from the Holster":
                                previewContent(selectedItem, BasicDrillController.SINGLE_SHOT_SCAN, "https://www.youtube.com/watch?v=H6ZTfn0ad6E", true);
                                break;
                            case "Immediate Action Drill":
                                previewContent(selectedItem, BasicDrillController.IMMEDIATE_ACTION, "https://www.youtube.com/watch?v=zOvT6UXOo74", true);
                                break;
                            case "1-Reload-1":
                                previewContent(selectedItem, BasicDrillController.ONE_RELOAD_ONE, "https://www.youtube.com/shorts/V4VVMD9drI4", true);
                                break;
                            case "1-Reload-1: Strong Side":
                                previewContent(selectedItem, BasicDrillController.ONE_RELOAD_ONE_STRONG_S, "https://www.youtube.com/shorts/HELYSSxngtw", true);
                                break;
                            case "1-Reload-1: Support Side":
                                previewContent(selectedItem, BasicDrillController.ONE_RELOAD_ONE_SUPPORT_S, "https://www.youtube.com/watch?v=oRrRDONGBYM&t=9s", true);
                                break;
                            case "2-Shots with a Scan from the Holster":
                                previewContent(selectedItem, BasicDrillController.TWO_SHOTS_SCAN_HOLSTER, "https://www.youtube.com/watch?v=H6ZTfn0ad6E", true);
                                break;
                            case "2-Shots w/ Scan from the Holster (R)":
                                previewContent(selectedItem, BasicDrillController.TWO_SHOTS_SCAN_RIGHT_SHOULDER, "https://www.youtube.com/watch?v=H6ZTfn0ad6E", true);
                                break;
                            case "2-Shots w/ Scan from the Holster (L)":
                                previewContent(selectedItem, BasicDrillController.TWO_SHOTS_SCAN_LEFT_SHOULDER, "https://www.youtube.com/watch?v=H6ZTfn0ad6E", true);
                                break;
                            case "2-Shots w/ a Scan from the Holster (B)":
                                previewContent(selectedItem, BasicDrillController.TWO_SHOTS_SCAN_BACK, "https://www.youtube.com/watch?v=hJCVShbsCKs", true);
                                break;
                            case "Brass on the Front Sight":
                                previewContent(selectedItem, BasicDrillController.BRASS_FRONT_SIGHT, "https://www.youtube.com/watch?v=EaHSZRnRqrA", true);
                                break;
                            case "Pencil Drill":
                                previewContent(selectedItem, BasicDrillController.PENCIL_DRILL, "https://www.youtube.com/watch?v=xMIYHYh2kqg", true);
                                break;
                            case "Trigger Prep / Slack Out":
                                previewContent(selectedItem, BasicDrillController.TRIGGER_PREP, "https://www.youtube.com/watch?v=LN4bvv6oNVE&t=397s", true);
                                break;
                            case "Ball and Dummy":
                                previewContent(selectedItem, BasicDrillController.BALL_DUMMY, "https://www.youtube.com/watch?v=4Jf5MYbhuPk", true);
                                break;
                            case "Bench Shooting":
                                previewContent(selectedItem, BasicDrillController.BENCH_SHOOTING, "", false);
                                break;
                            case "Figure 8 Drill":
                                previewContent(selectedItem, BasicDrillController.FIGURE_EIGHT, "https://www.youtube.com/watch?v=CO8feXGc9FY", true);
                                break;
                            case "Ragged Hole Drill":
                                previewContent(selectedItem, BasicDrillController.RAGGED_HOLE, "https://www.youtube.com/watch?v=l5XqVvamIe8", true);
                                break;
                            case "Exemplar Drill":
                                previewContent(selectedItem, BasicDrillController.EXEMPLAR_DRILL, "", false);
                                break;
                            case "1-Inch Circle Warm-up / Cool Down":
                                previewContent(selectedItem, BasicDrillController.CIRCLE_WU_CD, "", false);
                                break;
                            case "Throttle Control Rifle Drill (Vertical)":
                                previewContent(selectedItem, BasicDrillController.THROTTLE_CONTROL_VERT, "https://www.youtube.com/watch?v=HlLK5qrSxss", true);
                                break;
                            case "Throttle Control Rifle Drill (Variation)":
                                previewContent(selectedItem, BasicDrillController.THROTTLE_CONTROL_VARIATION, "https://www.youtube.com/watch?v=HlLK5qrSxss", true);
                                break;
                            case "One Finger Trigger Press Drill":
                                previewContent(selectedItem, BasicDrillController.ONE_FINGER_TP_DRILL, "https://www.youtube.com/watch?v=LN4bvv6oNVE", true);
                                break;
                            case "1-2-3 Circle Pistol Drill":
                                previewContent(selectedItem, BasicDrillController.ONE_TWO_THREE_CIRCLE, "https://www.youtube.com/watch?v=Qr4kaZ-yeVU", true);
                                break;
                            case "25-Yard Slow Aimed Fire":
                                previewContent(selectedItem, BasicDrillController.SLOW_AIM_FIRE, "", false);
                                break;
                            case "25-Yard Timed Drill":
                                previewContent(selectedItem, BasicDrillController.TWENTY_FIVE_TIMED, "", false);
                                break;
                            case "Blind Swordsman Drill":
                                previewContent(selectedItem, BasicDrillController.BLIND_SWORDSMAN, "https://www.youtube.com/watch?v=1GBZsFP1DsY", true);
                                break;
                            case "Cold Bore Hostage Drill":
                                previewContent(selectedItem, BasicDrillController.HOSTAGE_DRILL, "https://www.youtube.com/watch?v=tBvYkoSYnQk", true);
                                break;
                            case "Walkback Drill":
                                previewContent(selectedItem, BasicDrillController.WALKBACK_DRILL, "https://www.youtube.com/watch?v=mQ5l4DIHoN8", true);
                                break;
                            case "Rangemaster Bullseye Course":
                                previewContent(selectedItem, BasicDrillController.RANGEMASTER_BULLSEYE, "https://www.youtube.com/watch?v=FdVfaV7BTKo", true);
                                break;
                            case "Cloverleaf Drill":
                                previewContent(selectedItem, BasicDrillController.CLOVERLEAF_DRILL, "https://www.youtube.com/watch?v=oPY7WoI2Ltg", true);
                                break;
                            case "Unknown Gun Drill":
                                previewContent(selectedItem, BasicDrillController.UNKNOWN_GUN_DRILL, "https://www.youtube.com/watch?v=WA-__YATfEU", true);
                                break;
                            case "Ground Clock Drill":
                                previewContent(selectedItem, BasicDrillController.GROUND_CLOCK, "https://www.youtube.com/watch?v=EfxmzjVFU4s", true);
                                break;
                            case "Forward Assault Drill":
                                previewContent(selectedItem, BasicDrillController.FORWARD_ASSAULT, "https://www.youtube.com/watch?v=aIUNQBtAzVo", true);
                                break;
                            case "Catch 22 Drill":
                                previewContent(selectedItem, BasicDrillController.CATCH_TWENTY_TWO, "https://www.youtube.com/watch?v=8icYyJjPOFM", true);
                                break;
                            case "Tri-10 Drill":
                                previewContent(selectedItem, BasicDrillController.TRI_TEN_DRILL, "https://www.youtube.com/watch?v=10Ot9s3u3II", true);
                                break;
                            case "Triple Six Drill":
                                previewContent(selectedItem, BasicDrillController.TRIPLE_SIX, "https://www.youtube.com/watch?v=n9KHlMkIkrg", true);
                                break;
                            case "Rifle/Handgun Transition Drill":
                                previewContent(selectedItem, BasicDrillController.TRANSITION_DRILL, "https://www.youtube.com/watch?v=M7lT7tDEjDU", true);
                                break;
                            case "Controlled Pair":
                                previewContent(selectedItem, BasicDrillController.CONTROLLED_PAIR, "https://www.youtube.com/watch?v=cMsvuiP-ROM", true);
                                break;
                            case "Checklist Drill":
                                previewContent(selectedItem, BasicDrillController.CHECKLIST_DRILL, "", false);
                                break;
                            case "Alternating Targets Drill":
                                previewContent(selectedItem, BasicDrillController.ALTERNATING_TARGETS, "https://www.youtube.com/watch?v=lbLhlhJ7QW8", true);
                                break;
                            case "5-Second Standards":
                                previewContent(selectedItem, BasicDrillController.FIVE_SECOND_STANDARDS, "https://www.youtube.com/watch?v=S6MCY9_lO_8", true);
                                break;
                            case "4567 Drill":
                                previewContent(selectedItem, BasicDrillController.FOUR_FIVE_SIX_SEVEN, "https://www.youtube.com/watch?v=IoX-0EjR-Tk", true);
                                break;
                            case "Circle Drill":
                                previewContent(selectedItem, BasicDrillController.CIRCLE_DRILL, "https://www.youtube.com/watch?v=t368W6ot6lE", true);
                                break;
                            case "El Presidente Drill":
                                previewContent(selectedItem, BasicDrillController.EL_PREZ_DRILL, "https://www.youtube.com/watch?v=4ZdmmcEwdwE", true);
                                break;
                            case "Mozambique Drill":
                                previewContent(selectedItem, BasicDrillController.MOZAMBIQUE_DRILL, "https://www.youtube.com/watch?v=O8QrWm3Acc0", true);
                                break;
                            case "Dot Torture Drill":
                                previewContent(selectedItem, BasicDrillController.DOT_TORTURE_DRILL, "https://www.youtube.com/watch?v=PfwjzYetglg", true);
                                break;
                            case "Collateral Drill":
                                previewContent(selectedItem, BasicDrillController.COLLATERAL_DRILL, "https://www.youtube.com/watch?v=0OGxiqNeRiE&t=1s", true);
                                break;
                            case "VTAC Triple Threat Drill":
                                previewContent(selectedItem, BasicDrillController.VTAC_TRIPLE_THREAT_DRILL, "https://www.youtube.com/watch?v=5K3FP6UqiT0", true);
                                break;
                            case "VTAC 1 to 5 Drill":
                                previewContent(selectedItem, BasicDrillController.VTAC_ONE_FIVE, "https://www.youtube.com/watch?v=5K3FP6UqiT0", true);
                                break;
                            case "VTAC Reload Drill":
                                previewContent(selectedItem, BasicDrillController.VTAC_RELOAD, "https://www.youtube.com/watch?v=2vc_-mlWtgs", true);
                                break;
                            case "FAST Drill":
                                previewContent(selectedItem, BasicDrillController.FAST_DRILL, "https://www.youtube.com/watch?v=ZGJZRapjzOo&t=1s", true);
                                break;
                            case "Hackathorn 3-Second Headshot Standards":
                                previewContent(selectedItem, BasicDrillController.HACKATHORN_HEADSHOT, "https://www.youtube.com/watch?v=i66eYRJx6IU", true);
                                break;
                            case "Switch Hitting Drill":
                                previewContent(selectedItem, BasicDrillController.SWITCH_HITTING_DRILL, "https://www.youtube.com/watch?v=n4nAQQ7yoyA", true);
                                break;
                            case "Pistol Pyramid Drill":
                                previewContent(selectedItem, BasicDrillController.PISTOL_PYRAMID_DRILL, "https://www.youtube.com/watch?v=FX1BJ5U73Hk", true);
                                break;
                            case "Tri-Lambda Drill":
                                previewContent(selectedItem, BasicDrillController.TRI_LAMBDA_DRILL, "https://www.youtube.com/watch?v=Cpe00rOXc8s", true);
                                break;
                            case "Punto Banco Drill (Pistols)":
                                previewContent(selectedItem, BasicDrillController.PUNTO_BANCO_DRILL, "", false);
                                break;
                            case "Punto Banco Drill (Rifle)":
                                previewContent(selectedItem, BasicDrillController.PUNTO_BANCO_DRILL, "", false);
                                break;
                            case "Par 5 Drill":
                                previewContent(selectedItem, BasicDrillController.PAR_FIVE_DRILL, "https://www.youtube.com/watch?v=MpMc_w-yY5M", true);
                                break;
                            case "Modified 5-Yard Round-Up Drill":
                                previewContent(selectedItem, BasicDrillController.MODIFIED_ROUND_UP_DRILL, "https://www.youtube.com/watch?v=ALpu9Zg2JAQ", true);
                                break;
                            case "1-2-Reload-3 Drill":
                                previewContent(selectedItem, BasicDrillController.ONE_TWO_RELOAD_THREE, "https://www.youtube.com/watch?v=lm0Io9z0cL8&t=9s", true);
                                break;
                            case "Hateful 8":
                                previewContent(selectedItem, BasicDrillController.HATEFUL_EIGHT, "https://www.youtube.com/watch?v=yKZ4a8KnNDU", true);
                                break;
                            case "Throttle Control Drill":
                                previewContent(selectedItem, BasicDrillController.THROTTLE_CONTROL_DRILL, "https://www.youtube.com/watch?v=JuDzRbwMBmQ", true);
                                break;
                            case "10-10-10 Shooting Drill":
                                previewContent(selectedItem, BasicDrillController.TEN_TEN_TEN, "https://www.youtube.com/watch?v=yx5ZyOLWpRE", true);
                                break;
                            case "15 in 10 Shooting Drill":
                                previewContent(selectedItem, BasicDrillController.TEN_IN_FIFTEEN, "https://www.youtube.com/watch?v=App1MtvuWCo", true);
                                break;
                            case "Wizard Drill":
                                previewContent(selectedItem, BasicDrillController.WIZARD_DRILL, "https://www.youtube.com/watch?v=GTZoi_3fE_Q", true);
                                break;
                            case "3 Target Transition Drill (Static)":
                                previewContent(selectedItem, BasicDrillController.THREE_TRANSITION_DRILL, "", false);
                                break;
                            case "Police Marksman Drill":
                                previewContent(selectedItem, BasicDrillController.POLICE_MARKSMAN_DRILL, "", false);
                                break;
                            case "X Drill":
                                previewContent(selectedItem, BasicDrillController.X_DRILL, "https://www.youtube.com/watch?v=gkinkQgPiSo", true);
                                break;
                            case "1-Reload-2 Drill":
                                previewContent(selectedItem, BasicDrillController.ONE_RELOAD_TWO, "https://www.youtube.com/shorts/V4VVMD9drI4", true);
                                break;
                            case "26662 Shooting Drill":
                                previewContent(selectedItem, BasicDrillController.TWO_SIX_SIX_SIX_TWO, "https://www.youtube.com/watch?v=0-sogms5QXU", true);
                                break;
                            case "3×5 Card Drill":
                                previewContent(selectedItem, BasicDrillController.THREE_FIVE_CARD_DRILL, "https://www.youtube.com/watch?v=YURLn54JykE", true);
                                break;
                            case "4 x 20 Transition Drill":
                                previewContent(selectedItem, BasicDrillController.FOUR_TWENTY_TRANSITION, "", false);
                                break;
                            case "5 x 5 Skill Test":
                                previewContent(selectedItem, BasicDrillController.FIVE_FIVE_SKILL, "https://www.youtube.com/watch?v=-9AT0lWI-pg", true);
                                break;
                            case "Press Six Drill":
                                previewContent(selectedItem, BasicDrillController.PRESS_SIX_DRILL, "https://www.youtube.com/watch?v=1-2U_8DFsJ0", true);
                                break;
                            case "Langdon 3.5-Second Standards":
                                previewContent(selectedItem, BasicDrillController.LANGDON_THREE_SECOND, "https://www.youtube.com/watch?v=bHZM_bnHybQ", true);
                                break;
                            case "Six Steel Plate Rack":
                                previewContent(selectedItem, BasicDrillController.SIX_STEEL_RACK, "https://www.youtube.com/watch?v=PhShNmkO18Y", true);
                                break;
                            case "Weaver Drill":
                                previewContent(selectedItem, BasicDrillController.WEAVER_DRILL, "https://www.facebook.com/watch/?v=390896456118262", true);
                                break;
                            case "Bill Drill":
                                previewContent(selectedItem, BasicDrillController.BILL_DRILL, "https://www.youtube.com/watch?v=PtIUk_PY3gc", true);
                                break;
                            case "Bill Drill 2":
                                previewContent(selectedItem, BasicDrillController.BILL_DRILL_TWO, "https://www.youtube.com/watch?v=VYv94CZ25Es", true);
                                break;
                            case "Frank Garcia’s Dot Drill":
                                previewContent(selectedItem, BasicDrillController.FRANK_GARCIA_DOT, "https://www.youtube.com/watch?v=rRyCW981hQk", true);
                                break;
                            case "VTAC Half and Half Drill":
                                previewContent(selectedItem, BasicDrillController.VTACK_HALF_HALF, "https://www.youtube.com/watch?v=2-oYRn_llgo", true);
                                break;
                            case "Prone Drill":
                                previewContent(selectedItem, BasicDrillController.PRONE_DRILL, "https://www.youtube.com/watch?v=97jyoAXxMvQ", true);
                                break;
                            case "Barricade Drill":
                                previewContent(selectedItem, BasicDrillController.BARRICADE_DRILL, "https://www.youtube.com/watch?v=nqM-tljetLU&t=14s", true);
                                break;
                            case "2-R-2 Drill":
                                previewContent(selectedItem, BasicDrillController.TWO_R_TWO_DRILL, "https://www.youtube.com/watch?v=lm0Io9z0cL8&t=12s", true);
                                break;
                            case "Remedial Action":
                                previewContent(selectedItem, BasicDrillController.REMEDIAL_ACTION_DRILL, "https://www.youtube.com/watch?v=aKshL60xry4", true);
                                break;
                            case "Emergency Reload Drill":
                                previewContent(selectedItem, BasicDrillController.EMERGENCY_RELOAD, "https://www.youtube.com/watch?v=2vc_-mlWtgs", true);
                                break;
                            case "Speed Reload Drill":
                                previewContent(selectedItem, BasicDrillController.SPEED_RELOAD, "", false);
                                break;
                            case "Tactical Reload":
                                previewContent(selectedItem, BasicDrillController.TAC_RELOAD, "https://www.youtube.com/watch?v=vwfGVvFqkfY", true);
                                break;
                            case "3 Target Transition – Moving Forward":
                                previewContent(selectedItem, BasicDrillController.TARGET_TRANSITION_FORWARD, "", false);
                                break;
                            case "3 Target Transition – Left":
                                previewContent(selectedItem, BasicDrillController.TARGET_TRANSITION_LR, "", false);
                                break;
                            case "3 Target Transition – Right":
                                previewContent(selectedItem, BasicDrillController.TARGET_TRANSITION_LR, "", false);
                                break;
                            case "Figure 8 Movement Drill":
                                previewContent(selectedItem, BasicDrillController.FIGURE_EIGHT_MOVEMENT, "https://www.youtube.com/watch?v=acGtnrPm4e0", true);
                                break;
                            case "Forward Movement":
                                previewContent(selectedItem, BasicDrillController.FORWARD_MOVEMENT, "https://www.youtube.com/watch?v=9AleLdhKYN0", true);
                                break;
                            case "Backward Movement":
                                previewContent(selectedItem, BasicDrillController.BACKWARD_MOVEMENT, "https://www.youtube.com/watch?v=aW9Xg9SaWo0", true);
                                break;
                            case "Lateral Movement":
                                previewContent(selectedItem, BasicDrillController.LATERAL_MOVEMENT, "https://www.youtube.com/watch?v=yQjbZdyk3ZM", true);
                                break;
                            case "Action – Reaction Drill":
                                previewContent(selectedItem, BasicDrillController.ACTION_REACTION, "", false);
                                break;
                            case "Gas Pedal Drill":
                                previewContent(selectedItem, BasicDrillController.GAS_PEDAL_DRILL, "https://www.youtube.com/shorts/voA4_LZjlbo", true);
                                break;
                            case "Shoulder Transition Drill":
                                previewContent(selectedItem, BasicDrillController.SHOULDER_TRANSITION_DRILL, "https://www.youtube.com/watch?v=sFI68p1NioQ", true);
                                break;
                            default:
                                break;
                        }
                    }
                });
            }

            public void updateItem(String item, boolean empty) {
                super.updateItem(item, empty);
                if (empty || item == null) {
                    setText(null);
                    setGraphic(null);
                } else {
                    ((Label) container.getChildren().get(1)).setText(item);
                    setGraphic(container);
                }
            }
        });
    }

    private void previewContent(String title, String description, String videoURL, boolean loadWebView) {

        drillContentBox.getChildren().clear();
        TextArea textArea = new TextArea(description);
        textArea.getStyleClass().add("text-area-style");
        textArea.setWrapText(true);
        textArea.setEditable(false);
        textArea.setPrefHeight(500);
        textArea.setPrefWidth(400);

        drillContentBox.getChildren().add(textArea);

        if (loadWebView) {
            WebView webView = new WebView();
            WebEngine webEngine = webView.getEngine();
            String apiKey = "AIzaSyCRo1WFf9xgZV8n22Vt1Hs9_Z6Iu85dRi0";
            String modifiedVideoURL = videoURL + "?key=" + apiKey;
            webEngine.setJavaScriptEnabled(true);
            webEngine.load(modifiedVideoURL);

            webView.setPrefHeight(400);
            webView.setPrefWidth(400);

            drillContentBox.getChildren().add(webView);
        }

        scrollPane.setContent(drillContentBox);
        scrollPane.setFitToWidth(true);
    }

    private void initPistolAndRifleList() {
        pistolList.getItems().addAll("Basic Drill: One and Two Shots with a Scan", "Single Shot with a Scan from the Holster", "Immediate Action Drill", "1-Reload-1", "1-Reload-1: Strong Side", "1-Reload-1: Support Side", "2-Shots with a Scan from the Holster", "2-Shots w/ Scan from the Holster (R)", "2-Shots w/ Scan from the Holster (L)", "2-Shots w/ a Scan from the Holster (B)", "Brass on the Front Sight", "Pencil Drill", "Trigger Prep / Slack Out", "Ball and Dummy", "Bench Shooting", "Figure 8 Drill", "Ragged Hole Drill", "Exemplar Drill", "1-Inch Circle Warm-up / Cool Down", "One Finger Trigger Press Drill", "1-2-3 Circle Pistol Drill", "25-Yard Slow Aimed Fire", "25-Yard Timed Drill", "Blind Swordsman Drill", "Cold Bore Hostage Drill", "Walkback Drill", "Rangemaster Bullseye Course", "Cloverleaf Drill", "Unknown Gun Drill", "Ground Clock Drill", "Forward Assault Drill", "Catch 22 Drill", "Tri-10 Drill", "Triple Six Drill", "Rifle/Handgun Transition Drill", "Controlled Pair", "Checklist Drill", "Alternating Targets Drill", "4567 Drill", "Circle Drill", "El Presidente Drill", "Mozambique Drill", "Dot Torture Drill", "Collateral Drill", "VTAC Triple Threat Drill", "VTAC Reload Drill", "FAST Drill", "Hackathorn 3-Second Headshot Standards", "Switch Hitting Drill", "Pistol Pyramid Drill", "Tri-Lambda Drill", "Punto Banco Drill (Pistols)", "Par 5 Drill", "Modified 5-Yard Round-Up Drill", "1-2-Reload-3 Drill", "Hateful 8", "Throttle Control Drill", "10-10-10 Shooting Drill", "15 in 10 Shooting Drill", "Wizard Drill", "3 Target Transition Drill (Static)", "Police Marksman Drill", "X Drill", "1-Reload-2 Drill", "26662 Shooting Drill", "3×5 Card Drill", "4 x 20 Transition Drill", "5 x 5 Skill Test", "Press Six Drill", "Langdon 3.5-Second Standards", "Six Steel Plate Rack", "Bill Drill", "Bill Drill 2", "Frank Garcia’s Dot Drill", "VTAC Half and Half Drill", "Prone Drill", "Barricade Drill", "2-R-2 Drill", "Remedial Action", "Emergency Reload Drill", "Speed Reload Drill", "Tactical Reload", "3 Target Transition – Moving Forward", "3 Target Transition – Left", "3 Target Transition – Right", "Figure 8 Movement Drill", "Forward Movement", "Backward Movement", "Lateral Movement", "Action – Reaction Drill");

        rifleList.getItems().addAll("Basic Drill: One and Two Shots with a Scan", "Immediate Action Drill", "Ball and Dummy", "Bench Shooting", "Figure 8 Drill", "Ragged Hole Drill", "Exemplar Drill", "Throttle Control Rifle Drill (Vertical)", "Throttle Control Rifle Drill (Variation)", "Ground Clock Drill", "Forward Assault Drill", "Rifle/Handgun Transition Drill", "Controlled Pair", "Checklist Drill", "Alternating Targets Drill", "El Presidente Drill", "Mozambique Drill", "VTAC 1 to 5 Drill", "VTAC Triple Threat Drill", "VTAC Reload Drill", "Hackathorn 3-Second Headshot Standards", "Tri-Lambda Drill", "Punto Banco Drill (Rifle)", "Hateful 8", "3 Target Transition Drill (Static)", "X Drill", "1-Reload-2 Drill", "26662 Shooting Drill", "3×5 Card Drill", "4 x 20 Transition Drill", "Six Steel Plate Rack", "Weaver Drill", "Bill Drill", "Bill Drill 2", "VTAC Half and Half Drill", "Prone Drill", "Barricade Drill", "2-R-2 Drill", "Emergency Reload Drill", "Speed Reload Drill", "Tactical Reload", "3 Target Transition – Moving Forward", "3 Target Transition – Left", "3 Target Transition – Right", "Figure 8 Movement Drill", "Forward Movement", "Backward Movement", "Lateral Movement", "Action – Reaction Drill", "Gas Pedal Drill", "Shoulder Transition Drill");

        final int ONE_PISTOL_MAG = 15;
        final int ONE_RIFLE_MAG = 30;

        pistolDrillToAmmoMap.put("Basic Drill: One and Two Shots with a Scan", 15);
        pistolDrillToAmmoMap.put("Single Shot with a Scan from the Holster", 15);
        pistolDrillToAmmoMap.put("Immediate Action Drill", 15);
        pistolDrillToAmmoMap.put("1-Reload-1", 30);
        pistolDrillToAmmoMap.put("1-Reload-1: Strong Side", 30);
        pistolDrillToAmmoMap.put("1-Reload-1: Support Side", 30);
        pistolDrillToAmmoMap.put("2-Shots with a Scan from the Holster", 30);
        pistolDrillToAmmoMap.put("2-Shots w/ Scan from the Holster (R)", 30);
        pistolDrillToAmmoMap.put("2-Shots w/ Scan from the Holster (L)", 30);
        pistolDrillToAmmoMap.put("2-Shots w/ a Scan from the Holster (B)", 30);
        pistolDrillToAmmoMap.put("Brass on the Front Sight", 0);
        pistolDrillToAmmoMap.put("Pencil Drill", 0);
        pistolDrillToAmmoMap.put("Trigger Prep / Slack Out", 0);
        pistolDrillToAmmoMap.put("Ball and Dummy", 30);
        pistolDrillToAmmoMap.put("Bench Shooting", 30);
        pistolDrillToAmmoMap.put("Figure 8 Drill", 15);
        pistolDrillToAmmoMap.put("Ragged Hole Drill", 15);
        pistolDrillToAmmoMap.put("Exemplar Drill", 15);
        pistolDrillToAmmoMap.put("1-Inch Circle Warm-up / Cool Down", 15);
        pistolDrillToAmmoMap.put("One Finger Trigger Press Drill", 15);
        pistolDrillToAmmoMap.put("1-2-3 Circle Pistol Drill", 30);
        pistolDrillToAmmoMap.put("25-Yard Slow Aimed Fire", 15);
        pistolDrillToAmmoMap.put("25-Yard Timed Drill", 15);
        pistolDrillToAmmoMap.put("Blind Swordsman Drill", 15);
        pistolDrillToAmmoMap.put("Cold Bore Hostage Drill", 1);
        pistolDrillToAmmoMap.put("Walkback Drill", 5);
        pistolDrillToAmmoMap.put("Rangemaster Bullseye Course", 30);
        pistolDrillToAmmoMap.put("Cloverleaf Drill", 15);
        pistolDrillToAmmoMap.put("Unknown Gun Drill", 10);
        pistolDrillToAmmoMap.put("3 Target Transition – Right", 9);
        pistolDrillToAmmoMap.put("Figure 8 Movement Drill", 18);
        pistolDrillToAmmoMap.put("Forward Movement", 8);
        pistolDrillToAmmoMap.put("Backward Movement", 8);
        pistolDrillToAmmoMap.put("Lateral Movement", 5);
        pistolDrillToAmmoMap.put("Action – Reaction Drill", ONE_PISTOL_MAG);
        pistolDrillToAmmoMap.put("7-Yard Speed Drill", 28);
        pistolDrillToAmmoMap.put("Ground Clock Drill", 15);
        pistolDrillToAmmoMap.put("Forward Assault Drill", 10);
        pistolDrillToAmmoMap.put("Catch 22 Drill", 15);
        pistolDrillToAmmoMap.put("Tri-10 Drill", 10);
        pistolDrillToAmmoMap.put("Triple Six Drill", 18);
        pistolDrillToAmmoMap.put("Rifle/Handgun Transition Drill", 6);
        pistolDrillToAmmoMap.put("Controlled Pair", 15);
        pistolDrillToAmmoMap.put("Checklist Drill", 10);
        pistolDrillToAmmoMap.put("5-Second Standards", 15);
        pistolDrillToAmmoMap.put("Alternating Targets Drill", 30);
        pistolDrillToAmmoMap.put("4567 Drill", 20);
        pistolDrillToAmmoMap.put("Circle Drill", 18);
        pistolDrillToAmmoMap.put("El Presidente Drill", 20);
        pistolDrillToAmmoMap.put("Mozambique Drill", 3);
        pistolDrillToAmmoMap.put("Dot Torture Drill", 50);
        pistolDrillToAmmoMap.put("Collateral Drill", 5);
        pistolDrillToAmmoMap.put("VTAC Triple Threat Drill", 15);
        pistolDrillToAmmoMap.put("VTAC Reload Drill", 9);
        pistolDrillToAmmoMap.put("FAST Drill", 6);
        pistolDrillToAmmoMap.put("Hackathorn 3-Second Headshot Standards", 9);
        pistolDrillToAmmoMap.put("Switch Hitting Drill", 8);
        pistolDrillToAmmoMap.put("Pistol Pyramid Drill", 10);
        pistolDrillToAmmoMap.put("Tri-Lambda Drill", 18);
        pistolDrillToAmmoMap.put("Punto Banco Drill (Pistols)", 39);
        pistolDrillToAmmoMap.put("Par 5 Drill", 10);
        pistolDrillToAmmoMap.put("Modified 5-Yard Round-Up Drill", 10);
        pistolDrillToAmmoMap.put("1-2-Reload-3 Drill", 6);
        pistolDrillToAmmoMap.put("Hateful 8", 8);
        pistolDrillToAmmoMap.put("Throttle Control Drill", 15);
        pistolDrillToAmmoMap.put("10-10-10 Shooting Drill", 33);
        pistolDrillToAmmoMap.put("15 in 10 Shooting Drill", 15);
        pistolDrillToAmmoMap.put("Wizard Drill", 5);
        pistolDrillToAmmoMap.put("3 Target Transition Drill (Static)", 9);
        pistolDrillToAmmoMap.put("Police Marksman Drill", 30);
        pistolDrillToAmmoMap.put("X Drill", 32);
        pistolDrillToAmmoMap.put("1-Reload-2 Drill", ONE_PISTOL_MAG);
        pistolDrillToAmmoMap.put("26662 Shooting Drill", 5);
        pistolDrillToAmmoMap.put("3×5 Card Drill", 18);
        pistolDrillToAmmoMap.put("4 x 20 Transition Drill", 20);
        pistolDrillToAmmoMap.put("5 x 5 Skill Test", 25);
        pistolDrillToAmmoMap.put("Press Six Drill", 62);
        pistolDrillToAmmoMap.put("Langdon 3.5-Second Standards", 24);
        pistolDrillToAmmoMap.put("Six Steel Plate Rack", 6);
        pistolDrillToAmmoMap.put("Bill Drill", 6);
        pistolDrillToAmmoMap.put("Bill Drill 2", 15);
        pistolDrillToAmmoMap.put("Frank Garcia’s Dot Drill", 36);
        pistolDrillToAmmoMap.put("VTAC Half and Half Drill", 30);
        pistolDrillToAmmoMap.put("Prone Drill", ONE_PISTOL_MAG);
        pistolDrillToAmmoMap.put("Barricade Drill", ONE_PISTOL_MAG);
        pistolDrillToAmmoMap.put("2-R-2 Drill", ONE_PISTOL_MAG);
        pistolDrillToAmmoMap.put("Remedial Action", 0);
        pistolDrillToAmmoMap.put("Emergency Reload Drill", 9);
        pistolDrillToAmmoMap.put("Speed Reload Drill", 0);
        pistolDrillToAmmoMap.put("Tactical Reload", ONE_PISTOL_MAG);


        rifleDrillToAmmoMap.put("Basic Drill: One and Two Shots with a Scan", 30);
        rifleDrillToAmmoMap.put("Immediate Action Drill", 30);
        rifleDrillToAmmoMap.put("Ball and Dummy", 60);
        rifleDrillToAmmoMap.put("Bench Shooting", 60);
        rifleDrillToAmmoMap.put("Figure 8 Drill", 30);
        rifleDrillToAmmoMap.put("Ragged Hole Drill", 30);
        rifleDrillToAmmoMap.put("Exemplar Drill", 30);
        rifleDrillToAmmoMap.put("Throttle Control Rifle Drill (Vertical)", 30);
        rifleDrillToAmmoMap.put("Throttle Control Rifle Drill (Variation)", 30);
        rifleDrillToAmmoMap.put("Ground Clock Drill", 30);
        rifleDrillToAmmoMap.put("Forward Assault Drill", 10);
        rifleDrillToAmmoMap.put("Rifle/Handgun Transition Drill", 30);
        rifleDrillToAmmoMap.put("Controlled Pair", 30);
        rifleDrillToAmmoMap.put("Checklist Drill", 10);
        rifleDrillToAmmoMap.put("Alternating Targets Drill", 60);
        rifleDrillToAmmoMap.put("El Presidente Drill", 12);
        rifleDrillToAmmoMap.put("Mozambique Drill", 3);
        rifleDrillToAmmoMap.put("VTAC 1 to 5 Drill", 16);
        rifleDrillToAmmoMap.put("VTAC Triple Threat Drill", 15);
        rifleDrillToAmmoMap.put("VTAC Reload Drill", 9);
        rifleDrillToAmmoMap.put("Hackathorn 3-Second Headshot Standards", 9);
        rifleDrillToAmmoMap.put("Tri-Lambda Drill", 18);
        rifleDrillToAmmoMap.put("Punto Banco Drill (Rifle)", 30);
        rifleDrillToAmmoMap.put("Hateful 8", 8);
        rifleDrillToAmmoMap.put("3 Target Transition Drill (Static)", 9);
        rifleDrillToAmmoMap.put("X Drill", 32);
        rifleDrillToAmmoMap.put("1-Reload-2 Drill", ONE_RIFLE_MAG);
        rifleDrillToAmmoMap.put("26662 Shooting Drill", 5);
        rifleDrillToAmmoMap.put("3×5 Card Drill", 18);
        rifleDrillToAmmoMap.put("4 x 20 Transition Drill", 20);
        rifleDrillToAmmoMap.put("Six Steel Plate Rack", 6);
        rifleDrillToAmmoMap.put("Weaver Drill", 18);
        rifleDrillToAmmoMap.put("Bill Drill", 6);
        rifleDrillToAmmoMap.put("Bill Drill 2", 15);
        rifleDrillToAmmoMap.put("VTAC Half and Half Drill", 30);
        rifleDrillToAmmoMap.put("Prone Drill", ONE_RIFLE_MAG);
        rifleDrillToAmmoMap.put("Barricade Drill", ONE_RIFLE_MAG);
        rifleDrillToAmmoMap.put("2-R-2 Drill", ONE_RIFLE_MAG);
        rifleDrillToAmmoMap.put("Emergency Reload Drill", 9);
        rifleDrillToAmmoMap.put("Speed Reload Drill", 0);
        rifleDrillToAmmoMap.put("Tactical Reload", ONE_RIFLE_MAG);
        rifleDrillToAmmoMap.put("3 Target Transition – Moving Forward", 9);
        rifleDrillToAmmoMap.put("3 Target Transition – Left", 9);
        rifleDrillToAmmoMap.put("3 Target Transition – Right", 9);
        rifleDrillToAmmoMap.put("Figure 8 Movement Drill", 18);
        rifleDrillToAmmoMap.put("Forward Movement", 8);
        rifleDrillToAmmoMap.put("Backward Movement", 8);
        rifleDrillToAmmoMap.put("Lateral Movement", 5);
        rifleDrillToAmmoMap.put("Action – Reaction Drill", ONE_RIFLE_MAG);
        rifleDrillToAmmoMap.put("Gas Pedal Drill", 30);
        rifleDrillToAmmoMap.put("Shoulder Transition Drill", 12);

        pistolList.setOnMouseClicked(event -> setListWithCheckBox(pistolList));
        rifleList.setOnMouseClicked(event -> setListWithCheckBox(rifleList));
    }
}



