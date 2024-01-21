import processing.core.*;
class image3 extends image2 {
  private float xVelocity;
  
  public image3 (PApplet p, float tempX3, float tempX4, float tempX5, float tempX6, float tempY3, float tempY4, float tempY5, float tempY6, float tempxVelocity) {
    super(p, tempX3, tempX4, tempX5, tempX6, tempY3, tempY4, tempY5, tempY6);
    this.p = p;
    xVelocity = tempxVelocity;
  }
  public void move3 () {
    x5 -=xVelocity;
    x6 -=xVelocity;
    if (x5<583) {
      x5=583;
    }
    if (x6<670) {
      x6=670;
    }
  }


  public void cloud() {
    if (x5==583 && x6==670) {
      p.noStroke();
      p.fill(255);
      p.circle(462, 292, 30);
      p.circle(505, 242, 50);
      p.circle(557, 167, 100);
      p.circle(620, 161, 100);
      p.circle(664, 167, 100);
      p.circle(692, 139, 100);
      p.circle(650, 96, 100);
      p.circle(589, 95, 100);
      p.circle(522, 103, 100);
      p.circle(507, 146, 100);
    }
  }

  public void showText() {
    if (x5==583 && x6==670) {
      // p.textFont(customFont);
      p.fill(0);
      p.text("oh no", 490, 165);
    }
  }
}
