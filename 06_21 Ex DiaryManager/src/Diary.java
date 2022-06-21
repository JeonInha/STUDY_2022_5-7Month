import java.time.LocalDate;
import java.util.*;

class judgeDate implements Comparator<Diary> {
	public int compare(Diary o1, Diary o2) {
		return o1.getDate().compareTo(o2.getDate());
	}
}

class judgeConLength implements Comparator<Diary> {
	public int compare(Diary o1, Diary o2) {
		return o1.getContents().length() - o2.getContents().length();
	}
}

public class Diary {
	private String title;
	private LocalDate date;
	private String weather;
	private String contents;
	
	public Diary(String title, LocalDate date, String weather, String contents) {
		super();
		this.title = title;
		this.date = date;
		this.weather = weather;
		this.contents = contents;
	}
	
	public Diary(String title, LocalDate date) {
		super();
		this.title = title;
		this.date = date;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Diary) {
			Diary o = (Diary) obj;
			return (this.getDate()==o.getDate());
		}
		else return false;
	}

	@Override
	public String toString() {
		return String.format("[%s / %s] %s ", date, weather, title);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getWeather() {
		return weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}
	
}
