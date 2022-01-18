PImage doge;

void setup() {
size(540, 540);
doge =loadImage("doge.jpg");
doge.resize(width, height);
image(doge, 0, 0);
}
void draw() {
ellipse(40, 250, 50, 50);
fill(mouseX, mouseY, mouseX);
ellipse(125, 275, 50, 50);
fill(mouseX, mouseY, mouseY);

}
