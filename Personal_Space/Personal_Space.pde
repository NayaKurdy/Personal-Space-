float x1=350, x2=460, x3=207, x4=317, x5=701, x6=788;
float y1=405, y2=405, y3=405, y4=405, y5=500, y6=500;
float xVelocity = 1;
PFont customFont;
//We create instances of the classes based on the order of that class in the comic strip
image1 comic1;
image2 comic2;
image3 comic3;

//We then do the setup, fof size any number would work as long as the width and height are equal and we chose 800 for a clearer result
void setup() {
  size(800, 800);
  comic1 = new image1(this, x1, x2, y1, y2);
  comic2 = new image2(this,x3, x4, x5, x6, y3, y4, y5, y6);
  comic3 = new image3(this,x3, x4, x5, x6, y3, y4, y5, y6, xVelocity);
  customFont = createFont("adamwarrenpro.ttf", 75);
  textFont(customFont);
  String reference = "Source: webcomicname.com";
  println(reference);
}

//This displays the first image first so we can start the program with it
void draw() {
  background(54, 178, 242);
  text("Personal Space", 110,400);

  if (key == '1') {
    comic1.display1();
  } else if (key == '2') {
    comic2.display2();
  } else if (key == '3') {
    comic3.move3();
    comic3.display2();
    comic3.cloud();
    comic3.showText();
  }
}
