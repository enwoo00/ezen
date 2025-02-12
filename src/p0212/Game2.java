package p0212;

public class Game2 {
	private String name;
	private double capacity;
	private String company;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void setCapacity(double capacity) {
		this.capacity=capacity;
	}
	public double getCapacity() {
		return capacity;
	}
	
	public void setCompany(String company) {
		this.company=company;
	}
	public String getCompany() {
		return company;
	}
	
	public String toString() {
		return "[name="+name+", capacity="+capacity+"GB, company="+company+"]";
	}

}
