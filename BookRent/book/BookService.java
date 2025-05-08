package book;

import java.util.ArrayList;

public class BookService {
   
   private ArrayList<Book> bookList = new ArrayList<>(); 
   
   public BookService() {
      loadBookList();
   }
   
   
   private void loadBookList() {
      bookList.add(new Book(101, "쉽게 배우는 자바 프로그래밍 2판", "우종정", "한빛아카데미", 20000, true));
      bookList.add(new Book(201, "나의 첫 알고리즘 + 자료구조", "코리 알트호프", "한빛미디어", 21000, true));
      bookList.add(new Book(301, 
    		  "Do It! HTML+CSS+자바스크립트", "고경희", "이지스퍼블리싱", 32000 ,true));
   }
   
   public ArrayList<Book> listInstockBooks() {
      return listBooks(true);
   }
   
   public ArrayList<Book> listRentBooks(){
      return listBooks(false);
   }
   
   private ArrayList<Book> listBooks(boolean isInstock) {
      ArrayList<Book> books = new ArrayList<>();
      
      for (Book book : bookList) {
         if(book.isInstock() == isInstock)
            books.add(book);
         
      }
      
      return books;
   }
   
   public boolean rentBook(int bookNo) {
	   return changeRentStatus(bookNo, false);
   }
   
   public boolean returnBook(int bookNo) {
	   return changeRentStatus(bookNo, true);
   }
   
   private boolean changeRentStatus(int bookNo, boolean isInstock) {
	   for (Book book : bookList) {
		   if (book.getBookNo() == bookNo && book.isInstock() != isInstock) {
			   book.setInstock(isInstock);
			   return true;
		   }
	   }
	   return false;
   }
   // 책 등록
   public void registBook(Book book) {
	   bookList.add(book);
   }

   // 책 가격 수정
   public boolean updateBook(int bookNo, int price) {
	   for (Book book : bookList) {
		   if (book.getBookNo() == bookNo) {
			   // price 필드가 private이라면 setter가 있어야 함
			   book.setPrice(price);
			   return true;
		   }
	   }
	   return false; // 해당 책번호 없음
   }

   // 책 삭제
   public boolean removeBook(int bookNo) {
	   for (int i = 0; i < bookList.size(); i++) {
		   if (bookList.get(i).getBookNo() == bookNo) {
			   bookList.remove(i);
			   return true;
		   }
	   }
	   return false; // 해당 책번호 없음
   }
}

