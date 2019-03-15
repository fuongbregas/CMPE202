package output;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;

public class Cashier {
	private double tax = 0.09;
	private ArrayList<Burger> listOfBurger;
	private Order order;
	private static int orderNumber = 1;
	
	public Cashier() {
		listOfBurger = new ArrayList<Burger>();		
	}
	public void printAll() {
		printReceipt();
		printPackingSlip();
	}
	public void printReceipt() {
		System.out.println("\n\nOrder Number " + order.getOrderNumber());
		order.printOrder();
		
		System.out.println("Total Cost + 9% Tax:           " + getTotal(order) + "\n\n");
	}
	
	public ArrayList<Burger> getListOfBurger(){
		return listOfBurger;
	}
	
	public void printPackingSlip() {
		System.out.println("Packing Slip: ");
		order.printPackingSlip();
	}
	
	public void finalizeOrder(ArrayList<Burger> listOfBurger) {
		order = new Order(orderNumber, listOfBurger);
		
		orderNumber++;
	}
	
	public String getTotal(Order order) {
		double total = 0.00;
		for(int i = 0; i < listOfBurger.size(); i++) {
			total += listOfBurger.get(i).getPrice();
		}
		
        NumberFormat df = new DecimalFormat("#0.00"); 
		total = total + total * tax;
		return df.format(total);
	}
}
