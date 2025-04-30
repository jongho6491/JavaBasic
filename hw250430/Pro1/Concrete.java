package hw250430.Pro1;

public class Concrete extends Abstract {

	int j;
	
	public Concrete(int i, int j) {
		this.i = i;
		this.j = j;
		
	}
	@Override
	public void show() {
		System.out.println("i" + "=" + i +"," + "j" + "=" + j);
	}
}
