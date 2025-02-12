package p0211;

import java.util.HashMap;

public class MapTest2 {

	public static void main (String[] args) {
		HashMap<String,String> map = new HashMap<>();
		map.put("이름", "홍길동");
		map.put("age", "33");
		map.put("address", "한양");
		map.put("job", "도적");
		System.out.println(map);
		//ArrayList는 순서가 중요할때 사용. 인덱스에 관여할필요x-알아서 넣어줌. 사이즈만 알면 출력
		//그래서 구성원이 중요
		//Map
		//Key, value가 중요
		//순서가 없다 - 입력한대로 출력 x
		
		
	}
}
