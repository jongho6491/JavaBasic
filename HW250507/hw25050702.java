package HW250507;


class Shape{}

class Rectangle extends Shape{}

class Circle extends Shape{}


public class hw25050702 {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		try {
			casting(r);
		} catch (ClassCastException e) {
			System.out.println(e.toString());
		}
	}
	static void casting(Shape s) throws ClassCastException {
		
			Circle c = (Circle) s;
		
	}
}