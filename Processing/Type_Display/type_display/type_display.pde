String inputedText  = "";
Boolean printRect= false;
void setup(){
  size(440,440);
  background(0);
}

void keyReleased() {
    if(key!= BACKSPACE)
      inputedText+=key; 
}
void Print__Image(Boolean Prect) {
  if (inputedText.matches(".*hey.*"))
    Prect=true;
}
void draw(){
      Print__Image(printRect);
      if (inputedText.matches(".*hey.*"))
        printRect=true;
      else{
        printRect=false;
        clear();
      }
      if (keyPressed) {
      if (key == 'b' || key == 'B') {
        fill(0);
      }
      if(key== BACKSPACE)
      {
        inputedText="";
        clear();
      }
    } else {
      fill(255);
    }
    if(printRect)
      rect(60, 60, 100, 100);
    rect(44,44,44,44);
    text(inputedText, 10, 90); 
}