package lec250430.Circle;

public class Circle {
	
	public static final double PI = 3.14;
	//접근제한자... private 쓰면 자식개체도 사용 불가 protected < 상속받으면 사용 가능
	protected double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return PI * radius * radius;
	}
}
