

public class PartyTime {

		public static void printMenu(Iterator_Popsicle iterator) {
			while (iterator.hasNext()) {
				Popsicle popsicle = iterator.next();
				System.out.print(popsicle.getName() + ", ");
				System.out.print(popsicle.getDescription());
				System.out.println("  For: $" + popsicle.getPrice());
			}
		}
		
		
		public static void printMenus() {
			
			Menu_IceCreamTruck iceCreamTruck = new Menu_IceCreamTruck();
			Menu_PopsicleStand icePopStand = new Menu_PopsicleStand();
			
			//Didn't end up needing these
			//List<Popsicle> icePops = icePopStand.getMenuItems();
			//Popsicle[] iceCreamPops = iceCreamTruck.getMenuItems();
			
			Iterator_PopsicleStand icePopIter = icePopStand.createIterator();
			Iterator_IceCreamTruck iceCreamIter = iceCreamTruck.createIterator();
		
			printMenu(icePopIter);
			printMenu(iceCreamIter);
		}
		
		public static void main(String args[]) {
			System.out.println("Welcome to the pool party!");
			System.out.println("We asked both Laney's Ice Pops and Mike's Ice Cream Truck to cater this event today!");
			System.out.println("The options are:");
			printMenus();
		}
		
}