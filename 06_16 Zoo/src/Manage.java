import java.util.*;

// 동물원 관리 프로그램
// 동물 - 이름, 종, 나이, 무게, 담당조련사
// 직원 - 이름, 역할 (역할 중 "조련사"는 동물들을 담당)

// 동물은 육식, 초식으로 나누어서 관리

// 기능: 
// 주식으로 분류하여 동물 목록을 볼 수 있음.
// 조련사 담당에 따라 동물 목록을 볼 수 있음.
// 동물 종류에 따라 볼 수 있음.
// 동물 변경, 추가, 삭제
// 직원 변경, 추가, 삭제

public class Manage {
	int animalNum = 10;
	int staffNum = 6;
	Animal[] animals = new Animal[animalNum];
	Staff[] staffs = new Staff[staffNum];
	Scanner sc = new Scanner(System.in);

	private void inputMembers() {

		staffs[0] = new Tamer("에이미", "사육사"); // 초식
		staffs[1] = new Tamer("제이크", "사육사"); // 육식
		staffs[2] = new Tamer("팀", "사육사"); // 잡식
		staffs[3] = new Staff("도라", "운영");
		staffs[4] = new Staff("렉스", "청소");
		staffs[5] = new Staff("카샤", "사장");

		// String name, String species, int age, double weight, String tamerName
		animals[0] = new EatGrassAnimal("aa", "코끼리", 5, 200);
		animals[1] = new EatGrassAnimal("bb", "코끼리", 1, 100);
		animals[2] = new EatGrassAnimal("cc", "기린", 4, 60);
		animals[3] = new EatAllAnimal("dd", "곰", 6, 60);
		animals[4] = new EatAllAnimal("ee", "곰", 1, 17);
		animals[5] = new EatAllAnimal("ff", "곰", 9, 100);
		animals[6] = new EatMeatAnimal("gg", "늑대", 4, 80);
		animals[7] = new EatMeatAnimal("hh", "늑대", 8, 80);
		animals[8] = new EatMeatAnimal("ii", "호랑이", 6, 12);
		animals[9] = new EatMeatAnimal("jj", "호랑이", 5, 90);

	}

	public Manage() {
		run();
	}

	private void printAll(Object[] array) {
		for (Object a : array) {
			System.out.println(a);
		}
	}
	
	private Animal inputAnimalShort() {
		Animal a;
		System.out.println("동물의 이름, 종 차례로 입력");
		String inputName = sc.next();
		String inputSpecies = sc.next();
		a = new EatMeatAnimal(inputName, inputSpecies, 0, 0);
		return a;
	}

	/*
	 * 1번 메뉴 정렬 출력 구현
	 * 
	 */

	private Animal[] SelectSortRule() {
		int num;
		Animal[] copy = Arrays.copyOf(animals, animalNum);
		System.out.println("1. 종(오름차순) | 2. 종(내림차순) ");
		System.out.println("3. 식성(오름차순) | 4. 식성(내림차순) ");
		num = sc.nextInt();

		Comparator<Animal> a = new Comparator<Animal>() {
			@Override
			public int compare(Animal o1, Animal o2) {
				if (num == 1) {
					return o1.getSpecies().compareTo(o2.getSpecies());
				} else if (num == 2) {
					return o2.getSpecies().compareTo(o1.getSpecies());
				} else if (num == 3) {
					return o1.getTaste() - o2.getTaste();
				} else if (num == 4) {
					return o2.getTaste() - o1.getTaste();
				} else {
					System.out.println("잘못된 입력. 종 오름차순 출력");
					return 0;
				}
			}
		};
		Arrays.sort(copy, a);
		return copy;
	}

	/*
	 * 2번 메뉴 객체 추가 구현
	 */

	private Staff inputStaff() {
		Staff input;
		System.out.println("직원의 이름, 역할 차례로 입력");
		String inputName = sc.next();
		String inputRole = sc.next();

		if (inputRole.equals("사육사"))
			input = new Tamer(inputName, inputRole);
		else
			input = new Staff(inputName, inputRole);
		return input;
	}

	private Animal inputAnimal() {
		Animal input;
		System.out.printf("동물의 식성 정보 입력   1. 육식 / 2. 초식 / 3. 잡식  :  ");
		int inputTaste = 0;
		do {
			inputTaste = sc.nextInt();
			if (!(0 < inputTaste && inputTaste < 4))
				System.out.println("잘못된 입력. 다시 입력");
		} while (!(0 < inputTaste && inputTaste < 4));

		System.out.println("동물의 종, 이름, 나이, 무게 입력");
		String inputSpecies = sc.next();
		String inputName = sc.next();
		int inputAge = sc.nextInt();
		double inputWeight = sc.nextDouble();
		if (inputTaste == 1)
			input = new EatMeatAnimal(inputName, inputSpecies, inputAge, inputWeight);
		else if (inputTaste == 2)
			input = new EatGrassAnimal(inputName, inputSpecies, inputAge, inputWeight);
		else
			input = new EatAllAnimal(inputName, inputSpecies, inputAge, inputWeight);
		return input;
	}

	private Object[] addMembers(Object[] input) {
		Object[] add = Arrays.copyOf(input, input.length + 1);
		return add;
	}

	/*
	 * 3번 메뉴 객체 삭제 구현
	 */

	private Object[] reduceArray(Object[] input) {
		Object[] remove = Arrays.copyOf(input, input.length - 1);
		return remove;
	}

	private int deleteObjectInArray(Object input, Object[] array, int arrayNum) {
		for (int i = 0; i < arrayNum; i++) { // 조회해서
			if (input.equals(array[i])) { // 같은 대상을 찾아
				array[i] = array[arrayNum - 1]; // 덮어씌워
				array[arrayNum - 1] = null; // 지우고
				array = reduceArray(array); // 배열길이 줄이기
				arrayNum--; // staffNum 줄이기
				System.out.println("삭제 완료");
			}
		}
		return arrayNum;
	}

	/*
	 * 4번 메뉴 검색 구현
	 */

	/*
	 * 5번 메뉴 정보 수정 구현
	 */

	private void run() { // 동작부
		inputMembers();
		int selectClass;
		String kind = null;
		int num;

		System.out.println("=============================");
		System.out.println("=======동물원 관리 프로그램=======");

		while (true) {
			System.out.println("=============================");
			System.out.println("<상위 메뉴>");
			System.out.println("1. 직원 관리");
			System.out.println("2. 동물 관리");
			System.out.println("3. 사육 관리");
			System.out.println();
			System.out.println("9. 프로그램 종료");
			System.out.print("입력:  ");

			selectClass = sc.nextInt();
			if (selectClass == 1) {
				kind = "직원";
			} else if (selectClass == 2) {
				kind = "동물";
			} else if (selectClass == 3) {

			} else if (selectClass == 9) {
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("잘못된 입력");
				continue;
			}
			//////// 사육메뉴 시작
			if (selectClass == 3) {
				System.out.println("-----------------------------");
				System.out.println("<하위 메뉴>");
				System.out.printf("1. 조련사 목록 출력");
				System.out.printf("2. 조련사 별 사육 동물 출력");
				System.out.println(((Tamer) staffs[0]).getTamedAnimal());
				System.out.print("입력:  ");
				num = sc.nextInt();
				System.out.println("=============================");
			//////// 사육메뉴 끝
			} else {
				System.out.println("-----------------------------");
				System.out.println("<하위 메뉴>");
				System.out.printf("1. %s 목록 출력\n", kind);
				System.out.printf("2. %s 추가\n", kind);
				System.out.printf("3. %s 삭제\n", kind);
				System.out.printf("4. %s 검색\n", kind);
				System.out.printf("5. %s 정보 수정\n", kind);
				System.out.print("입력:  ");
				num = sc.nextInt();
				System.out.println("=============================");
				if (num == 1) {

					System.out.println("<목록 출력>");
					if (selectClass == 1) {
						System.out.println("<이름>\t<역할>");
						printAll(staffs);
					} else {
						Animal[] a = SelectSortRule();
						System.out.println("<종>\t<이름>\t<나이>\t<무게>\t<비고>");
						printAll(a);
					}

				} else if (num == 2) {
					System.out.println("<추가>");
					if (selectClass == 1) {
						staffs = (Staff[]) addMembers(staffs);
						staffs[staffNum] = inputStaff();
						staffNum++;
					} else {
						animals = (Animal[]) addMembers(animals);
						animals[animalNum] = inputAnimal();
						animalNum++;
					}

				} else if (num == 3) {
					System.out.println("<삭제>");
					System.out.println("지울 대상의 정보 입력");
					if (selectClass == 1) {
						Staff input = inputStaff(); // 대상 정보 입력받으면
						staffNum = deleteObjectInArray(input, staffs, staffNum); // 삭제 진행
					} else {
						Animal input = inputAnimalShort();
						animalNum = deleteObjectInArray(input, animals, animalNum);
					}

				} else if (num == 4) {
					System.out.println("<검색>");
					if (selectClass == 1) {
						System.out.println("이름 검색 / 직업 검색");
					} else {
						System.out.println("이름 검색 / 식성 검색 / 종 검색");
					}
				} else if (num == 5) {
					System.out.println("<정보 수정>");
					if (selectClass == 1) {
						System.out.println("이름 검색 / 직업 검색");
					} else {
						System.out.println("이름 검색 / 식성 검색 / 종 검색");
					}
				} else {
					System.out.println("잘못된 입력");
				}
			}
		}
	}
}
