package app;


import java.util.ArrayList;
import java.util.Scanner;
import book.Book;
import book.BookService;

public class BookRentConsoleApp {

   BookService bs = new BookService();

   public static void main(String[] args) {

      BookRentConsoleApp app = new BookRentConsoleApp();

      // 환영 인사

      app.displayWelcome();

      // 선택 메뉴에 따라 기능 수행
      app.controlMenu();

   }

   private void displayWelcome() {
      System.out.println("*************************************");
      System.out.println("*     도서 대여점에 오신 걸 환영합니다.     *");
      System.out.println("*************************************");

   }

   private void controlMenu() {
      int menu;
      do {
         menu = getMenu();
         switch (menu) {
         case 1: menuBookList(); break;     // 도서 목록
         case 2: menuBookRent(); break;
         case 3: menuBookRentList(); break;
         case 4: menuBookReturn(); break;
         case 5: menuBookRegister();
         case 6: menuBookUpdate();
         case 7: menuBookRemove();
         case 0: menuExit(); break;
         default:System.out.println("없는 메뉴입니다.");
         }
      } while (menu != 0);
   }
   // 도서 등록(관리자 기능)
   private void menuBookRegister() {
	    Scanner sc = new Scanner(System.in);
	    System.out.print(">> 도서 번호: ");
	    int no = sc.nextInt(); sc.nextLine();  // 개행 처리
	    System.out.print(">> 제목: ");
	    String title = sc.nextLine();
	    System.out.print(">> 저자: ");
	    String author = sc.nextLine();
	    System.out.print(">> 출판사: ");
	    String publisher = sc.nextLine();
	    System.out.print(">> 가격: ");
	    int price = sc.nextInt();

	    bs.registBook(new Book(no, title, author, publisher, price, true));
	    System.out.println(">> 도서 등록 완료!");
	}
   	// 도서 가격 수정
   private void menuBookUpdate() {
	    Scanner sc = new Scanner(System.in);
	    System.out.print(">> 수정할 도서 번호: ");
	    int no = sc.nextInt();
	    System.out.print(">> 새 가격: ");
	    int price = sc.nextInt();

	    if (bs.updateBook(no, price)) {
	        System.out.println(">> 가격 수정 완료!");
	    } else {
	        System.out.println("[오류] 도서가 존재하지 않습니다.");
	    }
	}
    // 도서 삭제
   private void menuBookRemove() {
	    Scanner sc = new Scanner(System.in);
	    System.out.print(">> 삭제할 도서 번호: ");
	    int no = sc.nextInt();

	    if (bs.removeBook(no)) {
	        System.out.println(">> 도서 삭제 완료!");
	    } else {
	        System.out.println("[오류] 해당 도서가 존재하지 않습니다.");
	    }
	}

   private void menuBookList() {
      
      ArrayList<Book> bookList = bs.listInstockBooks();
      displayBookList(bookList);

   }
   
   private void menuBookRentList() {
      ArrayList<Book> bookList = bs.listRentBooks();
      displayBookList(bookList);
   }
   
   private void displayBookList(ArrayList<Book> bookList) {
      System.out.println("=================================");
      if(bookList.isEmpty()) {
         System.out.println("책이 없습니다.");
      } else {
         for (Book book : bookList) {
            System.out.println(book.toString());
         }
      }
      System.out.println("=================================");
      
   }
   
   private void menuBookRent() {
	   displayBookList(bs.listInstockBooks());
	   
	   Scanner sc = new Scanner(System.in);
	   System.out.println(">> 대여할 도서 번호 : ");
	   int bookNo = sc.nextInt();
	   
	   if (bs.rentBook(bookNo)) {
		   displayBookList(bs.listRentBooks());
	   } else {
		   System.out.println("[오류] 없는 도서이거나 이미 대여한 도서입니다.");
	   }
   }
   
   private void menuBookReturn() {
	   displayBookList(bs.listRentBooks());
	   
	   Scanner sc = new Scanner(System.in);
	   System.out.println(">> 반납할 도서 번호 : ");
	   int bookNo = sc.nextInt();
	   
	   if (bs.returnBook(bookNo)) {
		   displayBookList(bs.listRentBooks());
	   } else {
		   System.out.println("[오류] 없는 도서이거나 이미 반납한 도서 입니다.");
	   }
   }
   

   private int getMenu() {

      System.out.println("=================================");
      System.out.println("1. 도서 목록 보기");
      System.out.println("2. 도서 대여");
      System.out.println("3. 도서 대여 현황 보기");
      System.out.println("4. 도서 반납");
      System.out.println("5. 도서 등록");
      System.out.println("6. 도서 가격 수정");
      System.out.println("7. 도서 삭제");
      System.out.println("0. 종료");
      System.out.println("=================================");
      System.out.print(">> 메뉴 선택 : ");

      Scanner sc = new Scanner(System.in);
      int menu = sc.nextInt();
      return menu;

   }

   private void menuExit() {
      System.out.println("*** 도서 대여점 종료 ***");
   
   }

}