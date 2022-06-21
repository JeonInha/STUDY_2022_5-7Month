import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main2_LinkedList {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>(Arrays.asList("a", "b", "c", "d"));
		
		list.remove(0);
		list.remove("c");
		
		LinkedList<String> down = (LinkedList<String>) list;
		down.addFirst("asdf");
		down.removeFirst();
		down.getFirst();

	}

}
