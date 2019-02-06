
public class Main {
	public static void main(String[] args) {
		System.out.println("Machine 1:");
		// Test 1: more money = balls
		System.out.println("Money = gumballs Test:");
		GumballMachine gumballMachine1_0 = new GumballMachine(3, 1);		
		System.out.println(gumballMachine1_0);
		gumballMachine1_0.insertCoin( 25 );
		gumballMachine1_0.insertCoin(25);
		gumballMachine1_0.insertCoin(25);
		gumballMachine1_0.turnCrank();
		
		
		GumballMachine gumballMachine1_1 = new GumballMachine(5, 1);
		System.out.println("\n" + gumballMachine1_1);
		gumballMachine1_1.insertCoin(25);
		gumballMachine1_1.insertCoin(25);
		gumballMachine1_1.turnCrank();
		System.out.println();
		
		// Test2: wrong coin
		System.out.println("Wrong Coin Test: ");
		gumballMachine1_1.insertCoin(25);
		gumballMachine1_1.insertCoin(1);
		gumballMachine1_1.turnCrank();
		System.out.println();
		
		// Test3: not enough coin
		System.out.println("No coin or not enough coin test:");
		gumballMachine1_1.turnCrank();
		System.out.println();
		
		System.out.println("Machine 2:");
		System.out.println("Money = gumballs Test");
		GumballMachine gumballMachine2_0 = new GumballMachine(3, 2);
		System.out.println(gumballMachine2_0);
		gumballMachine2_0.insertCoin(25);
		gumballMachine2_0.insertCoin(25);
		gumballMachine2_0.insertCoin(25);
		gumballMachine2_0.insertCoin(25);
		gumballMachine2_0.insertCoin(25);
		gumballMachine2_0.insertCoin(25);
		gumballMachine2_0.turnCrank();
		System.out.println();

		System.out.println("0 < total < 50 Test:");
		GumballMachine gumballMachine2_1 = new GumballMachine(3, 2);
		System.out.println(gumballMachine2_1);
		gumballMachine2_1.insertCoin(25);
		gumballMachine2_1.insertCoin(25);
		gumballMachine2_1.insertCoin(25);
		gumballMachine2_1.turnCrank();
		System.out.println();
		
		System.out.println("Wrong Coin Test: ");
		gumballMachine2_1.insertCoin(25);
		gumballMachine2_1.insertCoin(10);
		gumballMachine2_1.turnCrank();
		System.out.println();
		
		System.out.println("No coin test:");
		gumballMachine2_1.turnCrank();
		System.out.println();
	}
}
