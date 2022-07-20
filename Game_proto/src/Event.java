public class Event {
	
	String opstory;
	String select1;
	String select2;
	String edStroy1;
	String edStory2;
	String select1_result;
	String select2_result;
	int id;
	String needitem;
	double random;
	
	public Event(String opstory, String select1, String select2, String edStroy1, String edStory2,
			String select1_result, String select2_result, int id, String needitem, double random) {
		super();
		this.opstory = opstory;
		this.select1 = select1;
		this.select2 = select2;
		this.edStroy1 = edStroy1;
		this.edStory2 = edStory2;
		this.select1_result = select1_result;
		this.select2_result = select2_result;
		this.id = id;
		this.needitem = needitem;
		this.random = random;
	}
}
