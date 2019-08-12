package finalwar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
/**
 * @author m
 */


public class FinalWar extends Application {//test
    
    War war= new War();
    
   @Override
   public void start (Stage primaryStage) {
      List<Card> cardDeck = new ArrayList<>();

      for (int x = 0; x < 4; x++) {          //for loop using the 4 suits
         for (int y = 2; y < 15; y++) {     // for loop for 13 for cards 2-10 and faced cards1
            war.cardDeck.add(new Card(x, y)); //create new card then use add method to combine to array list
         } //end cards for loop
      }//end suit for

      Collections.shuffle(war.cardDeck, new Random()); //deck shuffler


      Player p1 = new Player();
      p1.getDeck().addAll(war.cardDeck.subList(0, 26)); 
     Player p2 = new Player();
     p2.getDeck().addAll(war.cardDeck.subList(26, war.cardDeck.size()));
     war.add(p1);
      war.add(p2);
   

      HBox hBox = new HBox(5);
      hBox.setPadding(new Insets(5, 5, 5, 5));
      hBox.setStyle("-fx-background-color: blue");


      ImageView im1 = new ImageView(getClass().getResource("blue_back.png").toExternalForm());
      im1.setFitWidth(250);
      im1.setPreserveRatio(true);
      ImageView im2 = new ImageView(getClass().getResource("rectangle.png").toExternalForm());
      im2.setFitWidth(250);
      im2.setPreserveRatio(true);
      ImageView im3 = new ImageView(getClass().getResource("rectangle.png").toExternalForm());
      im3.setFitWidth(250);
      im3.setPreserveRatio(true);
      ImageView im4 = new ImageView(getClass().getResource("blue_back.png").toExternalForm());
      im4.setFitWidth(250);
      im4.setPreserveRatio(true);
      
      hBox.getChildren().add(im1);
      hBox.getChildren().add(im2);
      hBox.getChildren().add(im3);
      hBox.getChildren().add(im4);


      VBox vBox1 = new VBox(5);
      HBox hBox1 = new HBox(5);
      vBox1.setPadding(new Insets(5, 5, 5, 5));
      Label label1 = new Label();
      Label label2 = new Label();


      Button btFlip = new Button("Flip Card");
      btFlip.setOnAction((ActionEvent event) -> {
         System.out.println("Flip");
         try {
            war.play(im2, im3, label1, label2);
         }
         catch (InterruptedException ex) {
            Logger.getLogger(FinalWar.class.getName()).log(Level.SEVERE, null, ex);
         }
      });

      Scene scene = new Scene(vBox1);

      vBox1.getChildren().add(hBox);
      hBox1.getChildren().add(btFlip);
      vBox1.getChildren().add(label1);
      vBox1.getChildren().add(label2);
      vBox1.getChildren().add(hBox1);
      hBox1.setPadding(new Insets(5, 5, 5, 5));


      primaryStage.setTitle("War Game");
      primaryStage.setScene(scene);
      primaryStage.show();
      System.out.println("Let the War begin!!!\n\nWe will now deal the cards. Best of luck to both players\n ");
   }

   public static void main (String[] args) {

      launch(args);

   }
}