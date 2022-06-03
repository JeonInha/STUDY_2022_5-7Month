import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

class Method {
	public LocalDate inputDates() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1: 날짜 입력 / 2: 오늘 날짜");
		int input = sc.nextInt();
		if (input == 1) {
			System.out.println("날짜 입력 (yyyy mm dd)");
			int yyyy = sc.nextInt();
			int mm = sc.nextInt();
			int dd = sc.nextInt();
			return LocalDate.of(yyyy, mm, dd);
		} else if (input == 2)
			return LocalDate.now();
		else {
			System.out.println("존재하지 않는 날짜");
			return LocalDate.now();
		}
	}

	public int calcDate(LocalDate a) {
		int y = a.getYear();
		switch (a.getMonthValue()) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			return 31;
		case 4: case 6: case 9: case 11:
			return 30;
		case 2:
			if ((y % 4 == 0) && (y % 100 != 0) || (y % 400 == 0)) 
				return 29;
			else 
				return 28;
		}
		return 0;
	}

	public void printCalender(LocalDate today) {
		DateTimeFormatter df=DateTimeFormatter.ofPattern("'Today' yy-MM-dd  eee", Locale.ENGLISH);
		System.out.println("---------------------");
		System.out.println(df.format(today));
		System.out.println("---------------------");
		System.out.println("일   월   화   수   목   금   토");

		LocalDate mon1st = LocalDate.of(today.getYear(), today.getMonthValue(), 1); // 첫째날을 구함
		int get1st = mon1st.getDayOfWeek().getValue(); // 첫날의 요일 int값
		if (get1st==7) get1st=0;
		int getlast = calcDate(mon1st); // 달의 일 수 계산

		int count = 1; // 날짜 더하기

		for (int i = 0; i < get1st; i++)
			System.out.print("   "); // 줄 맞추기 공백
		for (int i = 1 + get1st; i <= getlast + get1st; i++) {
			System.out.printf("%02d ", mon1st.plusDays(count - 1).getDayOfMonth());
			if (i % 7 == 0)
				System.out.println();
			count++;
		}
	}
}

public class PrintCalendar {
	public static void main(String[] args) {
		Method me = new Method();
		LocalDate today = me.inputDates();	// 날짜 입력
		me.printCalender(today);	// 달력 출력
	}
}
