package inheritance.animal;

public class AnimalTest {
	
	Animal animal;
	void move(Animal animal) {
		animal.eat();
		animal.move();
		animal.sleep();
	}
	
	
	public static void main(String[] args) {
		AnimalTest at = new AnimalTest();
		
		System.out.println(">>>> 독수리");
		at.move(new Eagle());
		

		System.out.println(">>>> 호랑이");
		at.move(new Tiger());
		
		
		System.out.println(">>>> 금붕어");
		at.move(new Goldfish());
		
		
		//System.out.println(">>>> 독수리");
		//Eagle eagle = new Eagle();
		//eagle.eat();
		//eagle.fly();
		//eagle.sleep();
		
		//System.out.println(">>>> 호랑이");
		//Tiger tiger = new Tiger();
		//tiger.eat();
		//tiger.run();
		//tiger.sleep();
		
		//System.out.println(">>>> 금붕어");
		//Goldfish goldfish = new Goldfish();
		//goldfish.eat();
		//goldfish.swim();
		//goldfish.sleep();
		
	}
}
