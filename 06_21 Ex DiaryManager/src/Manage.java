import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

// 일기 관리 프로그램
// 일기 (날짜, 제목, 날씨, 내용 등등)

// 일기 등록
// 같은 날짜에는 일기 중복 X

// 일기 목록 볼 수 있음
// 날짜 순, 내용 길이 순

// 날짜를 선택해서 해당 일기 내용 수정 가능
// 삭제: 가장 오래된 일기가 삭제됨.
// (선택 삭제 구현은 셀프)

public class Manage {
	private Scanner sc = new Scanner(System.in);
	private SimpleDateFormat d = new SimpleDateFormat("yy / mm / dd");
	private final int WRITE_DIARY = 1;
	private final int OVERVIEW_DIARY = 2;
	private final int EDIT_DIARY = 3;
	private final int DELETE_DIARY = 4;
	private final int SYSTEM_BREAK = 0;
	private List<Diary> diarybook = new LinkedList<>();
	private int num = 99;

	public Manage() {
		manage();
	}

	private LocalDate inputDate() {
		System.out.print("오늘 날짜의 일기일까? 1. 예 / 2. 아니오\t");
		if (sc.nextInt() == 1) {
			return LocalDate.now();
		} else {
			System.out.println("연도 / 월 / 일 순으로 입력하기");
			int inputY = sc.nextInt();
			int inputM = sc.nextInt();
			int inputD = sc.nextInt();
			return LocalDate.of(inputY, inputM, inputD);
		}
	}

	private Diary inputDiaryShort() {
		System.out.println("일기의 제목을 입력하자.");
		sc.nextLine();
		String inputTitle = sc.nextLine();
		LocalDate inputDate = inputDate();
		return new Diary(inputTitle, inputDate);
	}

	private void writeDiary() {
		System.out.print("제목을 입력하자.\t");
		sc.nextLine();
		String inputTitle = sc.nextLine();
		LocalDate inputDate = inputDate();
		System.out.print("날씨는 어땠을까?\t");
		String inputWeather = sc.next();
		System.out.println("일기는 한줄로 써보기");
		sc.nextLine();
		String inputContent = sc.nextLine();
		diarybook.add(new Diary(inputTitle, inputDate, inputWeather, inputContent));
	}

	private void printDiaryAll(Diary a) {
		System.out.printf("[%s / %s] %s\n", d.format(a.getDate()), a.getWeather(), a.getTitle());
		System.out.println("----------------------------------");
		System.out.println(a.getContents());
	}

	private Diary findEqualsDiary(Diary a) {
		for (Diary b : diarybook) {
			if (b.equals(a))
				return b;
		}
		return null;
	}

	private void manage() {
		System.out.println("==========나의 일기장 ver.1==========");
		while (true) {
			try {
				System.out.println("================================");
				System.out.println("1. 일기를 쓰자");
				System.out.println("2. 일기를 읽자");
				System.out.println("3. 일기를 편집하자");
				System.out.println("4. 일기를 지우자");
				System.out.println();
				System.out.println("0. 일기 그만 쓸래");
				System.out.print("무얼 할까?\t");
				num = sc.nextInt();
				System.out.println("================================");
				if (num == WRITE_DIARY) {
					System.out.println("<일기 쓰기>");
					writeDiary();
				} else if (num == OVERVIEW_DIARY) {
					System.out.println("<일기 열람하기>");
					for (Diary a : diarybook)
						System.out.println(a);
					System.out.print("일기를 자세히 볼까? 1.예 / 2.아니오\t");
					int input = sc.nextInt();
					if (input == 1) {
						System.out.println("열람할 일기 정보 입력.");
						Diary inputd = inputDiaryShort();
						if (findEqualsDiary(inputd) == null)
							System.out.println("찾는 일기가 없습니다.");
						else
							printDiaryAll(findEqualsDiary(inputd));
					} else {
						System.out.println("메뉴로 돌아갑니다.");
					}

				} else if (num == EDIT_DIARY) {
					System.out.println("<일기 편집하기>");
					System.out.println("수정할 일기 입력");
					Diary inputd = inputDiaryShort();
					if (findEqualsDiary(inputd) == null)
						System.out.println("찾는 일기가 없습니다.");
					else
						diarybook.remove(findEqualsDiary(inputd));
					writeDiary();

				} else if (num == DELETE_DIARY) {
					System.out.println("<일기 지우기>");
					System.out.println("지울 일기 입력");
					Diary inputd = inputDiaryShort();
					if (findEqualsDiary(inputd) == null)
						System.out.println("찾는 일기가 없습니다.");
					else
						diarybook.remove(findEqualsDiary(inputd));
					System.out.println("일기 수정 완료");
				} else if (num == SYSTEM_BREAK) {
					System.out.println("<프로그램 종료>");
					System.out.println("일기장을 덮습니다.");
					System.out.println("================================");
					break;
				} else if (num == 99) {
				} else {
					System.out.println("잘못된 입력입니다.");
				}
			} catch (Exception e) {
				System.out.println("잘못된 입력입니다.");
				sc.nextLine();
				num = 99;
			}
		}
	}
}
