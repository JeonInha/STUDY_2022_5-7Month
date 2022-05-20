import java.util.Scanner;

public class Ex2 {
  public static void main(String[] args) {
	  
	  Scanner sc=new Scanner(System.in);
	  System.out.print("오늘의 날씨는? ");
	  
	  String weather = sc.nextLine();
	  
	  if (weather.equals("비")) {
		  	System.out.println("우산을 꼭꼭 챙겨요");
	  }
	  
	  System.out.println("좋은 하루 보내세요");
	  
	  
	  System.out.println("****************");
	  
	  int a;
	  System.out.print("정수 입력: ");
	  a=sc.nextInt();
	  if (a%2==0&&a!=0) {
		System.out.println("입력한 정수는 짝수입니다.");
	  } else {
		System.out.println("입력한 정수는 홀수입니다.");
	  }
	  
	   System.out.println("****************");
	   
	   int score;
	   System.out.print("점수 입력: ");
	   score=sc.nextInt();
	   if (score>=60) {
		   System.out.println("합격하였습니다.");
	   } else {
	   System.out.println("불합격하였습니다.\n"+"점수: "+score); }
	   
	   System.out.println("****************");


       int n1, n2, div, mod;
	   System.out.print("정수 1 입력: ");
	   n1=sc.nextInt();
	   System.out.print("정수 2 입력: ");
	   n2=sc.nextInt();
	   
	   if (n1==0||n2==0) {
	   System.out.print("0으로는 나눌 수 없습니다. 다시 입력하세요.\n정수 1 입력: ");
	   n1=sc.nextInt();
	   System.out.print("정수 2 입력: ");
	   n2=sc.nextInt();
	   }
	   
	   if (n1>n2) {
		   div=n1/n2;
		   mod=n1%n2;
	   } else {
		   div=n2/n1;
		   mod=n2%n1;
	   }
	   System.out.printf("몫: %d\n나머지: %d\n", div, mod);
	   
	   
	   System.out.println("****************");
	   
	   int x1, x2, x3, big;
	   
	   System.out.print("정수 1 입력: ");
	   x1=sc.nextInt();
	   System.out.print("정수 2 입력: ");
	   x2=sc.nextInt();
	   System.out.print("정수 3 입력: ");
	   x3=sc.nextInt();
	   
	   if (x1==x2||x2==x3||x3==x1) {
		 System.out.print("같은 수가 있으면 안됩니다.");
	   } else {
	   if (x1>x2&&x2>x3) {
		   big=x1;
	   } else if (x2>x3) {
		   big=x2;
	   } else {
		   big=x3;
	   }	   
  	   System.out.printf("가장 큰 수: %d\n", big); 	   
	   }



	   System.out.println("****************");
       System.out.print("컵의 용량 입력: ");
	   String size;
   	   int cup=sc.nextInt();
	   
	   if (cup>=200) {
		 size="large";
	   } else if (cup>=100 && cup<200) {
		 size="medium";
	   } else {
		 size="small";
	   }
	   System.out.println("사이즈는 "+size);

	  
  }
}