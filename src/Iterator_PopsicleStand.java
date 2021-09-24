
import java.util.List;


public class Iterator_PopsicleStand implements Iterator_Popsicle {
	List<Popsicle> popsicles;
	int position = 0;
 
	public Iterator_PopsicleStand(List<Popsicle> items) {
		this.popsicles = items;
	}
 
	public Popsicle next() {
		
		Popsicle pop = popsicles.get(position);
		position = position + 1;
		return pop;

	}
 
	public boolean hasNext() {

		if (position >= popsicles.size()) {
			return false;
		} 
		else {
			return true;
		}
		
	}
	

}