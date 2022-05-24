import java.util.*;

public class Factorial_122p {
	public static void main(String[] args) {
		long fact=1;
		int n;
		
		System.out.printf("input Inteager: ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		for (int i=1; i<=n; i++) fact=fact*i;
		
		System.out.printf("%d! is %d.\n", n, fact);
	}
}