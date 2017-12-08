/*
 * (c) Word Find 1.0
 * Ingliz tilida so`z o`yini
 * Ushbu dastur kiritilgan
 * so`z ohirgi harfiga so`z topadi 
 * Dasturdan so`z o`yini va so`zlar bazasidan
 * so`zlarni o`rganish maqsadida foydalanish mumkin.
 ***
 ** Bekzodjon Norkuziev
 *  Author
 * 
*/
package sandbox;


import sandbox.Words;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

import javafx.stage.Stage;
import javafx.util.Duration;
import javax.swing.JOptionPane;



public class Sandbox extends Application {
    

    
     int a = 0;
     int b = 0;
     int c = 0;
     int d = 0;
     int el = 0;
     int f = 0;
     int g = 0;
     int h = 0;
     int i = 0;
     int j = 0;
     int k = 0;
     int l = 0;
     int m = 0;
     int n = 0;
     int o = 0;
     int p = 0;
     int q = 0;
     int r = 0;
     int s = 0;
     int t = 0;
     int u = 0;
     int v = 0;
     int w = 0;
     int x = 0;
     int y = 0;
     int z = 0;
     
     int score = 0;
     
    @Override
    public void start(Stage primaryStage) {
        
   // Pane pane = new Pane();
    
        Pane pane = new Pane();
        
    
        
   Text score_t = new Text(60, 460, "Ochko: " +  score);
   score_t.setScaleX(1.5);
   score_t.setScaleY(1.5);
   score_t.setFill(Color.DARKCYAN);
   pane.getChildren().add(score_t);
   score_t.setFont(new Font(20));
   
   final TextField textf = new TextField();
   pane.getChildren().add(textf);
   textf.setTranslateX(241);
   textf.setTranslateY(386);
   textf.setTooltip(new Tooltip("Ushbu so`z ohirgi harfiga mos so`z kiriting"));
   
   
   final Text head = new Text(245, 55, "Berilgan so`zning ohirgi "
                + "\nharfiga mos so`z kiriting");
    pane.getChildren().add(head);
    head.setScaleX(1.5);
    head.setFill(Color.ALICEBLUE);
    head.setScaleY(1.5);
    head.setFont(new Font("Serif", 16));
   // head.setFill(Color.INDIGO);
    
    Image help = new Image(getClass().getResourceAsStream("JList.png"));
    ImageView img = new ImageView(help);
    pane.getChildren().add(img);
    img.setFitHeight(60);
    img.setFitWidth(60);
    img.setTranslateX(38);
    img.setTranslateY(30);
    
    //Score Plus
    Text score_plus = new Text(200, 460, "");
    score_plus.setScaleX(1.5);
    score_plus.setScaleY(1.5);
    score_plus.setFill(Color.SPRINGGREEN);
    pane.getChildren().add(score_plus);
    score_plus.setFont(new Font(20));
    
    Circle circ = new Circle(610, 500, 88);
        circ.setFill(Color.AQUAMARINE);
        pane.getChildren().add(circ);
        
    // Congratulation
    Text congrats = new Text(568, 458, "");
    congrats.setScaleX(1.3);
    congrats.setScaleY(1.3);
    congrats.setFill(Color.TEAL);
    pane.getChildren().add(congrats);
    congrats.setFont(new Font(15));
    
    final String[] congrats_list = {"Qoyil", "Barakalla", "Zo`r", "To`g`ri", "Juda\nyaxshi"};
    
    
    // Logo hint
    img.setOnMouseEntered(e->{
        img.setScaleX(1.2);
        img.setScaleY(1.2);
        
        head.setText("Ingliz tilida so`z o`yini");
    });
    img.setOnMouseExited(e->{
        img.setScaleX(1);
        img.setScaleY(1);
        
        head.setText("Berilgan so`zning ohirgi "
                + "\nharfiga mos so`z kiriting");
    });
    
       
        
    
   
   final Text word = new Text(280, 378, "");
   pane.getChildren().add(word);
   
   final Text test = new Text(280, 378, "");
   //pane.getChildren().add(word);
   
 
   
   final Text ai_text = new Text(40, 40, "");
   pane.getChildren().add(ai_text);
   
  
    
  //beginning of algorithm
               
        
                ArrayList <String> used_words = new ArrayList<>();
        
		ArrayList<String> words = new ArrayList<>();
                
                ArrayList <String> A_Letter = new ArrayList<>();
                ArrayList <String> B_Letter = new ArrayList<>();
                ArrayList <String> C_Letter = new ArrayList<>();
                ArrayList <String> D_Letter = new ArrayList<>();
                ArrayList <String> E_Letter = new ArrayList<>();
                ArrayList <String> F_Letter = new ArrayList<>();
                ArrayList <String> G_Letter = new ArrayList<>();
                ArrayList <String> H_Letter = new ArrayList<>();
                ArrayList <String> I_Letter = new ArrayList<>();
                ArrayList <String> J_Letter = new ArrayList<>();
                ArrayList <String> K_Letter = new ArrayList<>();
                ArrayList <String> L_Letter = new ArrayList<>();
                ArrayList <String> M_Letter = new ArrayList<>();
                ArrayList <String> N_Letter = new ArrayList<>();
                ArrayList <String> O_Letter = new ArrayList<>();
                ArrayList <String> P_Letter = new ArrayList<>();
                ArrayList <String> Q_Letter = new ArrayList<>();
                ArrayList <String> R_Letter = new ArrayList<>();
                ArrayList <String> S_Letter = new ArrayList<>();
                ArrayList <String> T_Letter = new ArrayList<>();
                ArrayList <String> U_Letter = new ArrayList<>();
                ArrayList <String> V_Letter = new ArrayList<>();
                ArrayList <String> W_Letter = new ArrayList<>();
                ArrayList <String> X_Letter = new ArrayList<>();
                ArrayList <String> Y_Letter = new ArrayList<>();
                ArrayList <String> Z_Letter = new ArrayList<>();
		
		
                   InputStream fileIs = Sandbox.class.getResourceAsStream("Dict.txt");
		
		// Input text dictionary
		try (BufferedReader br = new BufferedReader(new InputStreamReader(fileIs))) {
		    String s;
		    while ((s = br.readLine()) != null) {
		       // process the line.
                       if(s.startsWith("a")) A_Letter.add(s);
                                else if (s.startsWith("b")) B_Letter.add(s);
                                else if (s.startsWith("c")) C_Letter.add(s);
                                else if (s.startsWith("d")) D_Letter.add(s);
                                else if (s.startsWith("e")) E_Letter.add(s);
                                else if (s.startsWith("f")) F_Letter.add(s);
                                else if (s.startsWith("g")) G_Letter.add(s);
                                else if (s.startsWith("h")) H_Letter.add(s);
                                else if (s.startsWith("i")) I_Letter.add(s);
                                else if (s.startsWith("j")) J_Letter.add(s);
                                else if (s.startsWith("k")) K_Letter.add(s);
                                else if (s.startsWith("l")) L_Letter.add(s);
                                else if (s.startsWith("m")) M_Letter.add(s);
                                else if (s.startsWith("n")) N_Letter.add(s);
                                else if (s.startsWith("o")) O_Letter.add(s);
                                else if (s.startsWith("p")) P_Letter.add(s);
                                else if (s.startsWith("q")) Q_Letter.add(s);
                                else if (s.startsWith("r")) R_Letter.add(s);
                                else if (s.startsWith("s")) S_Letter.add(s);
                                else if (s.startsWith("t")) T_Letter.add(s);
                                else if (s.startsWith("u")) U_Letter.add(s);
                                else if (s.startsWith("v")) V_Letter.add(s);
                                else if (s.startsWith("w")) W_Letter.add(s);
                                else if (s.startsWith("x")) X_Letter.add(s);
                                else if (s.startsWith("y")) Y_Letter.add(s);
                                else if (s.startsWith("z")) Z_Letter.add(s);
		    	
		    }
                    
		} catch (IOException ex) {
            Logger.getLogger(Sandbox.class.getName()).log(Level.SEVERE, null, ex);
        }
                
                InputStream fileI = Sandbox.class.getResourceAsStream("Dict.txt");
		
		// now just do something with your file
		try (BufferedReader br = new BufferedReader(new InputStreamReader(fileI))) {
		    String s;
		    while ((s = br.readLine()) != null) {
		       // process the line.
                       words.add(s);
		    	
		    }
                    
		} catch (IOException ex) {
            Logger.getLogger(Sandbox.class.getName()).log(Level.SEVERE, null, ex);
        }
                
		
	
		Collections.shuffle(A_Letter);
		Collections.shuffle(B_Letter);
		Collections.shuffle(C_Letter);
		Collections.shuffle(D_Letter);
		Collections.shuffle(E_Letter);
		Collections.shuffle(F_Letter);
		Collections.shuffle(G_Letter);
		Collections.shuffle(H_Letter);
		Collections.shuffle(I_Letter);
		Collections.shuffle(J_Letter);
		Collections.shuffle(K_Letter);
		Collections.shuffle(L_Letter);
		Collections.shuffle(M_Letter);
		Collections.shuffle(N_Letter);
		Collections.shuffle(O_Letter);
		Collections.shuffle(P_Letter);
		Collections.shuffle(Q_Letter);
		Collections.shuffle(R_Letter);
		Collections.shuffle(S_Letter);
		Collections.shuffle(T_Letter);
		Collections.shuffle(U_Letter);
		Collections.shuffle(V_Letter);
		Collections.shuffle(W_Letter);
		Collections.shuffle(X_Letter);
		Collections.shuffle(Y_Letter);
		Collections.shuffle(Z_Letter);
		
		
        
    
    //end of algorithm
    
    // Random word for beginning
    String ai_word="";
        Random rand = new Random();
        int ran=rand.nextInt(10);
       // System.out.println(ran);
        
        if(ran==0) {
         ai_word= A_Letter.get(0);
          ai_text.setText(ai_word);
        }
        else if(ran==1){
        ai_word = B_Letter.get(0);
        ai_text.setText(ai_word);
        }
        else if(ran==2){
        ai_word = C_Letter.get(0);
        ai_text.setText(ai_word);
        }
        else if(ran==3){
        ai_word = D_Letter.get(0);
        ai_text.setText(ai_word);
        }
        else if(ran==4){
        ai_word = E_Letter.get(0);
        ai_text.setText(ai_word);
        }
        else if(ran==5){
        ai_word = F_Letter.get(0);
        ai_text.setText(ai_word);
        }
        else if(ran==6){
        ai_word = G_Letter.get(0);
        ai_text.setText(ai_word);
        }
        else if(ran==7){
        ai_word = H_Letter.get(0);
        ai_text.setText(ai_word);
        }
        else if(ran==8){
        ai_word = I_Letter.get(0);
        ai_text.setText(ai_word);
        }
        else if(ran==9){
        ai_word = J_Letter.get(0);
        ai_text.setText(ai_word);
        }
        
        
        ai_text.setScaleX(3);
        ai_text.setScaleY(3);
        
        ai_text.setTranslateX(468);
        ai_text.setTranslateY(214);
        
        
        
        PathTransition pt10 = new PathTransition(Duration.millis(1200), new Line(150, 250, 300, 250), ai_text);
        pt10.setCycleCount(1);
        pt10.play();
        
        FadeTransition ft20 = new FadeTransition(Duration.millis(1800), ai_text);
        ft20.setFromValue(0.1);
        ft20.setToValue(1.0);
        ft20.setCycleCount(1);
        ft20.play();
        
        
        
    
    // textfield action
    textf.setOnAction(e ->{
 
        //head.setOpacity(0);
        
        
        String my_word = textf.getText().toString();
        my_word = my_word.toLowerCase();
        int my_last_char = my_word.length()-1;
        
        String ai_word_copy = ai_text.getText().toString();
        int ai_last_char = ai_word_copy.length()-1;
        
        
        
        word.setFill(Color.BLACK);
        if(words.contains(my_word) && !(used_words.contains(my_word))){
        if(my_word.charAt(0)==ai_word_copy.charAt(ai_last_char)){
            
        word.setText(my_word);
        textf.clear();
        
        word.setScaleX(3);
        word.setScaleY(3);
        
        score+=my_word.length();
        score_t.setText("Ochko: " + score);
        
        PathTransition pt = new PathTransition(Duration.millis(800), new Line(150, 378, 150, 214), word);
        pt.setCycleCount(1);
        pt.play();
        
        FadeTransition ft = new FadeTransition(Duration.millis(800), word);
        ft.setFromValue(0.1);
        ft.setToValue(1.0);
        ft.setCycleCount(1);
        ft.play();
        
        //score plus adding
        String myword_len="";
        myword_len+=my_word.length();
        score_plus.setText("+"+myword_len);
        //score plus fade animation
        FadeTransition ft_score = new FadeTransition(Duration.millis(750), score_plus);
        ft_score.setFromValue(1.0);
        ft_score.setToValue(0.0);
        ft_score.setCycleCount(1);
        ft_score.play();
        
        //random for congrats
        Random rando = new Random();
        int ra = rando.nextInt(5);
        
        //Congrats fade animation
        congrats.setText(congrats_list[ra]);
        FadeTransition ft_congrats = new FadeTransition(Duration.millis(1850), congrats);
        ft_congrats.setFromValue(1.0);
        ft_congrats.setToValue(0.0);
        ft_congrats.setCycleCount(1);
        ft_congrats.play();
        
        //// getting the words
        int last_char = my_word.length()-1;
        if((my_word.toLowerCase().charAt(last_char)=='a')){
            ai_text.setText(A_Letter.get(a));
            used_words.add(my_word);
            used_words.add(A_Letter.get(a));
            A_Letter.remove(a);
            a++;
        }
        else if((my_word.toLowerCase().charAt(last_char)=='b')){
            ai_text.setText(B_Letter.get(b));
            used_words.add(my_word);
            used_words.add(B_Letter.get(b));
            B_Letter.remove(b);
            b++;
        }
        else if((my_word.toLowerCase().charAt(last_char)=='c')){
            ai_text.setText(C_Letter.get(c));
            used_words.add(my_word);
            used_words.add(C_Letter.get(c));
            C_Letter.remove(c);
            c++;
            
        }
        else if((my_word.toLowerCase().charAt(last_char)=='d')){
            ai_text.setText(D_Letter.get(d));
            used_words.add(my_word);
            used_words.add(D_Letter.get(d));
            D_Letter.remove(d);
            d++;
           
        }
        else if((my_word.toLowerCase().charAt(last_char)=='e')){
            ai_text.setText(E_Letter.get(el));
            used_words.add(my_word);
            used_words.add(E_Letter.get(el));
            E_Letter.remove(el);
            el++;
        }
        else if((my_word.toLowerCase().charAt(last_char)=='f')){
            ai_text.setText(F_Letter.get(f));
            used_words.add(my_word);
            used_words.add(F_Letter.get(f));
            F_Letter.remove(f);
            f++;
        }
        else if((my_word.toLowerCase().charAt(last_char)=='g')){
            ai_text.setText(G_Letter.get(g));
            used_words.add(my_word);
            used_words.add(G_Letter.get(g));
            G_Letter.remove(g);
            g++;
        }
        else if((my_word.toLowerCase().charAt(last_char)=='h')){
            ai_text.setText(H_Letter.get(h));
            used_words.add(my_word);
            used_words.add(H_Letter.get(h));
            H_Letter.remove(h);
            h++;
        }
        else if((my_word.toLowerCase().charAt(last_char)=='i')){
            ai_text.setText(I_Letter.get(i));
            used_words.add(my_word);
            used_words.add(I_Letter.get(i));
            I_Letter.remove(i);
            i++;
        }
        else if((my_word.toLowerCase().charAt(last_char)=='j')){
            ai_text.setText(J_Letter.get(j));
            used_words.add(my_word);
            used_words.add(J_Letter.get(j));
            J_Letter.remove(j);
            j++;
        }
        else if((my_word.toLowerCase().charAt(last_char)=='k')){
            ai_text.setText(K_Letter.get(k));
            used_words.add(my_word);
            used_words.add(K_Letter.get(k));
            K_Letter.remove(k);
            k++;
        }
        else if((my_word.toLowerCase().charAt(last_char)=='l')){
            ai_text.setText(L_Letter.get(l));
            used_words.add(my_word);
            used_words.add(L_Letter.get(l));
            L_Letter.remove(l);
            l++;
        }
        else if((my_word.toLowerCase().charAt(last_char)=='m')){
            ai_text.setText(M_Letter.get(m));
            used_words.add(my_word);
            used_words.add(M_Letter.get(m));
            M_Letter.remove(m);
            m++;
        }
        else if((my_word.toLowerCase().charAt(last_char)=='n')){
            ai_text.setText(N_Letter.get(n));
            used_words.add(my_word);
            used_words.add(N_Letter.get(n));
            N_Letter.remove(n);
            n++;
        }
        else if((my_word.toLowerCase().charAt(last_char)=='o')){
            ai_text.setText(O_Letter.get(o));
            used_words.add(my_word);
            used_words.add(O_Letter.get(o));
            O_Letter.remove(o);
            o++;
        }
        else if((my_word.toLowerCase().charAt(last_char)=='p')){
            ai_text.setText(P_Letter.get(p));
            used_words.add(my_word);
            used_words.add(P_Letter.get(p));
            P_Letter.remove(p);
            p++;
        }
        else if((my_word.toLowerCase().charAt(last_char)=='q')){
            ai_text.setText(Q_Letter.get(q));
            used_words.add(my_word);
            used_words.add(Q_Letter.get(q));
            A_Letter.remove(q);
            q++;
        }
        else if((my_word.toLowerCase().charAt(last_char)=='r')){
            ai_text.setText(R_Letter.get(r));
            used_words.add(my_word);
            used_words.add(R_Letter.get(r));
            R_Letter.remove(r);
            r++;
        }
        else if((my_word.toLowerCase().charAt(last_char)=='s')){
            ai_text.setText(S_Letter.get(s));
            used_words.add(my_word);
            used_words.add(S_Letter.get(s));
            S_Letter.remove(s);
            s++;
        }
        else if((my_word.toLowerCase().charAt(last_char)=='t')){
            ai_text.setText(T_Letter.get(t));
            used_words.add(my_word);
            used_words.add(T_Letter.get(t));
            T_Letter.remove(t);
            t++;
        }
        else if((my_word.toLowerCase().charAt(last_char)=='u')){
            ai_text.setText(U_Letter.get(u));
            used_words.add(my_word);
            used_words.add(U_Letter.get(u));
            U_Letter.remove(u);
            u++;
        }
        else if((my_word.toLowerCase().charAt(last_char)=='v')){
            ai_text.setText(V_Letter.get(v));
            used_words.add(my_word);
            used_words.add(V_Letter.get(v));
            V_Letter.remove(v);
            v++;
        }
        else if((my_word.toLowerCase().charAt(last_char)=='w')){
            ai_text.setText(W_Letter.get(w));
            used_words.add(my_word);
            used_words.add(W_Letter.get(w));
            W_Letter.remove(w);
            w++;
        }
        else if((my_word.toLowerCase().charAt(last_char)=='x')){
            ai_text.setText(X_Letter.get(x));
            used_words.add(my_word);
            used_words.add(X_Letter.get(x));
            X_Letter.remove(x);
            x++;
        }
        else if((my_word.toLowerCase().charAt(last_char)=='y')){
            ai_text.setText(Y_Letter.get(y));
            used_words.add(my_word);
            used_words.add(Y_Letter.get(y));
            Y_Letter.remove(y);
            y++;
        }
        else if((my_word.toLowerCase().charAt(last_char)=='z')){
            ai_text.setText(Z_Letter.get(z));
            used_words.add(my_word);
            used_words.add(Z_Letter.get(z));
            Z_Letter.remove(z);
            z++;
        }
        
        
        ///
        ai_text.setScaleX(3);
        ai_text.setScaleY(3);
        
        PathTransition pt2 = new PathTransition(Duration.millis(1200), new Line(468, 110, 468, 214), ai_text);
        pt2.setCycleCount(1);
        pt2.play();
        
        FadeTransition ft2 = new FadeTransition(Duration.millis(800), ai_text);
        ft2.setFromValue(0.1);
        ft2.setToValue(1.0);
        ft2.setCycleCount(1);
        ft2.play();
        
        
        
        
        }else{
          word.setText("Ohirgi harfiga mos so`z toping");
          textf.clear();
        word.setScaleX(1.5);
        word.setScaleY(1.5);
        word.setFill(Color.SLATEBLUE);
        
        PathTransition pt = new PathTransition(Duration.millis(800), new Line(300, 365, 300, 158), word);
        pt.setCycleCount(1);
        pt.play();
        
        FadeTransition ft = new FadeTransition(Duration.millis(800), word);
        ft.setFromValue(0.1);
        ft.setToValue(1.0);
        ft.setCycleCount(1);
        ft.play();
        }
        //if ends
        }else if(used_words.contains(my_word)){
        word.setText("\t  Bu so`z \n\tfoydalanildi");
        textf.clear();
        word.setScaleX(1.5);
        word.setScaleY(1.5);
        word.setFill(Color.SLATEBLUE);
        
        PathTransition pt = new PathTransition(Duration.millis(800), new Line(300, 365, 300, 158), word);
        pt.setCycleCount(1);
        pt.play();
        
        FadeTransition ft = new FadeTransition(Duration.millis(800), word);
        ft.setFromValue(0.1);
        ft.setToValue(1.0);
        ft.setCycleCount(1);
        ft.play();
        }
        else{
        word.setText("\t Bu so`z bazada \n\t  mavjud emas.\nBoshqa so`z kiritib ko`ring.");
        textf.clear();
        word.setScaleX(1.2);
        word.setScaleY(1.2);
        
        
        PathTransition pt = new PathTransition(Duration.millis(800), new Line(300, 365, 300, 158), word);
        pt.setCycleCount(1);
        pt.play();
        
        FadeTransition ft = new FadeTransition(Duration.millis(800), word);
        ft.setFromValue(0.1);
        ft.setToValue(1.0);
        ft.setCycleCount(1);
        ft.play();
        
       
          
       }
        
        
     
    }); //textfield function
    
    
    
    
    // primaryStage.getIcons().add(new Image("JList.png"));
    // pane.setStyle("-fx-background: gold");
     Scene scene = new Scene(pane, 630, 490);
     scene.getStylesheets().add("sandbox/styles.css");
     primaryStage.getIcons().add(help);
     
     primaryStage.setTitle("Word Find");
     primaryStage.setResizable(false);
     primaryStage.setScene(scene);
     primaryStage.show();
    
    } //end of main

    
    public static void main(String[] args){
        launch(args);
      
    }
    
}//end of class
