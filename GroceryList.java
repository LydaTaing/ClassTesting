
public class GroceryList {
	private GroceryItem[] list;
	private static final int SIZE = 10;
	
	public GroceryList(){
		list = new GroceryItem[SIZE];
	}

	public boolean add(GroceryItem Item) {
		boolean done= false;
		for (int i =0; i<list.length && !done; i++) {
			if (list[i]== null) {
				list[i]= Item;
				done = true;
			}
		}
		return done;
	}
	
	public double getTotalCost() {
		double price=0.0;
		for (int i =0; i<list.length; i++) {
			if (list[i] != null) {
				price += list[i].getTotalCost();
			}
		}
		return price;
	}
	
	public String toString() {
		String result= "";
		for (int i =0; i<list.length; i++) {
			if (list[i] != null) {
			result += list[i].toString()+ "\n";	
			}
		}
		return result;
		
	}
	
}
