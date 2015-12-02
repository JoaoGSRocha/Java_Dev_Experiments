import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class type_display extends PApplet {

PImage mural, cargo, boot01, boot02;
String inputedText  = "";
Boolean printRect= false;
String[] wordIncluded = {"banana","mural","hey", "computer", "command", "cargo", "boot01", "boot02"};
String[] sentenceIncluded = {"banana","mural","hey"};
static short sWidth = 860;
static short sHeight = 640;
short inputLine = 90;
public void setup(){
  mural = loadImage("mural.jpg");
  cargo = loadImage("CARGO.jpg");
  boot01 = loadImage("bootstrap_001.jpg");
  boot02 = loadImage("bootstrap_002.jpg");
  
  background(0);
}

public void keyReleased() {
    if(key!= BACKSPACE)
      inputedText+=key;
}
public void Print__Image(Boolean Prect) {
  //if (inputedText.matches(".*"+wordIncluded+".*"))
    //Prect=true;
}
public void draw(){
  text(inputedText, 10, inputLine); 
  Print__Image(printRect);
  for(int i=0; i<wordIncluded.length;i++)
  {
    switch(wordIncluded[i])
    {
       case "hey":
         if (inputedText.matches(".*"+wordIncluded[i]+".*"))
          printRect=true;
       break;
       case "banana":
         if (inputedText.matches(".*"+wordIncluded[i]+".*"))
          printRect=true;
        break;
       case "mural":
         if (inputedText.matches(".*"+wordIncluded[i]+".*"))
           image(mural, 30, sHeight*0.5f);
       break;
       case "computer":
         if (inputedText.matches(".*"+wordIncluded[i]+".*"))
           text("What do you need me to do?", 10, 150);
       break;
       case "boot01":
         if (inputedText.matches(".*"+wordIncluded[i]+".*"))
           image(boot01, 30, sHeight*0.3f);
       break;
       case "boot02":
         if (inputedText.matches(".*"+wordIncluded[i]+".*"))
           image(boot02, 30, sHeight*0.5f);
       break;       
       case "command":
         if (inputedText.matches(".*"+wordIncluded[i]+".*") && inputLine!=120)
         {
           inputedText="";
           text("Activate System", 10, 180);
           inputLine=120;
         }
       break;
       case "cargo":
         if (inputedText.matches(".*"+wordIncluded[i]+".*"))
           image(cargo, 340, 40);    
       break;
        default:
          clear();
          printRect=false;

    }
  }
  if (keyPressed) {
    if (key == 'b' || key == 'B') {
      fill(0);
    }
    if(key== BACKSPACE && inputedText!="")
    {
      inputLine=90;
      inputedText="";
      printRect=false;
      clear();
    }
  } else {
    fill(255);
  }
  if(printRect)
    rect(660, 60, 100, 100);
  //Testing Rectangular for debugging purposes
  //rect(44,44,44,44);
}
  public void settings() {  size(860,640); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "type_display" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
