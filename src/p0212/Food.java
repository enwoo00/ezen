package p0212;


public class Food {

	private String name;
	private  int price;
	private String type;
	
	public void getName(String name) {
		this.name=name;
	}
	public String setName() {
		return name;
	}
	
	public void getPrice(int price) {
		this.price = price;
	}
	public int setPrice(){
		return price;
	}
	public void getType(String type) {
		this.type=type;
	}
	public String setType() {
		return type;
	}
	public String toString() {
		return name+price+type;
	}
	
	
}
