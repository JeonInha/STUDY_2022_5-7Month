import java.util.Arrays;

class Human implements Comparable<Human> {	//제네릭//비교하고자하는 대상타입 적기
	String name;
	int tall;
	double weight;

	public Human(String name, int tall, double weight) {
		this.name = name;
		this.tall = tall;
		this.weight = weight;
	}
	
	// 키~를 기준
//	public int compare(Human h) {	// 이러한 행동으로 자바개발진들이 대소비교를 할수있음을 정의해놨음
//		return this.tall-h.tall; // 양수: 내가 큼  / 0=같음 / 음수: 내가 작음
//	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Human) {
			Human input = (Human) obj; // 다운캐스팅
			return name.equals(input.name) && tall == input.tall && weight == input.weight;
		} else
			return false;
	}
	
	@Override
	public int compareTo(Human o) {
		return this.tall-o.tall;
	}
}

public class Main_comparable {
	public static void main(String[] args) {

		Human[] members = {new Human("키 큼", 190, 80),
							new Human("키 작", 155, 45),
							new Human("키 중간", 171, 58)};
		
		System.out.println(members[0].compareTo(members[1]));
		Arrays.sort(members);
		System.out.println();
		for (Human a : members) {
		System.out.println(a.tall);
		}
	}
}
