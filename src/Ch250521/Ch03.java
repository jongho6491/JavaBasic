package Ch250521;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ch03 {

	public static void main(String[] args) {
		
		Map<String, String> korean = new HashMap<>();
		
		korean.put("head", "대가빠리");
		korean.put("teacher", "쌤");
		korean.put("cat", "꼬네이");
		korean.put("aunt", "아지매");
		korean.put("noodle", "국시");
		korean.put("child", "얼라");
		
		for (String K : korean.keySet()) {
			System.out.printf("%s=%s", K, korean.get(K));
			System.out.print(" ");
		}
		
		System.out.println();
		
		Collection<String> collection1 = korean.values();
	      List<String> list = new ArrayList<>(collection1);
	      
	      Collections.reverse(list);
	      //Collections.rotate(list,3);
	      //Collections.sort(list);
	      list.forEach(x -> System.out.print(x + " "));
	}
}
