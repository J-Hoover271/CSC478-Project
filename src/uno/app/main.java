package uno.app;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.geometry.Pos;

public class main extends Application {

    public static void main1(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        //scene 1 start-up screen

        Label scene1Label = new Label("UNO");
        scene1Label.setStyle("-fx-text-fill: Black; -fx-font-size: 30px; -fx-font-weight: bold");
        StackPane myStackPane = new StackPane();
        myStackPane.getChildren().add(scene1Label);
        StackPane.setAlignment(scene1Label, Pos.CENTER);

        GridPane myGrid = new GridPane();
        myGrid.setPadding(new Insets(20));
        myGrid.setAlignment(Pos.CENTER);
        myGrid.setHgap(5);
        myGrid.setVgap(10);

        Button myStartButton = new Button("Start");
        HBox myButtonHBox = new HBox();
        myButtonHBox.getChildren().addAll(myStartButton);
        myButtonHBox.setSpacing(10);
        myButtonHBox.setAlignment(Pos.CENTER);

        VBox myCenterVBox = new VBox();
        myCenterVBox.getChildren().addAll(myGrid, myButtonHBox);
        myCenterVBox.setSpacing(10);
        myCenterVBox.setPadding(new Insets(10));

        BorderPane root = new BorderPane();
        root.setTop(myStackPane);
        root.setCenter(myCenterVBox);
        BorderPane.setMargin(myButtonHBox, new Insets(10));


        //Scene 2: Game
        BorderPane game = new BorderPane();
        BorderPane headerPane = new BorderPane();
        Button quit = new Button("Quit");
        Label header = new Label("UNO");
        Label myScore = new Label("Score = 0");
        Label rules = new Label("Rules");

        VBox rightSide = new VBox(15);
        rightSide.getChildren().addAll(myScore, rules);
        headerPane.setLeft(quit);
        headerPane.setCenter(header);
        headerPane.setRight(rightSide);

        HBox playerHand = new HBox(15);
        playerHand.setAlignment(Pos.CENTER);
        for (int i = 0; i < 10; i++) {
            Rectangle playerCard = new Rectangle(50, 80);
            playerCard.setStroke(Color.BLACK);
            playerHand.getChildren().add(playerCard);
        }

        HBox opHand1 = new HBox(15);
        opHand1.setAlignment(Pos.CENTER);
        for (int i = 0; i < 10; i++) {
            Rectangle op1Card = new Rectangle(50, 80);
            op1Card.setStroke(Color.BLACK);
            opHand1.getChildren().add(op1Card);
        }




        VBox main = new VBox(60);
        main.setAlignment(Pos.CENTER);
        main.getChildren().addAll(opHand1, playerHand);
        game.setCenter(main);








        Scene scene1 = new Scene(root, 500, 500);
        Scene scene2 = new Scene(game, 1000, 800);

        myStartButton.setOnAction(e -> {
            primaryStage.setScene(scene2);
        });

        primaryStage.setScene(scene1);
        primaryStage.show();

    }

}