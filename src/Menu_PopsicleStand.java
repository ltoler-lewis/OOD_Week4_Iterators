import java.util.ArrayList;
import java.util.List;


public class Menu_PopsicleStand implements Popsicle_Menu {
	List<Popsicle> popsicles;
 
	public Menu_PopsicleStand() {
		popsicles = new ArrayList<Popsicle>();
    
		addItem("Red Ice Pop", "Watermelon Ice",  1.00);
		addItem("Blue Ice Pop", "Blue Rasberry Ice", 1.00);
		addItem("Green Ice Pop", "Green Apple Ice", 1.00);
		addItem("Light Green Ice Pop", "Lemon-Lime Ice" , 1.00);
		addItem("Orange Ice Pop", "Orange Ice", 1.00);
		addItem("Purple Ice Pop", "Grape Ice", 1.00);
		
	}

	public void addItem(String name, String description,double price)
	{
		Popsicle menuItem = new Popsicle(name, description, price);
		popsicles.add(menuItem);
	}
 
	public List<Popsicle> getMenuItems() {
		return popsicles;
	}
  
	public Iterator_PopsicleStand createIterator() {
		return new Iterator_PopsicleStand(popsicles);
	}
  
	public String getVendorName() {
		return "Laney's Popsicle Stand";
	}

}
