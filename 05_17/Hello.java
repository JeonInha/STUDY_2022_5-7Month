import java.util.Scanner;

public class Hello {  
// Hello 라는 클래스 지정
    public static void main(String args[]) { 
// 메인 메소드(method) - 프로그램의 시작점
        System.out.println("Hello World"); 
// 문장(statement) 문장의 끝은 세미콜론;
        System.out.println("12345");
        System.out.println("input two number you wanna sum");
        
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a+b);
    }
}


/* 여러줄의 주석은 이렇게
이렇게 쓰는거야
*/

// 주석(Comment) - 사람을 위해 남겨두는 메모

// "" -> 문자열 데이터타입 (String). 글자들.
// 문장의 수행순서는 순차적. 이것을 '절차수행'이라고 함.