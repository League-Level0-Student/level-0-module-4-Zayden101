PImage creeper; 
int x=100;
int y=100;
void setup() {
  size(1000, 1000); 
PImage minecraft = loadImage("p.jpeg");     
minecraft.resize(width, height);
background(minecraft);       
creeper=loadImage("pp.png"); 
}

void draw() {
creeper.resize(10,10) ;         
image(creeper, x, y);
if (isNear(105, mouseX)){ 
if (isNear(105, mouseY)) {
  fill(3,255,4);
  ellipse(mouseX,mouseY,10,10);
//print("  you died XP  ");
}
}
else{
  fill(255,3,4);
  ellipse(mouseX,mouseY,10,10);
}
}

boolean isNear(int a, int b) {
if (abs(a - b) < 10)
     return true;
else
     return false;
}
