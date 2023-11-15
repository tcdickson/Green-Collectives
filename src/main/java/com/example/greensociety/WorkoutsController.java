package com.example.greensociety;

import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.application.HostServices;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.util.Duration;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class WorkoutsController extends HomeApplication implements Initializable {

    @FXML
    private StackPane contentPane;
    @FXML
    Button chooseFighter;
    @FXML
    Label shooterWriteup;
    @FXML
    private Button chooseShooter;
    Image shooter1;
    Image shooter2;
    Image shooter3;
    Image shooter4;
    Image shooter5;
    Image shooter6;
    Image shooter7;
    Image shooter8;
    Image shooter9;
    Image arrowhead1;
    Image arrowhead2;

    ImageView imageView;
    ImageView arrowheadImageView1;
    ImageView arrowheadImageView2;

    private List<Image> images = new ArrayList<>();
    private List<String> bios = new ArrayList<>();
    private List<Button> selectFighterButtons = new ArrayList<>();
    private int currentImageIndex = 0;
    private int currentBioIndex = 0;
    private int currentFighterButtonIndex = 0;
    private static final String API_URL = "https://ycph2c2an0.execute-api.us-west-1.amazonaws.com";

    Font mortalCombatFontHeader = Font.loadFont(getClass().getResourceAsStream("Fonts/mortalCombat.ttf"), 40);
    Font mortalCombatFont = Font.loadFont(getClass().getResourceAsStream("Fonts/mortalCombat.ttf"), 16);

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        chooseFighter.setFont(mortalCombatFontHeader);

        try {
            InputStream stream = getClass().getResourceAsStream("JavaPics/shooter1.png");
            shooter1 = new Image(stream);
            images.add(shooter1);
            bios.add("BIO: After a long day of running circles around guys at the range, Sly Fox dusts off his kit and crushes a 5 mile run at sub 7 pace. The dude loves cardio, and there’s nothing he loves more than crushing his teammates in the gym/track through an old fashioned smoker. His workout will crush your legs and part of your soul.");
            Button chooseShooter1 = new Button("Download Sly Fox's Workout");
            selectFighterButtons.add(chooseShooter1);

            chooseShooter1.setOnAction(event -> {
                try {
                    switchChooseShooter1(event);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });

            InputStream stream4 = getClass().getResourceAsStream("JavaPics/shooter2.png");
            shooter2 = new Image(stream4);
            images.add(shooter2);
            bios.add("BIO: Meet the Basilisk. Although his cardio skills may be questionable, the guy can move some serious weight. There’s been rumors of him abandoning the heavy steel life and focusing a bit on cardio. His workout reflects this. It’s a smoker that will leave you with a healthy pump. ");
             Button chooseShooter2 = new Button("Download The Basilisk's Workout");
            selectFighterButtons.add(chooseShooter2);

            chooseShooter2.setOnAction(event -> {
                try {
                    switchChooseShooter2(event);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });

            InputStream stream5 = getClass().getResourceAsStream("JavaPics/shooter3.png");
            shooter3 = new Image(stream5);
            images.add(shooter3);
            bios.add("BIO: Here rests Kaptain Keyboard. His work demands often keep him from pumping iron with the boys, and he’s forced to get it in whenever he can. His workout is fast, but it’ll leave you properly smoked.");
            Button chooseShooter3 = new Button("Download Kaptain Keyboard's Workout");
            selectFighterButtons.add(chooseShooter3);

            chooseShooter3.setOnAction(event -> {
                try {
                    switchChooseShooter3(event);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });

            InputStream stream6 = getClass().getResourceAsStream("JavaPics/shooter4.png");
            shooter4 = new Image(stream6);
            images.add(shooter4);
            bios.add("You may have guessed it - but Schrodinger's cat is not a GB. And he unfortunately  did not invent this workout. Since his comrades would sometimes joke that he needed to hit the gym more, this workout is dedicated to him. If you’re still out there, enjoy.");
            Button chooseShooter4 = new Button("Download Schrodinger's Cat's Workout");
            selectFighterButtons.add(chooseShooter4);

            chooseShooter4.setOnAction(event -> {
                try {
                    switchChooseShooter4(event);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });

            InputStream stream7 = getClass().getResourceAsStream("JavaPics/shooter5.png");
            shooter5 = new Image(stream7);
            images.add(shooter5);
            bios.add("BIO: It’s fitting that Brass Tyrant’s workout is one of the toughest I’ve ever done. The dude goes all out in everything he does. If you’re brave enough to take on his workout, mind your form (especially if Brass Tyrant is watching). Fluid repetitions will build some serious tree trunks. ");
            Button chooseShooter5 = new Button("Download Brass Tyrant's Workout");
            selectFighterButtons.add(chooseShooter5);

            chooseShooter5.setOnAction(event -> {
                try {
                    switchChooseShooter5(event);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });

            InputStream stream8 = getClass().getResourceAsStream("JavaPics/shooter6.png");
            shooter6 = new Image(stream8);
            images.add(shooter6);
            bios.add("BIO: One of my favorite GB’s, the Spy’s workout is representative of his personality. It’s deceptively intelligent and one of the best workouts out there. Bring a towel and some extreme motivation to the gym. You’ll need it.");
            Button chooseShooter6 = new Button("Download The Spy's Workout");
            selectFighterButtons.add(chooseShooter6);

            chooseShooter6.setOnAction(event -> {
                try {
                    switchChooseShooter6(event);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });

            InputStream stream9 = getClass().getResourceAsStream("JavaPics/shooter7.png");
            shooter7 = new Image(stream9);
            images.add(shooter7);
            bios.add("BIO: Growing up in rural America from the humblest of beginnings, Oscar kept his head down, avoided pitfalls, and crushed sick workouts until he was the best at everything.");
            Button chooseShooter7 = new Button("Download Oscar The Healer's Workout");
            selectFighterButtons.add(chooseShooter7);

            chooseShooter7.setOnAction(event -> {
                try {
                    switchChooseShooter7(event);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });

            InputStream stream10 = getClass().getResourceAsStream("JavaPics/shooter8.png");
            shooter8 = new Image(stream10);
            images.add(shooter8);
            bios.add("BIO: Don’t sleep on the Jailbreaker. Although he’s the nicest dude you’ve ever met, hes also probably the strongest. He chose to pay homage to SGM Sartor by choosing his personalized workout. As you crush yourself to this smoker, take a moment to remember the fallen.");
            Button chooseShooter8 = new Button("Download Jailbreaker's Workout");
            selectFighterButtons.add(chooseShooter8);

            chooseShooter8.setOnAction(event -> {
                try {
                    switchChooseShooter8(event);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });

            InputStream stream11 = getClass().getResourceAsStream("JavaPics/shooter9.png");
            shooter9 = new Image(stream11);
            images.add(shooter9);
            bios.add("BIO: Although a master of most trades, Cyclops focuses on one the most. That’s bench press. If you’re looking for a good pre-weekend pump that will leave you feeling buff at the bars, look no further.");
            Button chooseShooter9 = new Button("Download Cyclops' Workout");
            selectFighterButtons.add(chooseShooter9);

            chooseShooter9.setOnAction(event -> {
                try {
                    switchChooseShooter9(event);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });

            InputStream stream2 = getClass().getResourceAsStream("JavaPics/Arrowhead.png");
            arrowhead1 = new Image(stream2);
            InputStream stream3 = getClass().getResourceAsStream("JavaPics/Arrowhead.png");
            arrowhead2 = new Image(stream3);
            stream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void displayShooter1(MouseEvent event) {
        Button chooseShooter1 = null;
        if (imageView == null) {
            contentPane.getChildren().remove(chooseFighter);
            currentImageIndex = 0;
            imageView = new ImageView(shooter1);
            imageView.setFitWidth(550);
            imageView.setFitHeight(550);
            contentPane.getChildren().add(imageView);
            imageView.setTranslateX(-900);

            TranslateTransition transition = new TranslateTransition(Duration.seconds(1), imageView);
            transition.setToX(0);
            transition.setToY(-17);
            transition.play();
            displayArrowhead();

            shooterWriteup = new Label(bios.get(currentBioIndex));
            shooterWriteup.setFont(mortalCombatFont);
            StackPane.setAlignment(shooterWriteup, Pos.BOTTOM_CENTER);
            StackPane.setMargin(shooterWriteup, new Insets(0, 20, -60, 20));
            contentPane.getChildren().add(shooterWriteup);

            chooseShooter = new Button("Download Sly Fox's Workout");
            chooseShooter.setFont(mortalCombatFont);
            StackPane.setAlignment(chooseShooter, Pos.TOP_CENTER);
            StackPane.setMargin(chooseShooter, new Insets(20,0,0,0));
            contentPane.getChildren().add(chooseShooter);
            chooseShooter.setOnAction(event1 -> {
                try {
                    switchChooseShooter1(event1);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });

        } else {
            contentPane.getChildren().remove(imageView);
            contentPane.getChildren().remove(arrowheadImageView1);
            contentPane.getChildren().remove(arrowheadImageView2);
            contentPane.getChildren().remove(shooterWriteup);
            contentPane.getChildren().remove(chooseShooter);
            arrowheadImageView1 = null;
            arrowheadImageView2 = null;
            imageView = null;
        }
    }

    private String getDownloadUrl (String folder, String category, String filename){
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
    private void openBrowser(String url) {
        try {
            HostServices hostServices = getHostServices();
            hostServices.showDocument(url);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void switchChooseShooter1(ActionEvent event) throws IOException {

        String folder = "workouts";
        String category = "Shooter1";
        String filename = "CardiFlow.pdf";

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

    @FXML
    public void switchChooseShooter2(ActionEvent event) throws IOException {
        String folder = "workouts";
        String category = "Shooter2";
        String filename = "ComingSoon.pdf";

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
    @FXML
    public void switchChooseShooter3(ActionEvent event) throws IOException {

        String folder = "workouts";
        String category = "Shooter3";
        String filename = "CaptainsLunchPump.pdf";

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
    @FXML
    public void switchChooseShooter4(ActionEvent event) throws IOException {

        String folder = "workouts";
        String category = "Shooter4";
        String filename = "ComingSoon.pdf";
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
    @FXML
    public void switchChooseShooter5(ActionEvent event) throws IOException {

        String folder = "workouts";
        String category = "Shooter5";
        String filename = "InTheTrenches.pdf";

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
    @FXML
    public void switchChooseShooter6(ActionEvent event) throws IOException {

        String folder = "workouts";
        String category = "Shooter6";
        String filename = "MathClass.pdf";

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
    @FXML
    public void switchChooseShooter7(ActionEvent event) throws IOException {

        String folder = "workouts";
        String category = "Shooter7";
        String filename = "ComingSoon.pdf";

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
    @FXML
    public void switchChooseShooter8(ActionEvent event) throws IOException {

        String folder = "workouts";
        String category = "Shooter8";
        String filename = "SartorWorkout.pdf";

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
    @FXML
    public void switchChooseShooter9(ActionEvent event) throws IOException {

        String folder = "workouts";
        String category = "Shooter9";
        String filename = "ComingSoon.pdf";

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

    private void displayArrowhead() {
        arrowheadImageView1 = new ImageView(arrowhead1);
        arrowheadImageView2 = new ImageView(arrowhead2);

        arrowheadImageView1.setFitWidth(50);
        arrowheadImageView1.setFitHeight(110);
        arrowheadImageView2.setFitWidth(50);
        arrowheadImageView2.setFitHeight(110);
        arrowheadImageView1.setRotate(90);
        arrowheadImageView2.setRotate(270);

        Text arrowheadLabel = new Text("Next Fighter");
        Font mortalCombatFontArrow = Font.loadFont(getClass().getResourceAsStream("Fonts/mortalCombat.ttf"), 25);

        arrowheadLabel.setFont(mortalCombatFontArrow);

        arrowheadLabel.setFill(Color.WHITE);
        StackPane.setAlignment(arrowheadLabel, Pos.CENTER_RIGHT);
        StackPane.setMargin(arrowheadLabel, new Insets(90, 15, 20, 0));
        contentPane.getChildren().add(arrowheadLabel);

        Text arrowheadLabel2 = new Text("Next Fighter");
        arrowheadLabel2.setFont(mortalCombatFontArrow);

        arrowheadLabel2.setFill(Color.WHITE);
        StackPane.setAlignment(arrowheadLabel2, Pos.CENTER_LEFT);
        StackPane.setMargin(arrowheadLabel2, new Insets(90, 0, 20, 15));
        contentPane.getChildren().add(arrowheadLabel2);

        contentPane.getChildren().addAll(arrowheadImageView1, arrowheadImageView2);

        arrowheadImageView1.setTranslateX(375);
        arrowheadImageView1.setTranslateY(0);
        arrowheadImageView2.setTranslateX(-375);
        arrowheadImageView2.setTranslateY(0);

        DropShadow dropShadow = new DropShadow(10, javafx.scene.paint.Color.GRAY);
        arrowheadImageView1.setEffect(dropShadow);
        arrowheadImageView2.setEffect(dropShadow);
        ScaleTransition scaleOutTransition = new ScaleTransition(Duration.millis(300), arrowheadImageView1);
        ScaleTransition scaleOutTransition2 = new ScaleTransition(Duration.millis(300), arrowheadImageView2);

        scaleOutTransition.setToX(1);
        scaleOutTransition2.setToX(1);
        scaleOutTransition.setToY(1);
        scaleOutTransition2.setToY(1);
        ScaleTransition scaleInTransition = new ScaleTransition(Duration.millis(300), arrowheadImageView1);
        ScaleTransition scaleInTransition2 = new ScaleTransition(Duration.millis(300), arrowheadImageView2);

        scaleInTransition.setToX(1.4);
        scaleInTransition2.setToX(1.4);

        scaleInTransition.setToY(1.4);
        scaleInTransition2.setToY(1.4);
        arrowheadImageView1.setOnMouseExited(event -> scaleOutTransition.play());
        arrowheadImageView1.setCursor(Cursor.DEFAULT);
        arrowheadImageView1.setOnMouseEntered(event -> scaleInTransition.play());
        arrowheadImageView1.setCursor(Cursor.HAND);
        arrowheadImageView2.setOnMouseExited(event -> scaleOutTransition2.play());
        arrowheadImageView2.setCursor(Cursor.DEFAULT);
        arrowheadImageView2.setOnMouseEntered(event -> scaleInTransition2.play());
        arrowheadImageView2.setCursor(Cursor.HAND);

        arrowheadImageView1.setOnMouseClicked(event -> {
            isLeftToRight = false;
            transitionToNextFighter();
        });
        arrowheadImageView2.setOnMouseClicked(event -> {
            isLeftToRight = true;
            transitionToNextFighter();
        });
    }

    private boolean isLeftToRight = true;
    private void transitionToNextFighter() {
        if (imageView != null) {
            int nextButtonIndex;
            int nextIndex;
            int direction;
            if (isLeftToRight) {
                nextIndex = (currentImageIndex + 1) % images.size();
                nextButtonIndex =(currentFighterButtonIndex + 1) % selectFighterButtons.size();
                direction = -1;
            } else {
                nextIndex = (currentImageIndex - 1 + images.size()) % images.size();
                nextButtonIndex = (currentFighterButtonIndex - 1 + selectFighterButtons.size()) % selectFighterButtons.size();
                direction = 1;
            }
            TranslateTransition transition = new TranslateTransition(Duration.seconds(1), imageView);
            transition.setToX(direction * 900);
            transition.setToY(0);
            transition.setOnFinished(event -> {

                contentPane.getChildren().remove(imageView);
                contentPane.getChildren().remove(shooterWriteup);
                contentPane.getChildren().remove(chooseShooter);

                imageView = null;
                arrowheadImageView1 = null;
                arrowheadImageView2 = null;

                currentImageIndex = nextIndex;
                currentBioIndex = nextIndex;
                currentFighterButtonIndex = nextButtonIndex;

                Image nextImage = images.get(currentImageIndex);
                String nextBio = bios.get(currentBioIndex);
                Button nextButton = selectFighterButtons.get(currentFighterButtonIndex);

                imageView = new ImageView(nextImage);
                imageView.setFitWidth(550);
                imageView.setFitHeight(550);
                contentPane.getChildren().add(imageView);

                imageView.setTranslateX(-direction * 900);
                TranslateTransition newTransition = new TranslateTransition(Duration.seconds(1), imageView);
                newTransition.setToX(0);
                newTransition.setToY(-17);
                newTransition.play();
                int newDirection = isLeftToRight ? 1 : -1;
                imageView.setTranslateX(newDirection * 900);

                shooterWriteup = new Label(nextBio);
                shooterWriteup.setFont(Font.font(8));
                StackPane.setAlignment(shooterWriteup, Pos.BOTTOM_CENTER);
                StackPane.setMargin(shooterWriteup, new Insets(0, 20, -60, 20));
                contentPane.getChildren().add(shooterWriteup);

                chooseShooter = nextButton;
                StackPane.setAlignment(chooseShooter, Pos.TOP_CENTER);
                StackPane.setMargin(chooseShooter, new Insets(20,0,0,0));
                contentPane.getChildren().add(chooseShooter);
                chooseShooter.setFont(mortalCombatFont);

                if (nextButton.getText().equals("Download Sly Fox's Workout")) {
                    chooseShooter.setOnAction(event1 -> {
                        try {
                            switchChooseShooter1(event1);
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    });
                } else if (nextButton.getText().equals("Download The Basilisk's Workout")) {
                    chooseShooter.setOnAction(event1 -> {
                        try {
                            switchChooseShooter2(event1);
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    });
                } else if (nextButton.getText().equals("Download Kaptain Keyboard's Workout")) {
                    chooseShooter.setOnAction(event1 -> {
                        try {
                            switchChooseShooter3(event1);
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    });
                } else if (nextButton.getText().equals("Download Schrodinger's Cat's Workout")) {
                    chooseShooter.setOnAction(event1 -> {
                        try {
                            switchChooseShooter4(event1);
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    });
                } else if (nextButton.getText().equals("Download Brass Tyrant's Workout")) {
                    chooseShooter.setOnAction(event1 -> {
                        try {
                            switchChooseShooter5(event1);
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    });
                } else if (nextButton.getText().equals("Download The Spy's Workout")) {
                    chooseShooter.setOnAction(event1 -> {
                        try {
                            switchChooseShooter6(event1);
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    });
                } else if (nextButton.getText().equals("Download Oscar The Healer's Workout")) {
                    chooseShooter.setOnAction(event1 -> {
                        try {
                            switchChooseShooter7(event1);
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    });
                } else if (nextButton.getText().equals("Download Jailbreaker's Workout")) {
                    chooseShooter.setOnAction(event1 -> {
                        try {
                            switchChooseShooter8(event1);
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    });
                } else if (nextButton.getText().equals("Download Cyclops' Workout")) {
                    chooseShooter.setOnAction(event1 -> {
                        try {
                            switchChooseShooter9(event1);
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    });
                }

                isLeftToRight = !isLeftToRight;

            });
            transition.play();
        }
    }
}

