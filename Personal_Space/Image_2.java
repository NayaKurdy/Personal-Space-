import processing.core.*;
class image2 {
  
  protected PApplet p;
  private float x3;
  private float y3;
  private float x4;
  private float y4;
  protected float x5;
  private float y5;
  protected float x6;
  private float y6;
  
  public image2() {
    
  }

  public image2(PApplet p, float tempX3, float tempX4, float tempX5, float tempX6, float tempY3, float tempY4, float tempY5, float tempY6) {
    this.p = p;
    x3 = tempX3;
    x4 = tempX4;
    x5 = tempX5;
    x6 = tempX6;
    y3 = tempY3;
    y4 = tempY4;
    y5 = tempY5;
    y6 = tempY6;
  }

  public void display2 () {
    p.background(54, 178, 242);

    p.noStroke();
    p.fill(152, 234, 184);
    p.beginShape();
    p.curveVertex(50, 800);
    p.curveVertex(50, 800);
    p.curveVertex(100, 200);
    p.curveVertex(450, 200);
    p.curveVertex(547, 373);
    p.curveVertex(573, 457);
    p.curveVertex(570, 567);
    p.curveVertex(593, 686);
    p.curveVertex(571, 800);
    p.curveVertex(571, 800);
    p.endShape();

    p.fill(240, 152, 218);
    p.stroke(0);
    p.beginShape();
    p.curveVertex(142, 800);
    p.curveVertex(142, 800);
    p.curveVertex(110, 795);
    p.curveVertex(100, 714);
    p.curveVertex(90, 562);
    p.curveVertex(108, 385);
    p.curveVertex(175, 283);
    p.curveVertex(265, 268);
    p.curveVertex(378, 311);
    p.curveVertex(431, 486);
    p.curveVertex(445, 598);
    p.curveVertex(445, 701);
    p.curveVertex(435, 800);
    p.curveVertex(435, 800);
    p.endShape();

    p.fill(0);
    p.circle(x3, y3, 10);
    p.circle(x4, y4, 10);
    p.line(235, 455, 299, 455);

    p.fill(252, 196, 105);
    p.beginShape();
    p.curveVertex(x5 - 66, 800);
    p.curveVertex(x5 - 66, 800);
    p.curveVertex(x5 - 94, 653);
    p.curveVertex(x5 - 65, 460);
    p.curveVertex(x5 + 53, 414);
    p.curveVertex(x5 + 157, 484);
    p.curveVertex(x5 + 205, 620);
    p.curveVertex(x5 + 213, 800);
    p.curveVertex(x5 + 213, 800);
    p.endShape();

    p.fill(0);
    p.circle(x5, y5, 10);
    p.circle(x6, y6, 10);
    p.fill(255);
    p.arc(x5 + 40, 543, 80, 50, 0, p.PI, p.CHORD);
  }
}
