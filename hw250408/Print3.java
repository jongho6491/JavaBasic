package hw250408;

class Printerss {
	private int numOfPapers; // 남은 용지 수(외부에서 직접 접근못하게 private로 설
	private boolean duplex; // 양면 출력 여부 (true면 양면 출력, false면 단면 출력)
	
	// 생성자 : 프린터 생성 시 용지 수와 양면 출력 여부를 설정한다.
	public Printerss(int numOfPapers, boolean duplex) {
		
		// 매개변수로 받은 용지 수를 필드에 저장
		this.numOfPapers = numOfPapers;
	
		// 매개변수로 받은 양면 출력 여부를 필드에 저장
		this.duplex = duplex;
	}
	
//			setter: 양면 출력 여부를 바꾸기 위한 메서드
		public void setDuplex(boolean duplex){
			this.duplex = duplex;	
		}

		
//	 출력 기능
	public void print(int amount) {
		int requiredSheets; // 출력에 필요한 용지 수 계산용 변수
		
		if(duplex) {
//			양면 출력일 경우 한 장에 앞뒤로 두장 출력 가능
//			예: 5장을 출력하려면 3장 필요 -> (5+1) / 2 = 3
			requiredSheets = (amount + 1) / 2;
		} else {
//			단면 출력이면 요청한 amout만큼 용지가 필요함
			requiredSheets = amount;
			System.out.print("단면으로 ");
		}
		
//			용지가 전혀 없는 경우
		if(numOfPapers == 0) {
			System.out.println("용지가 없습니다.");
//			용지가 부족한 경우
		}else if (numOfPapers < requiredSheets) {
//			출력 가능한 최대 장 수 계산
//			양면이면 1장으로 2장 출력가능 -> 남은용지 * 2
			int maxPrintable = duplex ? numOfPapers * 2 : numOfPapers;
//			부족한 양 계산: 요청량 - 실제 출력 가능한 양
			int shortage = amount - maxPrintable;
//			부족 안내 메시지 출력
			System.out.println("모두 출력하려면 용지가 " + shortage + "매 부족합니다."
					+ maxPrintable + "장만 출력합니다.");
//			남은 용지 모두 사용했으므로 0으로 설정
			numOfPapers = 0;
		}
//		  용지가 충분한 경우
		else {
//			필요한 용지만큼 차감
			numOfPapers -= requiredSheets;
			
//			정상 출력 메시지 출력
			System.out.println("양면으로 " + requiredSheets + "장 출력했습니다"
					+ "현재 " + numOfPapers + "장 남아있습니다.");	

		}
	} 
		
	
}




public class Print3 {
	
	public static void main(String[] args) {
//		printerss 클래스의 객체를 생성
//		초기 용지 10장, 양면 출력 설정 (true)
		Printerss printer = new Printerss(20, true);
		printer.print(25);
		printer.setDuplex(false);
		printer.print(10);
	 
	}

}
