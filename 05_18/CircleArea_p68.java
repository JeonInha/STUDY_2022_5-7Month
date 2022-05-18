import java.util.Scanner;

public class CircleArea_p68 {
	public static void main(String args[]) {
		
		double radius;
		double area;
		Scanner input = new Scanner(System.in);
		System.out.print("반지름을 입력하시오");
		radius = input.nextDouble();
		area=Math.PI*radius*radius;
		
		System.out.println(area);
	}
}