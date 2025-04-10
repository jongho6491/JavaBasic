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


 public boolean isSameArea(Triangle t) {
     return this.findArea() == t.findArea();
 }
}


public class JavaTriangle2 {
 public static void main(String[] args) {
     
     Triangle t1 = new Triangle(10.0, 5.0);
     Triangle t2 = new Triangle(5.0, 10.0);
     Triangle t3 = new Triangle(8.0, 8.0);

    
     System.out.println(t1.isSameArea(t2));  
     System.out.println(t1.isSameArea(t3)); 
 }
}
