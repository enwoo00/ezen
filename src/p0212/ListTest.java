package p0212;

import java.util.ArrayList;
import java.util.HashMap;

public class ListTest {

	public static void main(String[] args) {
		ArrayList<Human> people = new ArrayList<> (); //human만 저장
		for (int i=1;i<=10;i++) {
			Human h = new Human();
			//0-0.9999 * => 0.99.9999=> 0-99 +1 => 1-100
			int age = (int)(Math.random()*100)+1;
			//0-0.9999 * 50 => 0-49.9999=>0-49+50=>50-99
			int weight = (int)(Math.random()*50)+50;
			
			h.setAge(age);
			h.setName("이름"+i);
			h.setAddress("주소"+i);
			h.setWeight(weight);
			people.add(h);
		}
		System.out.println(people);
		
		for(int i=0; i<people.size(); i++) {
			Human h = people.get(i);
			System.out.println(h);
			
		}
		for(Human h:people) {
			System.out.println(h);
			
		}
		/*HashMap<String,String> human = new HashMap();
		human.put("name","홍길동");
		human.put("age","30");
		human.put("address","서울");
		human.put("weight","70.5");
		
		Human h = new Human();
		h.setAge(30);
		h.setName("홍길동");
		h.setAddress("서울");
		h.setWeight(70.5);
		ArrayList<Human> people = new ArrayList<> (); //human만 저장
		ArrayList<HashMap<String,String>> nums = new ArrayList<>();*/
	}
}
