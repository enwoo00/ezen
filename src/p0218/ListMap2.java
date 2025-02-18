package p0218;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListMap2 {
	
	static List<Map<String,String>> getList() {
		Map<String,String> map = new HashMap<String,String>();
		map.put("year", "2018");
		map.put("week", "1");
		map.put("tv", "2301");
		map.put("online", "378");
		map.put("newspaper", "692");
		
		Map<String,String> map1 = new HashMap<String,String>();
		map1.put("year", "2018");
		map1.put("week", "2");
		map1.put("tv", "445");
		map1.put("online", "393");
		map1.put("newspaper", "451");
		
		Map<String,String> map2 = new HashMap<String,String>();
		map2.put("year", "2018");
		map2.put("week", "3");
		map2.put("tv", "172");
		map2.put("online", "459");
		map2.put("newspaper", "693");
		
		Map<String,String> map3 = new HashMap<String,String>();
		map3.put("year", "2018");
		map3.put("week", "4");
		map3.put("tv", "2301");
		map3.put("online", "108");
		map3.put("newspaper", "584");
		/*
		Map<String,String> map4 = new HashMap<String,String>();
		map4.put("year", "2018");
		map4.put("week", "5");
		map4.put("TV", "2301");
		map4.put("Online", "378");
		map4.put("Newspaper", "692");
		*/
		List<Map<String,String>> maps = new ArrayList<>();
		maps.add(map);
		maps.add(map1);
		maps.add(map2);
		maps.add(map3);
		//maps.add(map4);
		return maps;
	}
	
	public static void main(String[] args) {
		List<Map<String,String>> maps = getList();
		for(Map<String,String> map : maps) {
			System.out.println(map);
		}
		/*
		Map<String,String> map = new HashMap<String,String>();
		map.put("year", "2018");
		map.put("week", "1");
		map.put("TV", "2301");
		map.put("Online", "378");
		map.put("Newspaper", "692");
		
		Map<String,String> map1 = new HashMap<String,String>();
		map1.put("year", "2018");
		map1.put("week", "1");
		map1.put("TV", "2301");
		map1.put("Online", "378");
		map1.put("Newspaper", "692");
		
		Map<String,String> map2 = new HashMap<String,String>();
		map2.put("year", "2018");
		map2.put("week", "1");
		map2.put("TV", "2301");
		map2.put("Online", "378");
		map2.put("Newspaper", "692");
		
		Map<String,String> map3 = new HashMap<String,String>();
		map3.put("year", "2018");
		map3.put("week", "1");
		map3.put("TV", "2301");
		map3.put("Online", "378");
		map3.put("Newspaper", "692");
		
		Map<String,String> map4 = new HashMap<String,String>();
		map4.put("year", "2018");
		map4.put("week", "1");
		map4.put("TV", "2301");
		map4.put("Online", "378");
		map4.put("Newspaper", "692");
		
		Map<String,String> map5 = new HashMap<String,String>();
		map5.put("year", "2018");
		map5.put("week", "1");
		map5.put("TV", "2301");
		map5.put("Online", "378");
		map5.put("Newspaper", "692");
		
		Map<String,String> map6 = new HashMap<String,String>();
		map6.put("year", "2018");
		map6.put("week", "1");
		map6.put("TV", "2301");
		map6.put("Online", "378");
		map6.put("Newspaper", "692");
		
		Map<String,String> map7 = new HashMap<String,String>();
		map7.put("year", "2018");
		map7.put("week", "1");
		map7.put("TV", "2301");
		map7.put("Online", "378");
		map7.put("Newspaper", "692");
		
		Map<String,String> map8 = new HashMap<String,String>();
		map8.put("year", "2018");
		map8.put("week", "1");
		map8.put("TV", "2301");
		map8.put("Online", "378");
		map8.put("Newspaper", "692");
		
		*/
		
	}

}
