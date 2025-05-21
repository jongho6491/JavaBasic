package Pro250521;

import java.util.HashMap;
import java.util.Map;

public class Pro06 {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		
		map.put("호랑이", "tiger");
		map.put("표범", "leopard");
		map.put("사자", "lion");
		
		System.out.println("변경 전 : " + map);
		
		for (String key : map.keySet()) {
			String value = map.get(key);
			String upperValue = value.toUpperCase();
			map.put(key, upperValue);
		}
		System.out.println("변경 후 : " + map);
	}
}
