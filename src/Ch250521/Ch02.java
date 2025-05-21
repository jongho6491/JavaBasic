package Ch250521;

import java.util.*;

public class Ch02 {

	public static void main(String[] args) {
	
		Map<String, String> dic = new HashMap<>();
	
		dic.put("head", "대가빠리");
		dic.put("teacher", "쌤");
		dic.put("cat", "꼬네이");
		dic.put("aunt", "아지매");
		dic.put("noodle", "국시");
		
		for(String set : dic.keySet()) {
	         System.out.printf("%s=%s", set, dic.get(set));
	         System.out.print(" ");
	      }
	}
}
