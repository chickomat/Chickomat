void tabelleneu() {
  noFill();
  stroke(0);
  strokeWeight(2);
  rectMode(CORNERS);
  rect(25, 90, 1327, 90+200);
  line(25, 90+100, 1327, 90+100);
}
void uebertragung() {

  if (hour1==hour()&& minute1==minute()&&status==0) {
    myPort.write('1');
    myPort.clear();
    minute1--;
    farbe1=#17BC47;
    status4=1;
  }else{
    farbe1=#C62614;
  }

  if (hour2==hour()&& minute2==minute()&&status2==0) {

    myPort.write('1');
    myPort.clear();
    minute2--;
    farbe2=#17BC47;
    status5=1;
  }else{
    farbe2=#C62614;
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