package p0218;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListMap3 {

	static List<Map<String,String>> getUserInfo() {
		Map<String, String> map = new HashMap<> ();
		List<Map<String,String>> maps = new ArrayList();
		map.put("UI_NUM", "1");
		map.put("UI_NAME", "성룡");
		map.put("UI_ID", "SUNG");
		map.put("UI_PWD", "1234");
		
		Map<String, String> map1 = new HashMap<> ();
		map1.put("UI_NUM", "5");
		map1.put("UI_NAME", "홍길동");
		map1.put("UI_ID", "HONG");
		map1.put("UI_PWD", "1234");
		
		Map<String, String> map2 = new HashMap<> ();
		map2.put("UI_NUM", "6");
		map2.put("UI_NAME", "성룡");
		map2.put("UI_ID", "SUNG");
		map2.put("UI_PWD", "r1r2r3");
		
		Map<String, String> map3 = new HashMap<> ();
		map3.put("UI_NUM", "6");
		map3.put("UI_NAME", "성룡");
		map3.put("UI_ID", "SUNG");
		map3.put("UI_PWD", "r1r2r3");		
		
		Map<String, String> map4 = new HashMap<> ();
		map4.put("UI_NUM", "6");
		map4.put("UI_NAME", "성룡");
		map4.put("UI_ID", "SUNG");
		map4.put("UI_PWD", "r1r2r3");
		
		maps.add(map);
		maps.add(map1);
		maps.add(map2);
		maps.add(map3);
		maps.add(map4);
		
		return maps;
	}
	
	public static void main(String[] args) {
		List<Map<String,String>> maps = getUserInfo();
		for(Map<String,String> map : maps) {
			System.out.println(map);
		}
	}
}
