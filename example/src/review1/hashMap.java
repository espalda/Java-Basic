package review1;

import java.util.HashMap;
import java.util.Set;

public class hashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//list, set, map 컬렉션 프레임워크 3가지
		//map 은 key, value 데이터 구조
		HashMap<String, Double> price = new HashMap<>();
		//add value;
		price.put("rice", 10.0);
		price.put("egg", 5.0);
		
		//System.out.println(price.get("egg"));
		
		
		Set<String> keys = price.keySet();

		//print all the keys
		//향상된 for문
		/*for (String key : keys) {
		  System.out.println(key);
		}*/
		keys.forEach(tmp -> System.out.println(tmp));

		
	}	

}
