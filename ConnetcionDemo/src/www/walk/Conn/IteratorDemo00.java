package www.walk.Conn;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 实例化一个集合
		 */
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < 5; i++) {
			/**
			 * 将数字能换为char，再转换为string
			 */
			list.add(Character.toString((char)('A'+i)));
		}
		/**
		 * 创建一个Iter
		 */
		Iterator<String> iter = list.iterator();
//		while (iter.hasNext()) {
//			System.out.println(iter.next());
//		}
		while (iter.hasNext()) {
			String string = iter.next();
			if ("A".equals(string)) {
				iter.remove();
			}else {
				System.out.println(string);
			}
		}
	}

}
