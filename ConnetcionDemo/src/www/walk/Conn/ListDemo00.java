package www.walk.Conn;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ListDemo00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> seth = new HashSet<String>();
		seth.add("A");
		seth.add("F");
		seth.add("B");
		seth.add("C");
		seth.add("E");
		seth.add("D");
		System.out.println(seth);
		Set<String> sett = new TreeSet<String>();
		sett.add("A");
		sett.add("B");
		sett.add("C");
		sett.add("F");
		sett.add("D");
		sett.add("E");
		System.out.println(sett);
	}

}
