
public class Popsicle {
	String name;
	String description;
	double price;

	
	public Popsicle(String name, String description, double price) {
		this.name = name;
		this.description = description;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public double getPrice() {
		return price;
	}

	public String toString() {
		// code to display pizza name and ingredients
		StringBuffer display = new StringBuffer();
		display.append("This is a " + name + ".\n");
		return display.toString();
	}
}