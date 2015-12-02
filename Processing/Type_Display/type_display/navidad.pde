String[] wishes = {
  "Merry Christmas",
  "Frohe Weihnachten",
  "Joyeux Noël",
  "Feliz Navidad"
};

void setup() {
  size(300,300);
  textFont( createFont( "Serif", 30 ));
  textAlign( CENTER );
  background(0);
}

int idx = 0;
float r = 0;
void draw() {
  if ( frameCount % 100 == 0 ) {
    idx = int(random(wishes.length));
    r = random( -PI/4, PI/4 );
  }
  fill(0,10);
  rect(0, 0, width, height );
  fill(255);
  translate( width/2, height/2 );
  rotate( r);
  text( wishes[idx], 0, 0 );
}