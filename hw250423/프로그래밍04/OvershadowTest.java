package prgram6CaHap04;

public class OvershadowTest {
  public static void main(String[] args) {
	    Parent p = new child();
		System.out.println(p.name);// 필드값이 오버라이딩 되는지 확인
		p.print();//메서드는 오버라이딩 되는 확인
     }
}
