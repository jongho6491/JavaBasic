package Pro250521;

import java.util.ArrayList;

public class Pro01 {

	public static void main(String[] args) {
		
		String [] AB = {"갈매기", "나비", "다람쥐", "라마"};
		
		ArrayList<String> A = new ArrayList<>();
		for (String c : AB) {
			A.add(c);
		}
		
		for (String c : A) {
			if(c.length() < 3) {
				System.out.println(c + " ");
			}
		}
		
	}
}
