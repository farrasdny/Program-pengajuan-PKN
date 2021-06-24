package View;

import java.io.File;
import java.io.IOException;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import static javafx.scene.control.TableView.CONSTRAINED_RESIZE_POLICY;
import javafx.scene.effect.BoxBlur;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class SuratBalasan{
    
    private AnchorPane anchor;
    private TableView table;
    private TableColumn suratBalasanColumn;
    private Button backButton;
    
    public void componentSuratBalasan(){
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        
        // =============================================================================
        //                           DEKLARASI VARIABEL
        // =============================================================================
        
        anchor = new AnchorPane();
        table = new TableView();
        suratBalasanColumn = new TableColumn("Surat balasan perusahaan");
        backButton = new Button("BACK");
        
        // =============================================================================
        //                          CONTROL PANE LOGIN
        // =============================================================================
        
        anchor.setPrefSize(500 , 280);
        anchor.setStyle("-fx-background-color: #DFDFDF;");
        anchor.getChildren().addAll(
                table, backButton
        );  
        
        table.getColumns().addAll(suratBalasanColumn);
        table.setColumnResizePolicy(CONSTRAINED_RESIZE_POLICY);
        table.setPrefSize(457, 200);
        table.setLayoutX(20);
        table.setLayoutY(20);
        
        backButton.setPrefSize(122, 30);
        backButton.setLayoutX(20);
        backButton.setLayoutY(235);
        backButton.setBackground(new Background(new BackgroundFill(Color.CORNFLOWERBLUE, new CornerRadii(5),Insets.EMPTY)));
        backButton.setFont(Font.font("Poppins", FontWeight.LIGHT, 13));
        backButton.setTextFill(Color.WHITE);
        
        backButton.setOnMousePressed((MouseEvent event) -> {
            window.close();
        });
        
        Scene scene = new Scene(anchor);
        Image icon = new Image("/View/logo2.png");
        
        window.getIcons().add(icon);
        window.setTitle("Surat Balasan Perusahaan");
        window.setScene(scene);
        window.show();
    }
}
