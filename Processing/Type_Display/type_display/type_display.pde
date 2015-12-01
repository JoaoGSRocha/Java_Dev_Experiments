PImage mural;
String inputedText  = "";
Boolean printRect= false;
String[] wordIncluded = {"banana","mural","hey"};
String[] sentenceIncluded = {"banana","mural","hey"};
static short sWidth = 860;
static short sHeight = 640;
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
         image(mural, (width/2), sHeight*0.5);
         printRect=false;
        }
        break;
        default:
          printRect=false;
    }
  }
  if (keyPressed) {
    if (key == 'b' || key == 'B') {
      fill(0);
    }
    if(key== BACKSPACE && inputedText!="")
    {
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
  text(inputedText, 10, 90); 
}