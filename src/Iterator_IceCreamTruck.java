
public class Iterator_IceCreamTruck implements Iterator_Popsicle {
	Popsicle[] items;
	int position = 0;
 
	public Iterator_IceCreamTruck(Popsicle[] items) {
		this.items = items;
	}
 
	public Popsicle next() {
	
		Popsicle popsicle = items[position];
		position = position + 1;
		return popsicle;

	}
 
	public boolean hasNext() {
		
		if (position >= items.length || items[position] == null) {
			return false; 
		} else {
			return true;
		}

	}
}