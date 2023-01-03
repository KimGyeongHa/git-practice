package test;

import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class maptest {
	public static void main(String[] args) {
		List<Map<String,Object>> list = new ArrayList<>();
		Map<String, Object> map = new HashMap<>();
		list.add(map);
		map.put("1", 123);
		map.put("2", 456);
		map = new HashMap<>();
		map.put("2", 456);
		list.add(map);
		
		System.out.println(list);
		
		
		
		for(int i=0; i< list.size(); i++) {
			System.out.println(list.get(i).get("2"));
		}
		
	}

}
