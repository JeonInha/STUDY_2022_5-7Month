public class TypeConversion_p96 {
	public static void main(String[] args) {
		
		int i;
		double f;
		
		f=5/4;
		System.out.println(f);
		f=(double)5/4;
		System.out.println(f);
		f=5/(double)4;
		System.out.println(f);
		f=(double)5/(double)/4;
		System.out.println(f);
		i=(int)1.3+(int)1.8;
		System.out.println(f);
		i=(int)(1.3+1.8);
		System.out.println(f);

// 형변환은 우선순위가 높다는 것을 알 수 있음.
		