int xposition = 10; 
int speed = 15;
int otherspeed = -5;
void setup () {
  size(500, 500);
}

void draw() { 
  background(#096C63);
  fill(#ffffff);
  ellipse(xposition, 250, 250, 250);

  if (mousePressed) {
    xposition = xposition + speed;
  }

  if (xposition > width) {
  speed = -15;
  }
  
 if (xposition < 0) {
   speed = 15;
 }
 
}