package View;

import Model.Dosen;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import static javafx.scene.control.TableView.CONSTRAINED_RESIZE_POLICY;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
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

public class SebagaiDosen{
    
    // variabel pane sebagai dosen
    private AnchorPane anchor;
    private Pane bannerAtas;
    private Pane bannerBawah;
    private Label judulDepan;
    private Label judulDepan2;
    private Button simpanButton;
    private Button backButton;
    private Button tampilButton;
    private TableView <Dosen> table;
    private TableColumn <Dosen, Integer> jumlahMahasiswaColumn;
    private TableColumn <Dosen, String> waktuColumn;
    private TableColumn <Dosen, String> ruanganColumn;
    private TextField jumlahMahasiswaField;
    private TextField waktuField;
    private TextField ruanganField;
    
    public void componentSebagaiDosen(){
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        
        // =============================================================================
        //                           DEKLARASI VARIABEL
        // =============================================================================
        
        anchor = new AnchorPane();
        bannerAtas = new Pane();
        bannerBawah = new Pane();
        judulDepan = new Label("MASUKKAN");
        judulDepan2 = new Label("JADWAL");
        simpanButton = new Button("SIMPAN JADWAL");
        backButton = new Button("BACK");
        tampilButton = new Button("TAMPIL JADWAL");
        table = new TableView();
        jumlahMahasiswaColumn = new TableColumn("Jumlah mahasiswa");
        waktuColumn = new TableColumn("Waktu pelaksanaan");
        ruanganColumn = new TableColumn("Ruangan");
        jumlahMahasiswaField = new TextField();
        waktuField = new TextField();
        ruanganField = new TextField();
         
        // =============================================================================
        //                          CONTROL PANE LOGIN DOSEN
        // =============================================================================
        
        anchor.setPrefSize(1100 , 800);
        anchor.setStyle("-fx-background-color: linear-gradient(#4C87EB, #242275);");
        
        bannerAtas.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY,Insets.EMPTY)));
        bannerAtas.setPrefSize(1100, 50);
        
        bannerBawah.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY,Insets.EMPTY)));
        bannerBawah.setPrefSize(1100, 50);
        bannerBawah.setLayoutY(750);
        
        judulDepan.setFont(Font.font("Poppins", FontWeight.LIGHT, 40));
        judulDepan.setTextFill(Color.WHITE);
        judulDepan.setLayoutX(350);
        judulDepan.setLayoutY(65);
         
        judulDepan2.setFont(Font.font("Poppins", FontWeight.BOLD, 40));
        judulDepan2.setTextFill(Color.WHITE);
        judulDepan2.setLayoutX(580);
        judulDepan2.setLayoutY(65);
        
        simpanButton.setPrefSize(300, 35);
        simpanButton.setLayoutY(315);
        simpanButton.setLayoutX(755);
        simpanButton.setBackground(new Background(new BackgroundFill(Color.CORNFLOWERBLUE, new CornerRadii(5),Insets.EMPTY)));
        simpanButton.setFont(Font.font("Poppins", FontWeight.BOLD, 13));
        simpanButton.setTextFill(Color.WHITE);
        
        backButton.setPrefSize(300, 35);
        backButton.setLayoutY(427);
        backButton.setLayoutX(755);
        backButton.setBackground(new Background(new BackgroundFill(Color.ORANGE, new CornerRadii(5),Insets.EMPTY)));
        backButton.setFont(Font.font("Poppins", FontWeight.BOLD, 13));
        backButton.setTextFill(Color.WHITE);
        
        tampilButton.setPrefSize(300, 35);
        tampilButton.setLayoutY(370);
        tampilButton.setLayoutX(755);
        tampilButton.setBackground(new Background(new BackgroundFill(Color.DARKORANGE, new CornerRadii(5),Insets.EMPTY)));
        tampilButton.setFont(Font.font("Poppins", FontWeight.BOLD, 13));
        tampilButton.setTextFill(Color.WHITE);

        table.getColumns().addAll(jumlahMahasiswaColumn, waktuColumn, ruanganColumn);
        table.setColumnResizePolicy(CONSTRAINED_RESIZE_POLICY);
        table.setPrefSize(650, 550);
        table.setLayoutX(50);
        table.setLayoutY(152);
        
        jumlahMahasiswaField.setPrefSize(300, 32);
        jumlahMahasiswaField.setLayoutX(755);
        jumlahMahasiswaField.setLayoutY(152);
        jumlahMahasiswaField.setPromptText("Jumlah mahasiswa");
        jumlahMahasiswaField.setFont(Font.font("Poppins", FontWeight.SEMI_BOLD, 14));
        jumlahMahasiswaField.setBackground(new Background(new BackgroundFill(Color.WHITE, new CornerRadii(5),Insets.EMPTY)));
        
        waktuField.setPrefSize(300, 32);
        waktuField.setLayoutX(755);
        waktuField.setLayoutY(205);
        waktuField.setPromptText("Waktu");
        waktuField.setFont(Font.font("Poppins", FontWeight.SEMI_BOLD, 14));
        waktuField.setBackground(new Background(new BackgroundFill(Color.WHITE, new CornerRadii(5),Insets.EMPTY)));
        
        ruanganField.setPrefSize(300, 32);
        ruanganField.setLayoutX(755);
        ruanganField.setLayoutY(260);
        ruanganField.setPromptText("Ruangan");
        ruanganField.setFont(Font.font("Poppins", FontWeight.SEMI_BOLD, 14));
        ruanganField.setBackground(new Background(new BackgroundFill(Color.WHITE, new CornerRadii(5),Insets.EMPTY)));
        
        // =============================================================================
        //                                  OPERATION
        // =============================================================================
        
        
        
        backButton.setOnMousePressed((MouseEvent event) -> {
            window.close();
            LoginDosen logindosen = new LoginDosen();
            logindosen.componentDosen();
        });          
        
        simpanButton.setOnMousePressed((MouseEvent event) -> {
            String query = "INSERT INTO jadwal_dosen(JumlahMahasiswa, Waktu, Ruangan) VALUES ('"+jumlahMahasiswaField.getText()+"','"+waktuField.getText()+"','"+ruanganField.getText()+"')";
            executeQuery(query);
            showJadwalDosen();
        });
        
        tampilButton.setOnMousePressed((MouseEvent event) -> {
            showJadwalDosen();
        });
        
        // set background add image
        Image image2 = new Image("/View/umm_background2.png");
        ImageView mv = new ImageView(image2);

        Group root = new Group();
        root.getChildren().addAll(mv, bannerAtas, bannerBawah, judulDepan, judulDepan2, simpanButton, backButton, table,
                jumlahMahasiswaField, waktuField, ruanganField, tampilButton);

        Scene scene = new Scene(root, 1100, 800);
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
    
    public ObservableList<Dosen> getDosenList(){
        ObservableList<Dosen> dosenList = FXCollections.observableArrayList();
        Connection conn = getConnection();
        String query = "SELECT * FROM jadwal_dosen";
        Statement st;
        ResultSet rs;
        
        try{
            st = conn.createStatement();
            rs = st.executeQuery(query);
            Dosen dosen;
            while(rs.next()){
                dosen = new Dosen(rs.getInt("jumlahMahasiswa"), rs.getString("waktu"), rs.getString("ruangan"));
                dosenList.add(dosen);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return dosenList;
    }
    
    public void showJadwalDosen(){
        ObservableList<Dosen> list = getDosenList();
        
        jumlahMahasiswaColumn.setCellValueFactory(new PropertyValueFactory<Dosen, Integer>("jumlahMahasiswa"));
        waktuColumn.setCellValueFactory(new PropertyValueFactory<Dosen, String>("waktu"));
        ruanganColumn.setCellValueFactory(new PropertyValueFactory<Dosen, String>("ruangan"));
        
        table.setItems(list);
    }
}
