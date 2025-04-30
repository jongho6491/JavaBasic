package hw250430.pro3;

public class Book {

	int price;
	
	// 생성자
	public Book(int price) {
		this.price = price;
		
	}
	
	// Book 객체의 가격을 출력하는 메서드
	public String toString() {
		return "Book [price =" + price + "]";
		
	}
}
