package output;
import java.util.*;

public class Order {
	private int orderNumber;
	private ArrayList<Burger> listOfBurger;
	public Order(int orderNumber, ArrayList<Burger> listOfBurger) {
		this.orderNumber = orderNumber;
		this.listOfBurger = listOfBurger;
	}
	
	public void printOrder() {
		for (int i = 0; i < listOfBurger.size(); i++) {
			Burger burger = listOfBurger.get(i);
			System.out.println("Item: " + burger.getName() + "                  $" 
					+ burger.getPrice()); // Print the name of the burger
			LinkedHashMap<Toppings, String> listOfToppings = burger.getListOfToppings();
			
			for(Map.Entry<Toppings, String> entry : listOfToppings.entrySet()) {
				if(entry.getValue().equals("A")) {
					System.out.println(entry.getKey().getToppingName());
				}
				else if (entry.getValue().equals("B")) {
					System.out.println("-> | " + entry.getKey().getToppingName());
				}
				else if (entry.getValue().equals("C")) {
					System.out.println("{{{{ " + entry.getKey().getToppingName() + " }}}}");
				}
			}
			System.out.println();
		}
		
		
	}
	
	public void printPackingSlip() {
		for (int i = 0; i < listOfBurger.size(); i++) {
			Burger burger = listOfBurger.get(i);
			System.out.println("Item: " + burger.getName()); // Print the name of the burger
			LinkedHashMap<Toppings, String> listOfToppings = burger.sortAsPackingSlip();
			
			for(Map.Entry<Toppings, String> entry : listOfToppings.entrySet()) {
				if(entry.getValue().equals("A")) {
					System.out.println(entry.getKey().getToppingName());
				}
				else if (entry.getValue().equals("B")) {
					System.out.println("-> | " + entry.getKey().getToppingName());
				}
				else if (entry.getValue().equals("C")) {
					System.out.println("{{{{ " + entry.getKey().getToppingName() + " }}}}");
				}
			}
			System.out.println();
		}
		
	}
	
	public int getOrderNumber() {
		return orderNumber;
	}
}
