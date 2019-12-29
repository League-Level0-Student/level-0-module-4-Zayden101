
void setup() {
    PImage face = loadImage("ur_mom.png");
    
    size(800,600);
    face.resize(width,height);
   background(face);
}

void draw() {
  if (mouseX <150){
  mouseX=150;
  }
 if (mouseX >400){
  mouseX=400;
 }
 if (mouseY <150){
  mouseY=150;
 }
 if (mouseY >400){
  mouseY=400;
 
 
 
}
println(mouseX);
  fill(1000,1000,1000);
  ellipse(275,275,250,250);
fill(0,0,0);
ellipse(mouseX,mouseY,50,50);

 fill(1000,1000,1000);
  ellipse(480,300,150,150);
fill(0,0,0);
ellipse(mouseX+275,mouseY,50,50);
}
