PImage mural;
String inputedText=" ";
String[] wordIncluded = {"Banana","mural","hey"};
boolean[] wordMatch = new boolean[wordIncluded.length];
byte[] ID = new byte[wordIncluded.length];
byte imgID= 0;
void start()
{
  mural = loadImage("mural.jpg");
}
void draw()
{
  //Loop through all the possible words stored in the arraylist
  for(int i=0; i<wordIncluded.length; i++)
  {
      //Check for  
      if(wordIncluded[i]=="mural"){
        wordMatch[i] = true;
        imgID = byte.parseInt(i);
      }
  }
  if(wordMatch[ID[imgID]])
    image(mural, 0, 0); 
  
}