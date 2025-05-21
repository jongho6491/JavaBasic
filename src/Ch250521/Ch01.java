package Ch250521;

import java.util.ArrayList;

public class Ch01 {

	public static void main(String[] args) {
		
		String[] countrydata = {"서울", "워싱턴", "베이징","마드리드","파리"};
		
		ArrayList<String> country = new ArrayList<>();
		for (String c : countrydata) {
			country.add(c);
		}
		System.out.println(country);
		
		country.add("런던");
		System.out.println(country);
		
		//country.removeIf(c -> c.length() >= 3);
		for (String c : country) {
			
			if (c.length() < 3) {
				System.out.print(c + " ");
			}
		}
//		System.out.println(country);
	}
}
