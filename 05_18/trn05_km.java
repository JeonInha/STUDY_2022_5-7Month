import java.util.Scanner;

public class trn05_km {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double mile;
		
		System.out.print("마일을 입력하시오: ");
		mile=sc.nextDouble();
	System.out.println(mile+"마일은 "+(mile*1.609)+"킬로미터입니다.");
	System.out.println("****************");
	
	
	///////////////////////////////
	
	
	int money, total;
	
	System.out.print("받은 돈: ");
	money=sc.nextInt();
	System.out.print("상품의 총액: ");
	total=sc.nextInt();
    System.out.println("부가세: "+total*0.1);
	System.out.println("잔돈: "+(money-total));
	System.out.println("****************");

	
	//////////////////////////////////////////
	
	double r;
	
	System.out.print("반지름: ");
	r=sc.nextDouble();
	System.out.println("구의 부피: "+r*r*r*4.0/3.0);
	System.out.println("****************");
	
	/////////////////////////////////////////
	
    int m500, m100, m50, m10;
	System.out.print("500원 동전의 갯수: ");
	m500=sc.nextInt();
	System.out.print("100원 동전의 갯수: ");
	m100=sc.nextInt();
	System.out.print("50원 동전의 갯수: ");
	m50=sc.nextInt();
	System.out.print("10원 동전의 갯수: ");
	m10=sc.nextInt();
	System.out.println("금액: "+(m500*500 +m100*100 +m50*50 +m10*10));
	System.out.println("****************");
	
	
	/////////////////////////////////////////
	
	int a, b, big, small;
	System.out.print("정수를 입력하시오: ");
	a=sc.nextInt();
	System.out.print("정수를 입력하시오: ");
	b=sc.nextInt();
	
	big=Math.max(a, b);
	small=Math.min(a, b);
	System.out.println(big+"를 "+small+"으로 나눈 몫은 "+(big/small)+"이고 나머지는 "+(big%small)+"입니다.");
	System.out.println("****************");
	
	///////////////////////////////////////////////
	
	
	}
}