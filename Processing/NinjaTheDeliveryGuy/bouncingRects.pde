class bouncingRects
{
  float obx, oby;
  float yInc=4;
  float obSpeed=15;

  bouncingRects()
  {
    obx = random(-500, -410);
    oby = random(80, 280);
  }

  //This would be a great time to use an abstract class and overwrite..
  //..the use of the obstacleBound in order to add the respawn functionality

  void bouncingRectsCalc(){
     obx++;
   oby+= yInc;
   if (this.oby>height-100 || this.oby<=0)
    this.yInc = -this.yInc;
   rect(obx, oby, 20, 20);
  }

  void obstacleFall()
  {
    if (obx> 800)
    {
      obx = random(-300, -100);
      oby = random(10, 220);
    }   
    //set obstacle boundaries
    if (ninja.position().x()>obx-5 && ninja.position().x()<obx+20)
    {
      if (ninja.position().y()>oby-5 && ninja.position().y()<oby+20)
      {
        ninja.moveTo(obx+20, ninja.position().y(), 0);
        ninja.setVelocity(ninja.velocity().x()*(-0.9), ninja.velocity().y(), 0);
        obx = random(180, 620);
        oby = random(-500, -300);
      if(numbObstacles<10){
        numbObstacles++;
        print(numbObstacles);
      }
      }
    }
  }
}