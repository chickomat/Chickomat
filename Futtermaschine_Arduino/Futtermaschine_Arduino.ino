#include "Ultrasonic.h"
int incomingByte = 0;   
int A =3;
int in1 = A1;

Ultrasonic ultrasonic(9,13);

void setup() {
  
  Serial.begin(250000);   

  
  pinMode(12,OUTPUT);
  pinMode(A,OUTPUT);
  pinMode(7,OUTPUT);
  pinMode(5,OUTPUT);
  pinMode(6,OUTPUT);
  digitalWrite(5,HIGH);
}
void loop(){
 incomingByte=0;

 Serial.println(ultrasonic.Ranging(CM));
 delay(1);
  
  
  
  }

void serialEvent() {
 if (Serial.available() > 0) {
 
                //Serial.flush();
                incomingByte = Serial.read();
                
                delay(1);
                if(incomingByte = 65){
               incomingByte=0;
                digitalWrite(A,HIGH);
                
                delay(10000); //die Hälfte
                
                digitalWrite(A,LOW);
                
                
                
                incomingByte=0;
                
               
                }
                incomingByte=0;

            
                
                }
}



