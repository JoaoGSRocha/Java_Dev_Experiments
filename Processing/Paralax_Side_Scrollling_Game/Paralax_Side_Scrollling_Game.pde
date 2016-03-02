float x01 = 0;
int y01 = 50;
int txtX = 100;
int y02 = 0;
boolean layer= true;
String txtCntnt= "Here we go...";
void setup() {
  size(400, 400);
  stroke(255);
}
void start(){
  
}
void draw() {

  if (keyPressed) {
    if (key == 'a' || key == 'A') {
      x01-=0.7; 
    }
    if (key == 'd' || key == 'D') {
      x01+=3;
    } 
  } else {
    //fill(255);
  }
  x01++;
  //if(hits the edge of the screen starts again but the next layer)
  if (x01>=400){
    x01= 0;
    y01+= 40;
    txtX= 100;
    txtCntnt="Here we go...";
  }
  if(x01>=100 && y01==50)
    txtCntnt= "Hey how are you?";
  if(x01>=140 && y01==90)
    txtCntnt= "Whatssssup?";
  if(x01>=180 && y01==130){
    txtCntnt= "How are you doing, in this lovely day?";
    txtX = 20;
  }
  if(x01>=40 && y01==170)
  {
    txtCntnt= "Hey.";
    txtX = 180;
  }

  if(y01>400){
    x01= 0;
    y01= 50;  
  }
  rect(25, 25, 50, 50);

  background(192, 64, 0);
  rect(x01, y01, 11, 11);
  rect(105, 50, 11, 11);
  rect(145, 90, 11, 11);
  rect(185, 130, 11, 11);
  rect(45,  170, 11, 11);
  textSize(20);
  text(txtCntnt, txtX, 40);
}