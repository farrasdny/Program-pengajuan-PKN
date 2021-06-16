
package View;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class LoginAdmin {
     private AnchorPane anchor;
    private Pane bannerAtas;
    private Pane bannerBawah;
    private Label judulDepan;
    private Label judulDepan2;
    private TextField usernameField;
    private TextField passwordField;
    private Button simpanButton;
    private Button batalButton;
    
    public void componentAdmin(){
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        
        // =============================================================================
        //                           DEKLARASI VARIABEL
        // =============================================================================
        
        anchor = new AnchorPane();
        bannerAtas = new Pane();
        bannerBawah = new Pane();
        judulDepan = new Label("INPUT DATA");
        judulDepan2 = new Label("ADMIN");
        usernameField = new TextField();
        passwordField = new TextField();
        simpanButton = new Button("SIMPAN");
        batalButton = new Button("BATAL");
        
        // =============================================================================
        //                          CONTROL PANE LOGIN
        // =============================================================================
        
        anchor.setPrefSize(1100 , 800);
        anchor.setStyle("-fx-background-color: linear-gradient(#4C87EB, #242275);");
        anchor.getChildren().addAll(
                bannerAtas, bannerBawah, judulDepan, judulDepan2, usernameField, passwordField,
                simpanButton, batalButton
        );
        
        bannerAtas.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY,Insets.EMPTY)));
        bannerAtas.setPrefSize(1100, 50);
        
        bannerBawah.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY,Insets.EMPTY)));
        bannerBawah.setPrefSize(1100, 50);
        bannerBawah.setLayoutY(750);
        
        judulDepan.setFont(Font.font("Poppins", FontWeight.LIGHT, 40));
        judulDepan.setTextFill(Color.WHITE);
        judulDepan.setLayoutX(360);
        judulDepan.setLayoutY(410);
         
        judulDepan2.setFont(Font.font("Poppins", FontWeight.BOLD, 40));
        judulDepan2.setTextFill(Color.WHITE);
        judulDepan2.setLayoutX(595);
        judulDepan2.setLayoutY(410);
        
        ImageView image = new ImageView(new Image(getClass().getResourceAsStream("/View/logo2.png")));
        anchor.getChildren().add(image);
        image.setFitHeight(280);
        image.setFitWidth(290);
        image.setLayoutX(400);
        image.setLayoutY(100);
        
        usernameField.setPrefSize(260, 30);
        usernameField.setPromptText("Usename");
        usernameField.setFont(Font.font("Poppins", FontWeight.SEMI_BOLD, 14));
        usernameField.setBackground(new Background(new BackgroundFill(Color.WHITE, new CornerRadii(5),Insets.EMPTY)));
        usernameField.setLayoutY(490);
        usernameField.setLayoutX(420);
        
        passwordField.setPrefSize(260, 30);
        passwordField.setPromptText("Password");
        passwordField.setFont(Font.font("Poppins", FontWeight.SEMI_BOLD, 14));
        passwordField.setBackground(new Background(new BackgroundFill(Color.WHITE, new CornerRadii(5),Insets.EMPTY)));
        passwordField.setLayoutY(540);
        passwordField.setLayoutX(420);
        
        simpanButton.setPrefSize(125, 30);
        simpanButton.setBackground(new Background(new BackgroundFill(Color.CORNFLOWERBLUE, new CornerRadii(5),Insets.EMPTY)));
        simpanButton.setFont(Font.font("Poppins", FontWeight.LIGHT, 13));
        simpanButton.setTextFill(Color.WHITE);
        simpanButton.setLayoutX(554);
        simpanButton.setLayoutY(638);
        
        batalButton.setPrefSize(125, 30);
        batalButton.setBackground(new Background(new BackgroundFill(Color.ORANGE, new CornerRadii(5),Insets.EMPTY)));
        batalButton.setFont(Font.font("Poppins", FontWeight.LIGHT, 13));
        batalButton.setTextFill(Color.WHITE);
        batalButton.setLayoutX(420);
        batalButton.setLayoutY(638);
        
        // =============================================================================
        //                                  OPERATION
        // =============================================================================
        
        batalButton.setOnMousePressed((MouseEvent event) -> {
            window.close();
            MainClass main = new MainClass();
            main.accFromOtherClass();
        });
        
        Scene scene = new Scene(anchor);
        window.setScene(scene);
        window.show();
    }
}
