package Pro250521;

import java.util.HashSet;
import java.util.Set;

public class PersonTest {

	public static void main(String[] args) {
		
	Set<Person> set = new HashSet<>();
	set.add(new Person("김열공", 20));
	set.add(new Person("최고봉", 56));
	set.add(new Person("우등생", 16));
	set.add(new Person("나자바", 35));
	
	for(Person data : set) {
		System.out.println(data.name + " : " + data.age);
	}
	
	System.out.println(set);
	}
}	
