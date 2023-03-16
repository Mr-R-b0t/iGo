package com.example.igofx;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;


import java.util.Random;
import java.util.Calendar;
import java.util.Date;



import java.io.IOException;
import java.time.LocalDate;
import java.time.Year;
public class Application extends javafx.application.Application {
    // Necessary declarations
    double total_price = 0;
    String final_type = "Monthly";
    Date date = new Date();
    Calendar calendar = Calendar.getInstance();

    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("iGo");
        

        // Title
        Text title = new Text("Buy a smartCard\n");
        title.setFont(new Font(20));

        // Buttons
        Button confirmButton = new Button("Confirm");
        Button payButton = new Button("Pay");
        payButton.setVisible(false);
        //Creating labels
        Label label1 = new Label("Select your situation : ");
        Label label2 = new Label("Select the type of subscription : ");
        Label totalLabel = new Label("");
        // Lists
        String pricesLabel[] =
                { "Regular", "Child (0-12)", "Senior (70-109)", "Student", "Low income"};

        int prices[] =
                { 35, 15, 15, 23, 18};

        String typeSubscription[] =
                { "Monthly", "Annual"};

        // Combo boxes
        ComboBox pricesBox =
                new ComboBox(FXCollections
                        .observableArrayList(pricesLabel));

        pricesBox.setValue("Regular");
        ComboBox subscriptionBox =
                new ComboBox(FXCollections
                        .observableArrayList(typeSubscription));
        subscriptionBox.setValue("Monthly");

        // Confirm button eventHandler
        EventHandler<ActionEvent> ConfirmEvent = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                double total = 0;
                int pricesIndex = pricesBox.getSelectionModel().getSelectedIndex();
                    total = prices[pricesIndex];
                int subIndex = subscriptionBox.getSelectionModel().getSelectedIndex();
                if (subIndex == 1)
                {
                    total *= 12;
                    final_type = "Annual";
                    calendar.add(Calendar.YEAR, 1);
                }
                else {
                    calendar.add(Calendar.MONTH, 1);
                }
                    
                totalLabel.setText("TOTAL = " + total + " $");
                payButton.setVisible(true);
                total_price = total;
                
            }
        };
        confirmButton.setOnAction(ConfirmEvent);

        // Payment page
        Text titlePayment = new Text("Payment page");
        titlePayment.setFont(new Font(20));
        Label CCLabel = new Label("Credit card number");
        TextField CCNumber = new TextField();
        Label ExpirationLabel = new Label("Expiration date");
        DatePicker ExpirationDate = new DatePicker();
        Label SecretLabel = new Label("Secret number");
        PasswordField SecretNumber = new PasswordField();
        Button finalPayment = new Button("Pay");

        // Final page
        Text approved = new Text("Transaction approved");
        approved.setFill(Color.GREEN);
        Button photo = new Button("Take a photo");
        Text finalText = new Text("You can get your smartCard.\n\nThank you for your purchase.");
        finalText.setVisible(false);

        // HBoxes (structure)
        HBox box = new HBox(5);
        box.setAlignment(Pos.TOP_CENTER);
        box.setPadding(new Insets(25, 5 , 5, 50));
        box.getChildren().addAll(title);

        HBox box2 = new HBox(5);
        box2.setAlignment(Pos.CENTER);
        box2.setPadding(new Insets(25, 5 , 5, 50));
        box2.getChildren().addAll(label1, pricesBox, label2, subscriptionBox, confirmButton, totalLabel);

        HBox box3 = new HBox(5);
        box3.setAlignment(Pos.BOTTOM_CENTER);
        box3.getChildren().addAll(totalLabel);
        box3.setPadding(new Insets(50, 5 , 5, 50));

        HBox box4 = new HBox(5);
        box4.setAlignment(Pos.BOTTOM_CENTER);
        box4.getChildren().addAll(payButton);
        box4.setPadding(new Insets(20, 5 , 5, 50));

        HBox box5 = new HBox(5);
        box5.setAlignment(Pos.CENTER);
        box5.getChildren().addAll(titlePayment);
        box5.setPadding(new Insets(20, 5 , 5, 50));

        HBox box6 = new HBox(5);
        box6.setAlignment(Pos.CENTER);
        box6.getChildren().addAll(CCLabel,CCNumber, ExpirationLabel, ExpirationDate);
        box6.setPadding(new Insets(20, 5 , 5, 50));

        HBox box6v2 = new HBox(5);
        box6v2.setAlignment(Pos.CENTER);
        box6v2.getChildren().addAll(SecretLabel, SecretNumber, finalPayment);
        box6v2.setPadding(new Insets(20, 5 , 5, 50));

        HBox box7 = new HBox(5);
        box7.setAlignment(Pos.CENTER);
        box7.getChildren().addAll(approved);
        box7.setPadding(new Insets(30, 0 , 0, 0));

        HBox box8 = new HBox(5);
        box8.setAlignment(Pos.CENTER);
        box8.getChildren().addAll(photo);
        box8.setPadding(new Insets(30, 0 , 0, 0));

        HBox box9 = new HBox(5);
        box9.setAlignment(Pos.CENTER);
        box9.getChildren().addAll(finalText);
        box9.setPadding(new Insets(50, 0 , 0, 0));

        VBox rootPage = new VBox(box, box2, box3, box4);
        VBox paymentPage = new VBox(box5, box6, box6v2);
        VBox finalPage = new VBox(box7, box8, box9);

        // Scenes
        Scene defaultScene = new Scene(rootPage, 800, 300);
        Scene paymentScene = new Scene(paymentPage, 800, 300);
        Scene finalScene = new Scene(finalPage, 800, 300);

        // -- Buttons Handler --

        // Pay button eventHandler
        EventHandler<ActionEvent> PayEvent = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                stage.setScene(paymentScene);
                stage.show();
            }
        };
        payButton.setOnAction(PayEvent);

        // finalPayment button eventHandler
        EventHandler<ActionEvent> FinalPaymentHandler = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                stage.setScene(finalScene);
                stage.show();
            }
        };
        finalPayment.setOnAction(FinalPaymentHandler);

        // photo button eventHandler
        EventHandler<ActionEvent> PhotoHandler = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                finalText.setVisible(true);
                Photo photo = new Photo();
                Random rand = new Random();
                int id = rand.nextInt(100000);
                date = calendar.getTime();
                
                SmartCard smartCard = new SmartCard(id, date, total_price, final_type, photo);
                System.out.println("\nNew smartCard :");
                System.out.println(smartCard);
            }
        };
        photo.setOnAction(PhotoHandler);

        // Stage
        stage.setScene(defaultScene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}