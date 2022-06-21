import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

interface LeafletHandler {
	String give();
}

class LoanAd implements LeafletHandler {
	String tel;

	public LoanAd(String tel) {
		super();
		this.tel = tel;
	}

	@Override
	public String give() {
		return String.format("[빠른 대출 상담 tel.%s]", tel);
	}
}

class ElectionAd implements LeafletHandler {
	LocalDate date;
	
	public ElectionAd(LocalDate date) {
		super();
		this.date = date;
	}

	@Override
	public String give() {
		String dateArray = date.format(DateTimeFormatter.ofPattern("dd.MMMM yyyy"));
		return String.format("[국민을 위한 기호 0번 / %s ]", dateArray);
	}
}

// 위의 인터페이스를 구현하는 클래스를 작성하세요.
// 일수 광고 전단지 제공자
// 전화번호가 포함되어야함.

// 선거 광고 전단지 제공자
// 선거 날짜가 포함되어야함.

// ------------
// 광고대행사
// 일수광고/선거광고

class Adcompany {
	private LeafletHandler ad;

	public Adcompany(LeafletHandler ad) {
		super();
		this.ad = ad;
	}

	public LeafletHandler getAd() {
		return ad;
	}

	public void setAd(LeafletHandler ad) {
		this.ad = ad;
	}

	public void consoleAD() {
		System.out.println(ad.give());

	}
}

public class Main {
	public static void main(String[] args) {
		
		Adcompany company1 = new Adcompany(new LoanAd("000-111-3333"));
		Adcompany company2 = new Adcompany(new ElectionAd(LocalDate.now()));
		company1.consoleAD();
		company2.consoleAD();
	}
}
