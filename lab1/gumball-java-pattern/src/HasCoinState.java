

import java.util.Random;

public class HasCoinState implements State {
	GumballMachine gumballMachine;
 
	public HasCoinState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
  
	public void insertCoin(int coin) {
		System.out.println("You insert " + coin + " cent(s)");
	}
 
	public void ejectCoin() {
		System.out.println("Returned " + gumballMachine.getTotal() + " cent(s)");
		gumballMachine.setState(gumballMachine.getNoCoinState());
	}
 
	public void turnCrank() {
		System.out.println("You turned...");
		if(gumballMachine.getTotal() >= gumballMachine.getPrice()){
			gumballMachine.setState(gumballMachine.getSoldState());
		}		
	}

    public void dispense() {
        System.out.println("No gumball dispensed");
    }
 
	public String toString() {
		return "waiting for turn of crank";
	}
}
