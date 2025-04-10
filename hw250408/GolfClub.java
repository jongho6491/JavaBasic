package hw250408;

class GolfClub {
	 private String type;  

	 
	 public GolfClub() {
	     this.type = "7번 아이언";
	 }

	 
	 public GolfClub(int number) {
	     this.type = number + "번 아이언";
	 }

	 
	 public GolfClub(String type) {
	     this.type = type;
	 }

	 
	 public void print() {
	     System.out.println(this.type + "입니다.");
	 }
	}
