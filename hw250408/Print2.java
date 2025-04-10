package hw250408;

// 프린터 클래스 정의
class Printers {
    private int numOfPapers; // 남은 용지 수 (private으로 선언)

    // 생성자에서 초기 용지 수를 전달받아 저장
    public Printers(int amount) {
        this.numOfPapers = amount;
    }

    // 출력 기능
    public void print(int amount) {
        if (numOfPapers == 0) {
            System.out.println("용지가 없습니다.");
        } else if (numOfPapers < amount) {
            int shortage = amount - numOfPapers;
            System.out.println("모두 출력하려면 용지가 " + shortage + "매 부족합니다. " +
                               numOfPapers + "장만 출력합니다.");
            numOfPapers = 0;
        } else {
            numOfPapers -= amount;
            System.out.println(amount + "장 출력했습니다. 현재 " + numOfPapers + "장 남아 있습니다.");
        }
    }
}
// 테스트 클래스
public class Print2 {
    public static void main(String[] args) {
        Printers p = new Printers(10); // 용지 10장으로 초기화
        p.print(2);   // 2장 출력 → 8장 남음
        p.print(20);  // 부족함 → 8장 출력
        p.print(10);  // 용지 없음
    }
}