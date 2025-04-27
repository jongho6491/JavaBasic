package prgram6CaHap06;

public class Vehicle {
   String color;
   int speed;
   
   void show( ) {
	    System.out.printf("지동자 색깔 : %s\\n자동차 속도 : %d\\n", color, speed);
               
   }
   public Vehicle(String color, int speed) {
	   this.color = color;
	   this.speed = speed;
   }
}
