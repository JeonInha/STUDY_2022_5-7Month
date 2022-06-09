import java.util.Scanner;

public class Ex1 {
	Scanner sc=new Scanner(System.in);
	int input;
	
	public void movieSeatManage() {
		boolean[] movieSeat = new boolean[10];	//boolean으로 생성. true: 이선좌
		for (int i=5; i<8; i++)		// 초기화
			movieSeat[i] = true;
		
		while (true) {	// 좌석예매 무한루프
			System.out.println("----------------------------------------");
			System.out.print("좌석을 예약하시겠습니까?  1/0   ");
			input=sc.nextInt();
			
			if (input==0) {		// 좌석 예매 no
				System.out.println("좌석예매 시스템을 종료합니다.");
				break;	
				
			} else if (input==1){	// 좌석 예매 no
				System.out.println("현재의 예약 상태는 다음과 같습니다.");	//좌석 출력
				System.out.println("----------------------------------------");
				System.out.println(" 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10|");
				
				for (int i=0; i<movieSeat.length; i++) {	// 현재 예매된 좌석 출력
					System.out.printf(" %d |", (movieSeat[i]) ? 1 : 0);
				}
				
				System.out.println("\n----------------------------------------");
				
				System.out.print("몇번째 좌석을 예매하시겠습니까?   ");	//좌석 예매
				input=sc.nextInt();
				
				if (input>10||input<1)	// 예매 잘못 입력
					System.out.println("잘못된 입력. 처음으로 돌아갑니다.");
				
				else if (movieSeat[input-1])	// 이선좌 예매 시도
					System.out.println("이미 선택된 좌석입니다. 처음으로 돌아갑니다.");
				
				else {	// 예매 성공
					movieSeat[input-1] = true;	
					System.out.println("예약되었습니다.");
				}
				
			} else	// 좌석 예매 잘못된 입력
				System.out.println("잘못된 입력입니다.");
		}
	}

	
	/////////////////////////////////////////////////
	public void histogram() {
		int[] histogram = new int[10];
		for (int i=0; i<10; i++) {
			System.out.printf("%d번째 정수 입력: ", i+1);
			input=sc.nextInt();
			if (input>100||input<1) {
				System.out.println("잘못된 입력. 다시 입력하세요.");
				i--;		// 증감식에서 쓰는 변수는 증감식에서만 쓰자 .....
			}
			histogram[i]=input;
		}
		for (int i=1; i<=10; i++) {
			printHistogram(histogram, 1+(i-1)*10, i*10);
		}
	}
	
	public void printHistogram(int[] a, int min, int max) {
		System.out.printf("%d-%d: ", min, max);
		for (int i=0; i<10; i++) {
			if (a[i]>=min&&a[i]<=max)
				System.out.print("*");
		}
		System.out.println();
	}
		
	public static void main(String[] args) {
		Ex1 ex=new Ex1();
		ex.movieSeatManage();
		ex.histogram();
	}
}
