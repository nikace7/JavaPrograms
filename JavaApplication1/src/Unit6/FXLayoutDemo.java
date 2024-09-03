/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit6;

/**
 *
 * @author khatr
 */
import javafx.application.*;
import javafx.stage.*;//main window
import javafx.scene.*;
import javafx.scene.control.*;//button,textfield
import javafx.scene.layout.*;//diff layout
import javafx.event.*;

public class FXLayoutDemo extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception{
        //in javafx, stage is main window, scene is a sub window. controls are put in layout, layout is added into 
        //scene and scene is finally added into stage
        Button b1 = new Button("button1");
        Button b2 = new Button("button2");
        Button b3 = new Button("button3");
        Button b4 = new Button("button4");
        Label l1 = new Label("result");
//        //FLowPane: added content from left to right and if there is no any space then places the content into next line.
//        FlowPane fp = new FlowPane();
//        fp.setHgap(10);// Horizontal gap between comp
//        fp.getChildren().add(b1);
//        fp.getChildren().add(b2);
//        fp.getChildren().add(b3);
//        fp.getChildren().add(l1);

//GridPane:add comp in term of row and col
//GridPane gp = new GridPane();
//gp.add(b1,0,0);//adding in 0,0
//gp.add(b2,1,0);
//gp.add(b3,2,0);
//gp.add(l1,0,1);

////BorderPane: add comp in form of direction 
//BorderPane bp = new BorderPane();
//bp.setCenter(l1);
//bp.setLeft(b1);
//bp.setRight(b2);
//bp.setTop(b3);
//bp.setBottom(b4);

////HBOx: set all component horizontally
//HBox hb = new HBox();
//hb.getChildren().addAll(b1,b2,b3,b4,l1);

//VBOx: set all component vertically
VBox vb= new VBox();
vb.getChildren().addAll(b1,b2,b3,b4,l1);
        //handling action event
        b1.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent t) {
                l1.setText("button1 is clicked");
            }
            
        });
        //add layout into scene
        Scene sc = new Scene(vb,300,300);
        stage.setTitle("Layout demo");
        stage.setScene(sc);
        stage.show();
        
    }
    
}
