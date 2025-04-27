package prgram6CaHap06;

public class Car extends Vehicle {
       int displacement;
       
       int gears;
       
       void show( ) {
    	   System.out.printf("자동차 색깔 :  %s\\n자동차 속도 : %d\\n자동차 배기량 : %d\\n자동차 기어단수 : %d\n", color, speed, displacement, gears);
       }
       public Car(String color, int speed, int displacement, int gears) {
    	   super(color, speed);
    	   this.displacement = displacement;
    	   this.gears = gears;
       }
}
