import java.time.LocalDate;	//1.8버전부터 가능
import java.util.Calendar;

public class Main {
	public static void main(String[] args) {
		
		
		
		Calendar now=Calendar.getInstance();
		System.out.println(now.get(Calendar.YEAR));
		System.out.println(now.get(Calendar.MONTH));
		System.out.println(now.get(Calendar.DAY_OF_MONTH));
		System.out.println(now.get(Calendar.DAY_OF_WEEK));
		
		//Calendar클래스의 get메소드: get 안의 상수에 따라 연, 월, 일을 출력
		// 연: 1
		// 월: 2
		// 일: 5
		// Day_OF_WEEK: 7 (요일을 숫자로 알려줌. 월=1, 토=7
		
		System.out.println("*********************************");
		LocalDate now2=LocalDate.now();
		System.out.println(now2.getYear());		// int
		System.out.println(now2.getMonth());	//month라는 객체
		System.out.println(now2.getMonthValue());	//달을 숫자값으로
		
		System.out.println(now2.getDayOfMonth());	// day
		
		System.out.println(now2.getDayOfWeek());	// 요일 객체
		System.out.println(now2.getDayOfWeek().getValue());	//요일객체에게 getValue()로 숫자값 요청
		
	}

}
