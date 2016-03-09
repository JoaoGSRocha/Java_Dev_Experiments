float x01 = 0;
int y01 = 50;
int txtX = 100;
int diagX = 40;
int y02 = 0;
boolean layer= true;
String txtCntnt= "Here we go...";
String diagCntnt= "1- Swords, 2-Potions, 3- Missions";

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

  if(y01>300){
    x01= 0;
    y01= 50;  
    diagCntnt= "1- Swords, 2-Potions, 3- Missions";
    diagX=40;
  }

  if (keyPressed) {
    if (key == '1') {
      diagCntnt="1-Swords"; 
      diagX=140;
  }
    if (key == '2') {
      diagCntnt="2-Potions"; 
      diagX=140;
    }
    if (key == '3') {
      diagCntnt="3-Missions"; 
      diagX=140;
    }
}
  
  rect(25, 25, 50, 50);

  background(192, 64, 0);
  textSize(10);
  text("The Shop Owner", 70, 40);
  text("The Fish Merchant", 110, 80);
  text("The Crafstman", 150, 120);
  text("The Young Boy with a dream", 0, 160);
  
  fill(255, 255, 255);
  rect(x01, y01, 11, 11);
  rect(105, 50, 11, 11);
  rect(145, 90, 11, 11);
  rect(185, 130, 11, 11);
  rect(45,  170, 11, 11);
  rect(0, 300, 400, 400);
  textSize(20);
  text(txtCntnt, txtX, 20);
  color c = color(0, 0, 0);
  fill(c);
  text(diagCntnt, diagX, 340);

}

//void if()