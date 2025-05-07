package HW250507;

import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class hw25050703 {

	public static void main(String[] args) {
		String s ="of the people,by the people, for the people";
		try {
			showTokens(s,", ");
		} catch (NoSuchElementException e) {
			System.out.println("끝");
		}
	}
	
	public static void showTokens(String str, String delim) {
		StringTokenizer st = new StringTokenizer(str, delim);
		
		while(true) {
			String token = st.nextToken();
			System.out.println(token);
		
		}
		
	}
}
