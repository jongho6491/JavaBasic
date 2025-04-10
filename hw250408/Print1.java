package hw250408;

class Printer{
	int numOfPapers = 0;   //필드(멤버 변수, 인스턴스 변수)
	
	
	public void print(int amount) { //(print 라는 메서드(멤버 메서드)
			numOfPapers -= amount;
		}
		
	}
public class Print1 {
	public static void main(String[] args) {
		Printer demoPrinter = new Printer();  //객체 생성
		
		
		demoPrinter.numOfPapers += 100; // 용지 100장 추가
		
		demoPrinter.print(70);    // 70 장 출력
		
		System.out.println(demoPrinter.numOfPapers);
	}

}
