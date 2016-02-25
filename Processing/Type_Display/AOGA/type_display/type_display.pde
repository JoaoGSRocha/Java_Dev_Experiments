PImage mural, cargo, boot01, boot02;
String inputedText  = "";
Boolean printRect= false;
String[] wordIncluded = {"banana","aam yok","hey", "computer", "command", "nhi yok", "mega vista", "aam tar"};
String[] sentenceIncluded = {"banana","aam yok","hey", "mega vista", "nhi yok", "aam tar"};
static short sWidth = 860;
static short sHeight = 640;
short inputLine = 90;
void setup(){
  mural = loadImage("mural.jpg");
  cargo = loadImage("CARGO.jpg");
  boot01 = loadImage("bootstrap_001.jpg");
  boot02 = loadImage("bootstrap_002.jpg");
  size(860,640);
  background(0);
}

void keyReleased() {
    if(key!= BACKSPACE)
      inputedText+=key;
}
void Print__Image(Boolean Prect) {
  //if (inputedText.matches(".*"+wordIncluded+".*"))
    //Prect=true;
}
void draw(){
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
       case "aam yok":
         if (inputedText.matches(".*"+wordIncluded[i]+".*"))
           image(mural, 30, sHeight*0.9);
       break;
       case "computer":
         if (inputedText.matches(".*"+wordIncluded[i]+".*"))
           text("What do you need me to do?", 10, 150);
       break;
       case "mega vista":
         if (inputedText.matches(".*"+wordIncluded[i]+".*"))
           image(boot01, 30, sHeight*0.3);
       break;
       case "aam tar":
         if (inputedText.matches(".*"+wordIncluded[i]+".*"))
           image(boot02, 30, sHeight*0.5);
       break;       
       case "command":
         if (inputedText.matches(".*"+wordIncluded[i]+".*") && inputLine!=120)
         {
           inputedText="";
           text("Activate System", 10, 180);
           inputLine=120;
         }
       break;
       case "nhi yok":
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