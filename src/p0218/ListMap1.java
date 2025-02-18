package p0218;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListMap1 {

	static List<Map<String,String>> getUserInfo() {

		Map<String,String> map = new HashMap<String, String>();
		map.put("name","홍길동");
		map.put("age", "22");
		map.put("id", "hong");
		Map<String,String> map1 = new HashMap<String, String>();
		map1.put("name","임꺽정");
		map1.put("age", "33");
		map1.put("id", "lim");
		Map<String,String> map2 = new HashMap<String, String>();
		map2.put("name","유관순");
		map2.put("age", "16");
		map2.put("id", "yu");
		
		List<Map<String,String>> maps = new ArrayList<>();
		maps.add(map);
		maps.add(map1);
		maps.add(map2);
		return maps;
	}
	public static void main(String [] args) {
		List<Map<String,String>> users = getUserInfo();
		//System.out.println(users);
		
		for(int i = 0; i<users.size(); i++) {
			//System.out.println(users.get(i));
			Map<String,String> user = users.get(i);
			System.out.print("이름 : " + user.get("name"));
			System.out.print(", 아이디 : " +user.get("id"));
			System.out.println(", 나이 : " + user.get("age"));
		}
		
		for(Map<String,String> user : users) {
			System.out.print("이름 : " + user.get("name"));
			System.out.print(", 아이디 : " +user.get("id"));
			System.out.println(", 나이 : " + user.get("age"));
		}
		/*
		for(Map<String,String> user : users) {
			System.out.println(user.get("name"));
			System.out.println(user.get("age"));
			System.out.println(user.get("id"));
		}
		*/
		/*
		Map<String,String> map = new HashMap<String, String>();
		map.put("name","홍길동");
		map.put("age", "22");
		map.put("id", "hong");
		Map<String,String> map1 = new HashMap<String, String>();
		map1.put("name","임꺽정");
		map1.put("age", "33");
		map1.put("id", "lim");
		Map<String,String> map2 = new HashMap<String, String>();
		map2.put("name","유관순");
		map2.put("age", "16");
		map2.put("id", "yu");
		
		List<Map<String,String>> maps = new ArrayList<>();
		maps.add(map);
		maps.add(map1);
		maps.add(map2);
		*/
	}
}
