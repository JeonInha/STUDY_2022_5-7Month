import java.util.*;

class Can {
	private String name;
	
	public Can(String name) {
		this.name=name;
	}
	
	public String toString() {
		return name;
	}
}


public class someMethod_Can {
	
	public final int COLA=1;
	public final int SODA=2;
	public final int FANTA=3;
	
	Can cola=new Can("콜라");
	Can soda=new Can("사이다");
	Can fanta=new Can("판타");
	
	public Can printCan(int a) {
		if (a==COLA) {
			return cola;
		} else if (a==SODA) {
			return soda;
		} else if (a==FANTA) {
			return fanta;
		} return null;
	}
	
	public Can printCan(String a) {
		if (a.equals(cola.toString())) {
			return cola;
		} else if (a.equals(soda.toString())) {
			return soda;
		} else if (a.equals(fanta.toString())) {
			return fanta;
		} else return null;
	}
	
	public static void main(String[] args) {
		someMethod_Can can=new someMethod_Can();	
	System.out.println(can.printCan(1));
	System.out.println(can.printCan("콜라"));
	
	}
}
	
	// 자판기 메소드
	// 정수형 => 반환 타입: Can
	// 1 -> field "콜라"
	// 2 -> field "사이다"
	
	// 문자열 -> 반환Type: Can
	// "Cola" -> field "콜라"


