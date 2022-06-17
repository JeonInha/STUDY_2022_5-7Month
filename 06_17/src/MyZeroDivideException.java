import java.time.LocalTime;

public class MyZeroDivideException extends Exception {
	public MyZeroDivideException (String message) {
		super (message+", "+LocalTime.now() + "에 발생하였음");
	}
}
