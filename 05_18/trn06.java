import java.util.Scanner;

public class trn06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);


	int array, a1, a2, a3, a4, a5;
	
	System.out.print("5자리 수를 입력하시오: ");
	array=sc.nextInt();
	
	a1=array/10000;
	a2=array%10000/1000;
	a3=array%1000/100;
	a4=array%100/10;
	a5=array%10;
	
	System.out.print(a5);
	System.out.print(a4);
	System.out.print(a3);
	System.out.print(a2);
	System.out.print(a1);
	
	}
}
	