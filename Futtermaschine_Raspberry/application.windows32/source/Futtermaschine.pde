void setup() {
  
  myPort = new Serial(this, Serial.list()[0],250000);

  background(#21A4E8);
  
  size(displayWidth,displayHeight);
  smooth();
  checkboxtrue = loadImage("checked.png");
  checkboxfalse = loadImage("unchecked.png");
  down = loadImage("down.png");
  up = loadImage("up.png");
  myPort.bufferUntil('\n');
}

void draw(){
  background(#21A4E8);
  noStroke();
  fill(255);
  rectMode(CORNERS);
  rect(10,20,width-10,height-20,40);
  fill(0);
  textAlign(CENTER);
  textFont(createFont("18thCentury-48",50,true));
  text("Tierfüttermaschine",width/2,70);
  
 //Buttoninteraktivität
 
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
    fill(#989898);
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
    fill(#989898);
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
    fill(#989898);
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
   fill(#989898);
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
   fill(#989898);
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
   fill(#989898);
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
   fill(#989898);
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
   fill(#989898);
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
   fill(#989898);
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
  text("fps: "+int(frameRate),width-345,height-30);
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
void mousePressed(){
  
  
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