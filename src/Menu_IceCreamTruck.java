
public class Menu_IceCreamTruck implements Popsicle_Menu {
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	Popsicle[] popsicle_list;
  
	public Menu_IceCreamTruck() {
		popsicle_list = new Popsicle[MAX_ITEMS];
 
		addItem("Drumstick", "The Original Sundae Cone",  1.00);
		addItem("Ice Cream Sandwich", "What it says on the tin", 1.25);
		addItem("Dreamsicle", "Vanilla ice cream wrapped in orange sherbert, on a stick", 1.00);
		addItem("Strawberry Popsicle", "Frozen strawberry ice with chunks of real strawberries" , 1.25);
		addItem("Strawberry DoublePop", "Two strawberry popsicles stuck together", 2.00);
		addItem("Firecracker", "These red, white and blue frozen pops are a classic summertime treat!", 1.25);
	}
  
	public void addItem(String name, String type, double price) 
	{
		Popsicle popsicle = new Popsicle(name, type, price);
		if (numberOfItems >= MAX_ITEMS) {
			System.err.println("Sorry, menu is full!  Can't add item to menu");
		} else {
			popsicle_list[numberOfItems] = popsicle;
			numberOfItems = numberOfItems + 1;
		}
	}
 
	public Popsicle[] getMenuItems() {
		return popsicle_list;
	}
  
	public Iterator_IceCreamTruck createIterator() {
		return new Iterator_IceCreamTruck(popsicle_list);

	}
	public String getVendorName() {
		return "Mike's Ice Cream Truck";
	}

}