package hw250408;

class Triangle {
	private double width;   
    private double height;  

    
    public Triangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

	public double findArea() {
        return (width * height) / 2;
	}
}


public class JavaBook1 {
	public static void main(String[] args) {
		Triangle t = new Triangle(10.0, 5.0);
		System.out.println(t.findArea());
	}

}
