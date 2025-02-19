

public class Main {

	public static void main(String[] args) {
		// Test Machine 1
		GumballMachine gumballMachine = new GumballMachine(5, 1);
		System.out.println("Gumball Machine type 1. Insert two 25 cents + 1 cent\n"
				+ "*** Expecting 2 gumballs out *** ");
		System.out.println();
		gumballMachine.insertCoin(25);		
		gumballMachine.insertCoin(25);
		gumballMachine.insertCoin(1);
		//System.out.println("Current Total M1 = " + gumballMachine.getTotal());
		gumballMachine.turnCrank();
		gumballMachine.insertCoin(25);
		gumballMachine.turnCrank();
		//System.out.println("Current Total M1 = " + gumballMachine.getTotal());
		gumballMachine.insertCoin(25);
		//System.out.println("Current Total M1 = " + gumballMachine.getTotal());
		gumballMachine.turnCrank();
		System.out.println(gumballMachine.toString());
		
		// Test Machine 1 with no 1 ball then out of stock
		GumballMachine gumMachine1 = new GumballMachine(1, 1);
		System.out.println("\nGumball Machine type 1 with 1 ball then out of stock. Insert two 25 cents + 1 cent\n"
				+ "*** Expecting 1 gumballs out *** ");
		System.out.println();
		gumMachine1.insertCoin(25);
		gumMachine1.insertCoin(1);
		gumMachine1.insertCoin(25);
		
		gumMachine1.turnCrank();
		//System.out.println("Current Total M1 = " + gumMachine1.getTotal());
		//System.out.println("Num ball: " + gumMachine1.getNumberBall());
		gumMachine1.turnCrank();
		System.out.println(gumMachine1.toString() + "\n");
		
		// Test Machine 2
		GumballMachine gumballMachine2 = new GumballMachine(5, 2);
		System.out.println("\nGumball Machine type 2. Insert two 25 cents + 10 cent\n"
				+ "*** Expecting 1 gumballs out ***");
		System.out.println();
		gumballMachine2.insertCoin(25);
		gumballMachine2.insertCoin(10);
		gumballMachine2.insertCoin(25);
		//System.out.println("Current Total M2 = " + gumballMachine2.getTotal());
		gumballMachine2.turnCrank();
		//System.out.println("Current Total M2 = " + gumballMachine2.getTotal());
		System.out.println(gumballMachine2.toString());
		
		
		// Test Machine 3
		GumballMachine gumballMachine3 = new GumballMachine(5, 3);
		System.out.println("Gumball Machine type 3. Insert two 25 cents + 1 cent\n"
				+ "*** Expecting 0 gumballs out *** ");
		System.out.println();
		gumballMachine3.insertCoin(25);
		gumballMachine3.insertCoin(1);
		gumballMachine3.turnCrank();
		System.out.println(gumballMachine3.toString());
		gumballMachine3.insertCoin(10);
		gumballMachine3.insertCoin(10);
		gumballMachine3.insertCoin(1);
		gumballMachine3.insertCoin(1);
		gumballMachine3.insertCoin(1);
		gumballMachine3.insertCoin(1);
		
		System.out.println();
		System.out.println("Gumball Machine type 3. Insert two 10 cents + four 1 cents\n"
				+ "*** Expecting 1 gumballs out *** ");
		gumballMachine3.turnCrank();

		System.out.println(gumballMachine3.toString());
		
		// User want coin back
		gumballMachine3.insertCoin(1);
		gumballMachine3.insertCoin(25);
		gumballMachine3.turnCrank();
		System.out.println("Total M3: " + gumballMachine3.getTotal());		
		gumballMachine3.ejectCoin();
		
		System.out.println(gumballMachine3.toString());
	}
}
