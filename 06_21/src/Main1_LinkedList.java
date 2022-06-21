import java.util.Iterator;
import java.util.LinkedList;

public class Main1_LinkedList {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("문자열 1");
		list.add("문자열 1");
		list.add("문자열 1");
		list.add("문자열 1");
		
		list.get(0);
		list.get(1);
		list.get(2);
		list.get(3);
		
		for (int i=0; i<list.size(); i++)
			list.get(i);
		
		for (String s : list) {
			System.out.println(s);
		}
		
		Iterator<String> iter = list.iterator();
		while (iter.hasNext())
			iter.next();
		
		// 여기까진 노차이
	}

}
