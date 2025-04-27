package java0423;

public class GoodGirl extends Girl{
	public GoodGirl(String name) {
		super(name);
	}
  public void show() {
	  System.out.println( name + "는 자바를 잘안다.");
  }
}
//public class BestGirl extends GoodGirl {
	//public 	BestGirl(String name) {
		//super(name);
	//}
  //public void show() {
  //System.out.println( name +"는 자바를 무지하게 잘 안다");
//}
//}