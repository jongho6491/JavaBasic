package hw250408;

public class JavaCar {
	public static void main(String[] args) {
        Car car1 = new Car("red");
        Car car2 = new Car("blue");
        Car car3 = new Car("Red");
        Car car4 = new Car("green");
        
        System.out.println("총 자동차 수: " + Car.getTotalCars());
        System.out.println("빨간색 자동차 수: " + Car.getRedCars());
	}
}