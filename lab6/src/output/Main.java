package output;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		System.out.println("FIVE GUYS BURGER\n");
		Cashier cashier = new Cashier();
		Burger burger1 = new Burger("LBB", 5.99);
		// A is Top, B is Mid, C is Bottom
		burger1.addTopping(new Toppings("G Onion"), "B");
		burger1.addTopping(new Toppings("Lettuce"), "A");
		burger1.addTopping(new Toppings("Tomato"),  "A");	
		burger1.addTopping(new Toppings("Cheese"), "A");
		burger1.addTopping(new Toppings("Jala Grilled"), "B");
		burger1.addTopping(new Toppings("BACON"), "C");
		
		System.out.println("Length: " + burger1.sortAsPackingSlip().size());
		
		Burger burger2 = new Burger("LTT CAJ", 2.79);
		ArrayList<Burger> listOfBurger = cashier.getListOfBurger();
		listOfBurger.add(burger1);
		listOfBurger.add(burger2);
		
		cashier.finalizeOrder(listOfBurger);
		cashier.printPackingSlip();
		cashier.printReceipt();
	}

}
