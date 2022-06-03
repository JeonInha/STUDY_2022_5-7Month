import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class TestDateMethods {

	public static void main(String[] args) {
		LocalDate tommorw=LocalDate.now().plusDays(1);
		System.out.println(tommorw);
		
		
		
		//내일 날짜 객체
		LocalDate tommorw2=LocalDate.of(2022, 6, 4);
		System.out.println(tommorw2);
		System.out.println(tommorw.equals(tommorw2));

		Calendar now=Calendar.getInstance();
		now.set(2022, Calendar.JUNE, 8);
		now.add(Calendar.DAY_OF_MONTH, 3);
		
		
		
		Date date=now.getTime();
	}

}
