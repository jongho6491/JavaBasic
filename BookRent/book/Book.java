package book;

public class Book {
	
	// 필드 field
	
	private int bookNo;
	private String title;
	private String author;
	private String publisher;
	private int price;
	private boolean instock;
	
	// 생성자
	public Book(int bookNo, String title, String author, String publisher, int price, boolean instock) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.instock = instock;
	}
	
	public String toString() {
		 return "[" + bookNo + " , " + title + " , " + author + " , " + publisher + ", " + price + "]";
	}
	
	public int getBookNo() {
		return bookNo;
	}
	
	public boolean isInstock() {
		return instock;
		
	}
	
	public void setInstock(boolean isInstock) {
		this.instock = isInstock;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
}
