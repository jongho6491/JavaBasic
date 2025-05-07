package HW250507;


	class MyDate {
		int year;
		int month;
		int day;
	}



public class hw25050701 {

	public static void main(String[] args) {
		MyDate d = null;
		
		try {
			System.out.printf("%d년 %d월 %d일\n", d.year, d.month, d.day);
		} catch (NullPointerException e) {
			System.out.println(e.toString());
		}
		
		d = new MyDate();
		d.year = 2035;
		d.month = 12;
		d.day = 25;
		
		System.out.printf("%d년 %d월 %d일\n", d.year, d.month, d.day);
	}
}
