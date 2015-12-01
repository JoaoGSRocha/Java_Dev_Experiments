PImage mural;
String inputedText  = "";
Boolean printRect= false;
String[] wordIncluded = {"banana","mural","hey", "computer", "command"};
String[] sentenceIncluded = {"banana","mural","hey"};
static short sWidth = 860;
static short sHeight = 640;
short inputLine = 90;
void setup(){
  mural = loadImage("mural.jpg");
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
       case "mural":
       if (inputedText.matches(".*"+wordIncluded[i]+".*"))
       {
         image(mural, 30, sHeight*0.5);
       }
       break;
       case "computer":
       if (inputedText.matches(".*"+wordIncluded[i]+".*"))
       {
         text("What do you need me to do?", 10, 150);
       }
       break;
       case "command":
       if (inputedText.matches(".*"+wordIncluded[i]+".*"))
       {
         inputedText="";
         text("Activate System", 10, 180);
         inputLine=120;
           
        }
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
    rect(60, 60, 100, 100);
  //Testing Rectangular for debugging purposes
  //rect(44,44,44,44);
}