package prgram6CaHap06;

public class OverrideTest {
public static void main(String[] args) {
	Car C = new Car("파랑", 200, 1000, 5);
	C.show();
	System.out.println();
	//오버라이딩되어 같은 값이 출력된다.
	Vehicle V = C;
	V.show();
}
}
