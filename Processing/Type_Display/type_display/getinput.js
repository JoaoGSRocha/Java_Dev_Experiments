function startGettingUserInput() {
  var e = document.createElement("input");
  e.type = "text";
  e.style.color = "transparent";
  e.style.backgroundColor = "transparent";
  e.style.border = "none";
  e.onkeyup = function(evt) {
                var event = evt | window.event;
                sketch.userTypedLetter(event.keyCode);
                if(event.keyCode == 10 || event.keyCode==13) {
                 document.body.removeChild(e);
                }
              }
  document.body.appendChild(e);
  e.focus();
}