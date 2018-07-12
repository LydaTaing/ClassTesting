
public class GroceryItem {
	private String name;
	private int quatity;
	private double price;
	
	
	public GroceryItem(String n, int q, double p) {
		name = n;
		quatity = q;
		price = p;
	}

	public String getName() {
		return name;
	}
	
	public void getName(String n) {
		name = n;
	}
	
	public int getquantity() {
		return quatity;
	}
	public void getquantity(int q) {
		quatity= q;
	}
	public void getCost(double p) {
		price = p;
		
	}
	public double getTotalCost() {
		return price*quatity;
	}
	
	public String toString () {
		return (name +"\t"+ quatity+ "\t$ "+ price);
	}
}

