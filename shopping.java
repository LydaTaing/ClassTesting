
public class shopping {

	public static void main(String[] args) {
		GroceryList mylist = new GroceryList();
		mylist.add( new GroceryItem("Egg", 24, 0.25));
		mylist.add(new GroceryItem("Ham", 3, 2.99));
		mylist.add(new GroceryItem("Apple", 3, 0.79));
		mylist.add(new GroceryItem("Cucumber", 2, 0.35));
		System.out.println(mylist);
		System.out.println("The total cost of your grocerry items is $ " + mylist.getTotalCost());
		
	}
}