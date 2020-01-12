PImage donkey;
PImage tail;
void setup() {
donkey = loadImage("die.jpeg");      
tail = loadImage("diedie.jpeg");  
donkey.resize(800,800);
size(800, 800);     
}

void draw() {
  background (donkey);
image(tail, mouseX, mouseY);
}
