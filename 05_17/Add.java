public class Add {
    public static void main(String [] args) {

        // fdsafdsaf
//data type (자료형)
//int: 정수형
//String: 문자열
        int x;  // 변수 선언 (variable declare) 변수 x 생성; 변수 x의 자료형 타입은 int
        int y;
        int sum;
// 우아앙
//변수 이름을 정할때의 규칙
//변수 이름은 영어 소문자로 시작 (클래스 이름은 영어 대문자로 시작)
//영소문자로 시작했다면 숫자도 올 수 있음. (ex)itm01
//각각의 이름들은 대소문자를 구별.
//공백은 올 수 없음.(단어의 첫글자를 대문자로 써서 단어를 구별)(ex)bookTitle
//특수문자 사용X(예외: -, _)(ex)book-title, book_title
//특정한 의미가 있는 키워드는 변수 이름으로 사용 불가(ex) int, double 등
//변수는 다른 변수와 이름이 겹치면 안됨.
//변수 이름 변경은 힘듦; 변수를 설정할 때 적절한 이름을 쓰자.

//        초기화(initialize) 변수에 제일 초기에 값을 집어넣는 것. 변수를 사용할 때엔 꼭 해야 함. 하지 않으면 에러가 남.
        x = 100; // '같다' 라는 의미가 아님! = -> 대입연산자(assignment) 왼쪽에 있는 것을 오른쪽에 집어넣는 것.
        y = 200;
        sum = x+y;

        System.out.println(sum);

System.out.printin("내가 고작 이정도도 어려워했다니!");


        //산술연산자 공부

        System.out.println (x-y);  // 다음에 쓸일이 없음. 변수에 담지 않았음.

        int minus;
        minus = x - y;  //값을 변수에 담았음. 차후 필요할 때마다 호출 가능.
        System.out.println(minus);


//        System.out.println("ABC"/5); 
//        에러; 문자열과 숫자의 합연산은 가능하지만 합연산 외의 연산은 불가
//        System.out.println(50/0); 프로그램은 계산불가한 예외적인 상황을 마주하면 종료됨

        

        System.out.println("10 곱하기 5는 " + 10*5);
        System.out.println("22 나누기 4는 " + 22.0/4.0);
        // 연산자의 순서: 곱셈 나눗셈이 +-보다 우선한다. 괄호는 괄호 안이 우선한다.
        // 정수형으로 연산을 지시하면 결과값은 정수형; 나머지는 버려짐.
        // 연산결과가 실수이길 바란다면 실수형으로 연산을 지시하기.

        System.out.println("프로그램 정상 종료");
        



        return; // 메인메소드의 종료를 뜻함. 중괄호가 같은 의미를 해서 생략해도 무방.

//        System.out.println(123); // 리턴 아래에 문장을 쓰도달할 수 없는 문장이 되어서 에러가 남.
    }
}
