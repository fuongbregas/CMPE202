package output;


import java.util.*;

public class Burger {
	private LinkedHashMap<Toppings, String> listOfToppings;
	private String name;
	private double price;
	public Burger(String name, double price) {
		this.name = name;
		this.price = price;
		listOfToppings = new LinkedHashMap<Toppings, String>();
	}
	
	public double getPrice() {
		return price;
	}
	public String getName() {
		return name;
	}
	
	public LinkedHashMap<Toppings, String> getListOfToppings(){
		return listOfToppings;
	}
	
	// A is Top, B is Mid, C is Bottom
	public void addTopping(Toppings topingName, String position) {
		listOfToppings.put(topingName, position);
	}
	
	public LinkedHashMap<Toppings, String> sortAsPackingSlip(){
		LinkedHashMap<Toppings, String> packingSlip = new LinkedHashMap<Toppings, String>();
		packingSlip = sortByValue(listOfToppings);
		return packingSlip;
	}
	
	private static LinkedHashMap<Toppings, String> sortByValue(LinkedHashMap<Toppings, String> listOfToppings) {
		// Covert Map to Linked List
		LinkedList<Map.Entry<Toppings, String>> list = new LinkedList<Map.Entry<Toppings, String>>(listOfToppings.entrySet());
		LinkedHashMap<Toppings, String> sortedMap = new LinkedHashMap<Toppings, String>();

                // Sort the position of Toppings
                Collections.sort(list, new Comparator<Map.Entry<Toppings, String>>() {
                       public int compare(Map.Entry<Toppings, String> o1, Map.Entry<Toppings, String> o2) {
                               return (o1.getValue()).compareTo(o2.getValue());
                       } 
                }); 
        
                for (Map.Entry<Toppings, String> entry : list) {
                       sortedMap.put(entry.getKey(), entry.getValue());
                }

                return sortedMap;
         }
}
