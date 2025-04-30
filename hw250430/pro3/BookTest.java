package hw250430.pro3;

import java.util.Arrays;
import java.util.Comparator;

public class BookTest {

	public static void main(String[] args) {
		// 여러 개의 Book 객체 생성
		Book[] books = {
				new Book(15000),
				new Book(50000),
				new Book(10000)
		};
		
		// 가격순으로 정렬
		Arrays.sort(books, new Comparator<Book>(){
			@Override
			public int compare(Book b1, Book b2) {
				return Integer.compare(b1.price, b2.price);
			}
		});
		
		// 정렬된 결과 출력
		for (Book book : books) {
			System.out.println(book);
		}
	}
}
