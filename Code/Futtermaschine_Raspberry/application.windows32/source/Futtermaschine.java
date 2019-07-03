import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.*; 
import processing.serial.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Futtermaschine extends PApplet {

public void setup() {
  
  myPort = new Serial(this, Serial.list()[0],250000);

  background(0xff21A4E8);
  
  
  
  checkboxtrue = loadImage("checked.png");
  checkboxfalse = loadImage("unchecked.png");
  down = loadImage("down.png");
  up = loadImage("up.png");
  myPort.bufferUntil('\n');
}

public void draw(){
  background(0xff21A4E8);
  noStroke();
  fill(255);
  rectMode(CORNERS);
  rect(10,20,width-10,height-20,40);
  fill(0);
  textAlign(CENTER);
  textFont(createFont("18thCentury-48",50,true));
  text("Tierf\u00fcttermaschine",width/2,70);
  
 //Buttoninteraktivit\u00e4t
 
  if(mouseIsInside(344,120,344+30,120+40)){
    rectMode(CORNERS);
    noStroke();
    fill(214,214,214);
    rect(343,119,344+31,120+42);
    ;
  }
  if(mouseIsInside(344,120,344+30,120+40) && mousePressed){
    rectMode(CORNERS);
    noStroke();
    fill(0xff989898);
    rect(343,119,344+31,120+42);
    
  }
  if(mouseIsInside(251,120,251+30,120+40)){
    rectMode(CORNERS);
    noStroke();
    fill(214,214,214);
    rect(250,119,251+31,120+42);
    
  }
  if(mouseIsInside(251,120,251+30,120+40) && mousePressed){
    rectMode(CORNERS);
    noStroke();
    fill(0xff989898);
    rect(249,118,251+31,120+42);
    
  }
  if(mouseIsInside(344,220,344+30,220+40)){
    rectMode(CORNERS);
    noStroke();
    fill(214,214,214);
    rect(343,219,344+31,220+42);
    
  }
  if(mouseIsInside(344,220,344+30,220+40) && mousePressed){
    rectMode(CORNERS);
    noStroke();
    fill(0xff989898);
    rect(343,219,344+31,220+42);
    
  }
  if(mouseIsInside(251,220,251+30,220+40)){
   rectMode(CORNERS);
   noStroke();
   fill(214,214,214);
   rect(250,219,251+31,220+42);
    
  }
  if(mouseIsInside(251,220,251+30,220+40) && mousePressed){
   rectMode(CORNERS);
   noStroke();
   fill(0xff989898);
   rect(249,218,251+31,220+42);
    
  }
  if(mouseIsInside(344+200,120,344+200+30,120+40)){
   rectMode(CORNERS);
   noStroke();
   fill(214,214,214);
   rect(344+199,119,344+200+31,120+42);
    
  }
  if(mouseIsInside(344+200,120,344+200+30,120+40) && mousePressed){
   rectMode(CORNERS);
   noStroke();
   fill(0xff989898);
   rect(344+199,119,344+200+31,120+42);
    
  }
  if(mouseIsInside(251+200,120,251+200+30,120+40)){
   rectMode(CORNERS);
   noStroke();
   fill(214,214,214);
   rect(250+200,119,251+200+31,120+42);
    
  }
  if(mouseIsInside(251+200,120,251+200+30,120+40) && mousePressed){
   rectMode(CORNERS);
   noStroke();
   fill(0xff989898);
   rect(250+200,119,251+200+31,120+42);
    
  }
  
  if(mouseIsInside(344+200,220,344+200+30,220+40)){
   rectMode(CORNERS);
   noStroke();
   fill(214,214,214);
   rect(343+200,219,344+200+31,220+42);
    
  }
  if(mouseIsInside(344+200,220,344+200+30,220+40) && mousePressed){
   rectMode(CORNERS);
   noStroke();
   fill(0xff989898);
   rect(343+200,219,344+200+31,220+42);
    
  }
  
  if(mouseIsInside(251+200,220,251+200+30,220+40)){
   rectMode(CORNERS);
   noStroke();
   fill(214,214,214);
   rect(250+200,219,251+200+31,220+42);
    
  }
  if(mouseIsInside(251+200,220,251+200+30,220+40) && mousePressed){
   rectMode(CORNERS);
   noStroke();
   fill(0xff989898);
   rect(250+200,219,251+200+31,220+42);
    
  }
  
  if(mouseIsInside(1050,370,1050+250,370+50)){
   rectMode(CORNERS);
   noStroke();
   fill(214,214,214);
   rect(1050,370,1050+250,370+50);
    
  }
  if(mouseIsInside(1050,370,1050+250,370+50) && mousePressed){
   rectMode(CORNERS);
   noStroke();
   fill(0xff989898);
   rect(1050,370,1050+250,370+50);
    
  }

  imageMode(CORNER);
  
  if(status==0){
  image(checkboxtrue,26,91,98,98);
  }else{
  image(checkboxfalse,26,91,98,98);
  }
  
  if(status2==0){
  image(checkboxtrue,26,191,98,98);
  
  }else{
  image(checkboxfalse,26,191,98,98);
  }
  
  rectMode(CORNER);
  noStroke();
  fill(farbe1);
  rect(126,91,100,100,30);
  fill(farbe2);
  rect(126,191,100,100,30);
  
  noFill();
  stroke(0);
  strokeWeight(1);
  //textMode(CORNER);
  
  rect(249,118,33,44);
  image(down,251,120,30,40);
  fill(0);
  text(hour1,251+57,120+40);
  noFill();
  rect(342,118,33,44);
  image(up,344,120,30,40);
  
  noFill();
  rect(249,118+100,33,44);
  image(down,251,120+100,30,40);
  text(hour2,251+57,220+40);
  rect(342,218,33,44);
  image(up,344,220,30,40);
  
  noFill();
  stroke(0);
  strokeWeight(1);
  //textMode(CORNER);
  
  rect(249+200,118,33,44);
  image(down,251+200,120,30,40);
  fill(0);
  text(minute1,251+202+57,120+40);
  noFill();
  rect(342+200,118,33,44);
  image(up,344+200,120,30,40);
  
  noFill();
  rect(249+200,118+100,33,44);
  image(down,251+200,120+100,30,40);
  text(minute2,251+202+57,220+40);
  rect(342+200,218,33,44);
  image(up,344+200,220,30,40);
  rectMode(CORNER);
  strokeWeight(2);
  
  rect(1050,370,250,50);
  textMode(CENTER);
  
  textFont(createFont("18thCentury-48",30,true));
  text("Manuell starten",1175,405);
  
  fill(0);
  textFont(createFont("18thCentury-48",25,true));
  text("Mausposition :"+mouseX+","+mouseY,width-155,height-30);
  text("fps: "+PApplet.parseInt(frameRate),width-345,height-30);
  text("Datum/Zeit: "+day()+"."+month()+" "+year()+"   "+hour()+":"+minute()+":"+second(),width-585,height-30);
  text("Port: "+Serial.list()[0],width-850,height-30);
  tabelleneu();
  uebertragung();
  
  if(myPort.available() >0){
  //input = " ";
  //myPort.clear();
  textMode(0);
  input_array[0] = myPort.readString();
  println(input_array[0]);
  
  saveStrings("Daten.txt",input_array);
  delay(1);
 inputneu = loadStrings("Daten.txt")[0];
 

 
 for(int a = 0;a<100;a++){
   if(inputneu.equals(a+"")==true){
     input=a;
     break;
   }
   
   ergebniss=hoehegesammt-input;
  text(ergebniss+"",200,400);
 }
   

 
  }
  
  

  
  endShape();
  
}
public void mousePressed(){
  
  
  status3 =1;
  if(mouseIsInside(26,91,26+98,91+98)&&status==0&&status3==1){
  status=1;
  status3 = 0;
  }
  if(mouseIsInside(26,91,26+98,91+98)&&status==1&&status3==1){
  status=0;
  status3 = 0;
  }
  if(mouseIsInside(26,191,26+98,191+98)&&status2==0&&status3==1){
   status2=1;
   status3=0;
  }
  if(mouseIsInside(26,191,26+98,191+98)&&status2==1&&status3==1){
   status2=0;
   status3=0;
  }
  
  if(mouseIsInside(344,120,344+30,120+40)&&hour1<23){
    hour1++;
  }
  if(mouseIsInside(251,120,251+30,120+40)&&hour1>0){
    hour1--;
  }
  if(mouseIsInside(344,220,344+30,220+40)&&hour2<23){
    hour2++;
  }
  if(mouseIsInside(251,220,251+30,220+40)&&hour2>0){
    hour2--;
  }
  
  
  
  
  if(mouseIsInside(344+200,120,344+200+30,120+40)&&minute1<59){
    minute1++;
  }
  if(mouseIsInside(251+200,120,251+200+30,120+40)&&minute1>0){
    minute1--;
  }
  if(mouseIsInside(344+200,220,344+200+30,220+40)&&minute2<59){
    minute2++;
  }
  if(mouseIsInside(251+200,220,251+200+30,220+40)&&minute2>0){
    minute2--;
  }
  
  if(mouseIsInside(1050,370,1050+250,370+50)){
   myPort.write('1');
   //myPort.clear();
  }
}




 public boolean mouseIsInside(float x1,  float y1, float x2, float y2)
    {
        float lowX = Math.min(x1, x2);
        float lowY = Math.min(y1, y2);
        float highX = Math.max(x1, x2);
        float highY = Math.max(y1, y2);

        return (mouseX > lowX && mouseX < highX && mouseY > lowY && mouseY < highY);
    }
    
int status=0;
int status2=0;
int status3;



int status4;
int status5;
int time;

int input;
String[] input_array = {"0"};
String inputneu;
int ergebniss;

int hoehegesammt = 100;

PImage checkboxtrue;
PImage checkboxfalse;
PImage down;
PImage up;
int farbe1 =0xffC62614;
int farbe2 =0xffC62614;
int hour1;
int hour2;
int minute1;
int minute2;
int zahl;
int zahl2;

Serial myPort;
public void tabelleneu() {
  noFill();
  stroke(0);
  strokeWeight(2);
  rectMode(CORNERS);
  rect(25, 90, 1327, 90+200);
  line(25, 90+100, 1327, 90+100);
}
public void uebertragung() {

  if (hour1==hour()&& minute1==minute()&&status==0) {
    myPort.write('1');
    myPort.clear();
    minute1--;
    farbe1=0xff17BC47;
    status4=1;
  }else{
    farbe1=0xffC62614;
  }

  if (hour2==hour()&& minute2==minute()&&status2==0) {

    myPort.write('1');
    myPort.clear();
    minute2--;
    farbe2=0xff17BC47;
    status5=1;
  }else{
    farbe2=0xffC62614;
  }
  
  
  
  
  if (hour1==hour()&& minute1+2==minute()&&status==0&&status4==1) {
    minute1++;
    status4=0;
  }

  if (hour2==hour()&& minute2+2==minute()&&status2==0&&status5==1) {
    minute2++;
    status5=0;
  }
}
  public void settings() {  size(displayWidth,displayHeight);  smooth(); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "--present", "--window-color=#666666", "--stop-color=#cccccc", "Futtermaschine" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
