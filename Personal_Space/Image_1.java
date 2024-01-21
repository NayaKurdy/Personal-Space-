import processing.core.*;
class image1 {
  private PApplet p;
  //facial coordinates for the first character
  float x1;
  float y1;
  float x2;
  float y2;

  // We declare the needed variables

  public image1(PApplet p, float tempX1, float tempX2, float tempY1, float tempY2) {
    this.p = p;
    x1 = tempX1;
    x2 = tempX2;
    y1 = tempY1;
    y2 = tempY2;
  }

  public void display1 () {
    p.background(54, 178, 242);

    p.noStroke();
    p.fill(152, 234, 184);
    p.beginShape ();
    p.curveVertex(100, 800);
    p.curveVertex(100, 800);
    p.curveVertex(92, 685);
    p.curveVertex(117, 588);
    p.curveVertex(95, 400);
    p.curveVertex(200, 250);
    p.curveVertex(400, 150);
    p.curveVertex(690, 350);
    p.curveVertex(680, 550);
    p.curveVertex(713, 654);
    p.curveVertex(700, 800);
    p.curveVertex(700, 800);
    p.endShape();

    p.fill(240, 152, 218);
    p.stroke(0);
    p.beginShape();
    p.curveVertex(241, 800);
    p.curveVertex(201, 800);
    p.curveVertex(170, 690);
    p.curveVertex(151, 558);
    p.curveVertex(145, 510);
    p.curveVertex(163, 483);
    p.curveVertex(200, 497);
    p.curveVertex(220, 543);
    p.curveVertex(232, 575);
    p.curveVertex(240, 640);
    p.curveVertex(260, 579);
    p.curveVertex(289, 400);
    p.curveVertex(320, 340);
    p.curveVertex(400, 310);
    p.curveVertex(480, 330);
    p.curveVertex(522, 400);
    p.curveVertex(537, 506);
    p.curveVertex(546, 640);
    p.curveVertex(564, 601);
    p.curveVertex(571, 543);
    p.curveVertex(600, 497);
    p.curveVertex(636, 488);
    p.curveVertex(654, 510);
    p.curveVertex(649, 558);
    p.curveVertex(636, 708);
    p.curveVertex(608, 800);
    p.curveVertex(581, 800);
    p.endShape();

    p.fill(0);
    p.circle(x1, y1, 10);
    p.circle(x2, y2, 10);
    p.fill(255);
    p.arc(404, 458, 80, 50, 0, p.PI, p.CHORD);
  }
}
