package ex08_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class LoopForHashMap {

	public static void main(String[] args) {

		Map<String, String> me = new HashMap<String, String>();

		me.put("name", "민경태");
		me.put("age", 44 + "");
		me.put("phone", "010-8725-4966");

		// 1. 향상 for문은 Key를 뺍니다. (Key를 이용해서 Value를 빼기 때문입니다.)
		// me에서 key만 빼는 메소드 : keySet()
		Set<String> keys = me.keySet();
		for (String key : keys) {
			System.out.println(key + ": " + me.get(key));
		}

		// 2. Iterator 인터페이스
		Iterator<String> itr = keys.iterator();

		while (itr.hasNext()) {
			String key = itr.next();
			String value = me.get(key);
			System.out.println(key + ": " + value);
		}

	}

}
