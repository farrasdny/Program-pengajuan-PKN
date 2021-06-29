package View;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
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


public class LoginMahasiswa{
    
    // variabel pane login mahasiswa
    private AnchorPane anchor;
    private Pane bannerAtas;
    private Pane bannerBawah;
    private Label judulDepan;
    private Label judulDepan2;
    private Label info;
    private Label info2;
    private TextField namaField;
    private TextField nimField;
    private TextField jurusanField;
    private Label jurusanLabel;
    private Button simpanButton;
    private Button batalButton;
    private Button tanyaButton;
    
    public void componentMahasiswa(){
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        
        // =============================================================================
        //                           DEKLARASI VARIABEL
        // =============================================================================
        
        anchor = new AnchorPane();
        bannerAtas = new Pane();
        bannerBawah = new Pane();
        judulDepan = new Label("INPUT DATA");
        judulDepan2 = new Label("MAHASISWA");
        info = new Label("anda sudah login?");
        info2 = new Label("klik di bawah ini");
        namaField = new TextField();
        nimField = new TextField();
        jurusanField = new TextField();
        jurusanLabel = new Label("jurusan");
        simpanButton = new Button("SIMPAN");
        batalButton = new Button("BATAL");
        tanyaButton = new Button (" CLICK HERE!");
        
        // =============================================================================
        //                          CONTROL PANE LOGIN
        // =============================================================================
        
        anchor.setPrefSize(1100 , 800);
        anchor.setStyle("-fx-background-color: linear-gradient(#4C87EB, #242275);");
        anchor.getChildren().addAll(
                bannerAtas, bannerBawah, judulDepan, judulDepan2, info, info2, namaField, nimField, jurusanField,
                simpanButton, batalButton, tanyaButton
        );
        
        bannerAtas.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY,Insets.EMPTY)));
        bannerAtas.setPrefSize(1100, 50);
        
        bannerBawah.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY,Insets.EMPTY)));
        bannerBawah.setPrefSize(1100, 50);
        bannerBawah.setLayoutY(750);
        
        judulDepan.setFont(Font.font("Poppins", FontWeight.LIGHT, 40));
        judulDepan.setTextFill(Color.WHITE);
        judulDepan.setLayoutX(305);
        judulDepan.setLayoutY(410);
         
        judulDepan2.setFont(Font.font("Poppins", FontWeight.BOLD, 40));
        judulDepan2.setTextFill(Color.WHITE);
        judulDepan2.setLayoutX(540);
        judulDepan2.setLayoutY(410);
        
        info.setFont(Font.font("Poppins", FontWeight.BOLD, 12));
        info.setTextFill(Color.WHITE);
        info.setLayoutX(437);
        info.setLayoutY(678);
        
        info2.setFont(Font.font("Poppins", FontWeight.BOLD, 12));
        info2.setTextFill(Color.WHITE);
        info2.setLayoutX(560);
        info2.setLayoutY(678);
        
        ImageView image = new ImageView(new Image(getClass().getResourceAsStream("/View/logo2.png")));
        anchor.getChildren().add(image);
        image.setFitHeight(280);
        image.setFitWidth(290);
        image.setLayoutX(400);
        image.setLayoutY(100);
        
        namaField.setPrefSize(260, 30);
        namaField.setPromptText("nama");
        namaField.setFont(Font.font("Poppins", FontWeight.SEMI_BOLD, 14));
        namaField.setBackground(new Background(new BackgroundFill(Color.WHITE, new CornerRadii(5),Insets.EMPTY)));
        namaField.setLayoutY(490);
        namaField.setLayoutX(420);
        
        nimField.setPrefSize(260, 30);
        nimField.setPromptText("NIM");
        nimField.setFont(Font.font("Poppins", FontWeight.SEMI_BOLD, 14));
        nimField.setBackground(new Background(new BackgroundFill(Color.WHITE, new CornerRadii(5),Insets.EMPTY)));
        nimField.setLayoutY(540);
        nimField.setLayoutX(420);
        
        jurusanField.setPrefSize(260, 30);
        jurusanField.setPromptText("jurusan");
        jurusanField.setFont(Font.font("Poppins", FontWeight.SEMI_BOLD, 14));
        jurusanField.setBackground(new Background(new BackgroundFill(Color.WHITE, new CornerRadii(5),Insets.EMPTY)));
        jurusanField.setLayoutY(590);
        jurusanField.setLayoutX(420);
        
        jurusanLabel.setFont(Font.font("Poppins", FontWeight.LIGHT, 20));
        jurusanLabel.setTextFill(Color.WHITE);
        jurusanLabel.setLayoutX(380);
        jurusanLabel.setLayoutY(555);
        
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
        
        tanyaButton.setPrefSize(125, 30);
        tanyaButton.setBackground(new Background(new BackgroundFill(Color.ORANGE, new CornerRadii(5),Insets.EMPTY)));
        tanyaButton.setFont(Font.font("Poppins", FontWeight.LIGHT, 13));
        tanyaButton.setTextFill(Color.WHITE);
        tanyaButton.setLayoutX(485);
        tanyaButton.setLayoutY(700);
        
        // =============================================================================
        //                                  OPERATION
        // =============================================================================
        
        batalButton.setOnMousePressed((MouseEvent event) -> {
            window.close();
            MainClass main = new MainClass();
            main.accFromOtherClass();
        });
        
        simpanButton.setOnMousePressed((MouseEvent event) -> {
            window.close();
            SebagaiMahasiswa sebagaimahasiswa = new SebagaiMahasiswa();
            sebagaimahasiswa.componentSebagaiMahasiswa();
            String query = "INSERT INTO datamahasiswa(nama, nim, jurursan) VALUES ('"+namaField.getText()+"','"+nimField.getText()+"','"+jurusanField.getText()+"')";
            executeQuery(query);
        });
        
        tanyaButton.setOnMousePressed((MouseEvent event) -> {
            window.close();
            SebagaiMahasiswa sebagaimahasiswa = new SebagaiMahasiswa();
            sebagaimahasiswa.componentSebagaiMahasiswa();
        });
        
        Scene scene = new Scene(anchor);
        
        Image icon = new Image("/View/logo2.png");
        
        window.getIcons().add(icon);
        window.setTitle("Program Pengajuan PKN");
        window.setScene(scene);
        window.show();
    }  
    
    public Connection getConnection(){
        Connection conn;
        try{
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/programpkn", "root", "");
            return conn;
        }catch(SQLException e){
            System.out.println("Error : "+e.getMessage());
            return null;
        }
    }
    
    private void executeQuery(String query) {
        Connection conn = getConnection();
        Statement st;
        try{
            st = conn.createStatement();
            st.executeUpdate(query);
            
        }catch(SQLException e){
            System.out.println(e);
        }
    }
}
