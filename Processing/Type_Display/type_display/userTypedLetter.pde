    String buffer;
void setup(){
  size(860,640);
  background(77);
}


    // we call this method in the sketch
    void startGettingUserInput() {
      buffer = "";
      if(javascript) {
        javascript.startGettingUserInput(this);
      }
    }

    // this method gets called by javascript every time a letter is typed
    void userTypedLetter(int keyCode) {
      if(keyCode == 10 || keyCode == 13) {
        // newline / return
        finishUserInput();
      }
      else { buffer += String.valueOf((char) keyCode); }
    }

    // we can call this when we see that the user is done
    void finishUserInput() {
      // do something with the contents of buffer
    }
