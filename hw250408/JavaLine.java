package hw250408;

public class JavaLine {
	public static void main(String[] args) {
        Line a = new Line(1);
        Line b = new Line(1);

        System.out.println(a.isSameLine(b)); 
        System.out.println(a == b);          
    }
}
