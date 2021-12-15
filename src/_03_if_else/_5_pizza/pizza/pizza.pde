PImage olive;
PImage pepperoni;
PImage mushroom;
void setup() {
size(500, 500); 
olive = loadImage("olive.png");
pepperoni = loadImage("pepperoni.png");
mushroom = loadImage("mushroom.png");
}
void draw() {
 fill(#FAE203);
  circle( 225, 225, 250);
fill(#FF0320);
circle(225, 225, 208);
fill(#FAE203);
circle(225, 225, 180);
image(olive, 140, 170);
image(pepperoni, 205, 135);
image(mushroom, 190, 230);



}
