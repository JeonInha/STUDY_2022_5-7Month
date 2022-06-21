import java.util.LinkedList;
import java.util.Queue;

public class Main3_Queue {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		
		queue.offer("원소 1"); //Q의 추상메소드. add와같은동작
		queue.add("원소2");
		
		System.out.println(queue);
		
		String elem1 = queue.poll(); // 원소가 없으면 null 반환
		String elem2 = queue.remove(); // 원소가 없으면 예외 발생
		
		System.out.println(elem1);
		System.out.println(elem2);
		
		System.out.println(queue.size());

	}

}
