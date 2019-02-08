

public class GumballMachine {
 
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	State hasCoinState;
	State noCointState;
 
	State state = soldOutState;
	int total = 0;
	int count = 0;
	int typeMachine = 0;
	//int coin;
 
	public GumballMachine(int numberGumballs, int typeMachine) {
		
			soldOutState = new SoldOutState(this);
			noQuarterState = new NoQuarterState(this);
			hasQuarterState = new HasQuarterState(this);
			soldState = new SoldState(this);
			
		

		this.count = numberGumballs;
 		if (numberGumballs > 0) {
			state = noQuarterState;
		} 
	}
 
	public void insertQuarter(int coin) {
		total = total + coin;
		state.insertQuarter(coin);
		System.out.println("Coin: " + coin);
	}
 
	public void ejectQuarter() {
		state.ejectQuarter();
	}
 
	public void turnCrank() {
		System.out.println("Total: " + total);
		
		state.turnCrank();
		
		if(typeMachine == 1){
			if(total == 25){
				state.dispense();
			}
			else{
				state.ejectQuarter();
			}
		}
		
		else if (typeMachine == 2){
			if(total == 50){
				state.dispense();
			}
			else{
				state.ejectQuarter();
			}
		}
		else if (typeMachine == 3){
			if(total == 50){
				state.dispense();
			}
			else{
				state.ejectQuarter();
			}
		}
		
	}

	void setState(State state) {
		this.state = state;
	}
 
	void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0) {
			count = count - 1;
		}
	}
 
	int getCount() {
		return count;
	}
 
	void refill(int count) {
		this.count = count;
		state = noQuarterState;
	}

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
    	if(typeMachine == 1 || typeMachine == 2){
    		return noQuarterState;
    	}
        return noCointState;
    }

    public State getHasQuarterState() {
    	if(typeMachine == 1 || typeMachine == 2){
    		return hasQuarterState;
    	}
        return hasCoinState;
    }

    public State getSoldState() {
        return soldState;
    }
 
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2004");
		result.append("\nInventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is " + state + "\n");
		return result.toString();
	}
}
