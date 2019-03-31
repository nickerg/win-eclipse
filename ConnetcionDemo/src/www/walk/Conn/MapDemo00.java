package www.walk.Conn;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map = new HashMap<String,String>();
		map.put("key1", "hello ");
		map.put("key2", "my ");
		map.put("key3", "name ");
		map.put("key4", "is ");
		map.put("key5", "?");
		String string = map.get("key1");//通过key获得value
		System.out.println(string);
//		System.out.println(map.keySet());
//		System.out.println(map.values());
		/**
		 * 获得key
		 */
		Set<String> set = map.keySet();
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next()+"\t");
		}
		System.out.println();
		/**
		 * 获得所有value
		 */
		Collection<String> collection = map.values();
		Iterator<String>iterator2 =collection.iterator();
		while (iterator2.hasNext()) {
			System.out.print(iterator2.next()+"\t");
		}
		
	}

}
