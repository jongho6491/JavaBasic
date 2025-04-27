package prgram6CaHap02;

public class PersnonTestDemo {
  public static void main(String[] args) {
	 Person[] p = { new Person("길동이", 22), new Student("황진이", 23,100), new ForeignStudent("AMY",30,200,"UㆍSㆍA")};
	 for (Person i : p) {
		  System.out.println(i.show()); 
	 }
}
}
