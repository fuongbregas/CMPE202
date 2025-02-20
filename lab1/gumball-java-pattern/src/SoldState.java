

public class SoldState implements State {
 
    GumballMachine gumballMachine;
 
    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
       
	public void insertCoin(int coin) {
		System.out.println("Please wait, we're already giving you a gumball");
	}
 
	public void ejectCoin() {
		System.out.println("Sorry, you already turned the crank");
	}
 
	public void turnCrank() {
		System.out.println("Turning twice doesn't get you another gumball!");
	}
 
	public void dispense() {
		//gumballMachine.releaseBall();
		/*
		if (gumballMachine.getNumberBall() > 0) {
			if(gumballMachine.getTotal() >= gumballMachine.getPrice()){
				while(gumballMachine.getTotal() >= gumballMachine.getPrice() ){
					gumballMachine.setTotal(gumballMachine.getTotal() - gumballMachine.getPrice());
					gumballMachine.releaseBall();
				}
				gumballMachine.setState(gumballMachine.getNoCoinState());
			}
			else{
				gumballMachine.setState(gumballMachine.getHasCoinState());
			}
			
			
		} else {
			System.out.println("Oops, out of gumballs!");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}*/
		
		if(gumballMachine.getNumberBall() >0 && gumballMachine.getTotal() >= gumballMachine.getPrice()){
			while(gumballMachine.getTotal() >= gumballMachine.getPrice() ){
				gumballMachine.setTotal(gumballMachine.getTotal() - gumballMachine.getPrice());
				gumballMachine.releaseBall();
			}
			if (gumballMachine.getTotal() > 0 && gumballMachine.getNumberBall()!= 0){
				gumballMachine.setState(gumballMachine.getHasCoinState());				
			}
			else if (gumballMachine.getTotal() > 0 && gumballMachine.getNumberBall()== 0){
				System.out.println("Machine out of ball. Returned " + gumballMachine.getTotal() + " cent(s)");
				gumballMachine.setTotal(0);
				gumballMachine.setState(gumballMachine.getSoldOutState());				
			}
			else if (gumballMachine.getTotal() == 0){
				gumballMachine.setState(gumballMachine.getNoCoinState());
			}
		}
		else if(gumballMachine.getNumberBall() == 0 && gumballMachine.getTotal() >= 0){
			System.out.println("Machine out of ball. Returned " + gumballMachine.getTotal() + " cent(s)");
			gumballMachine.setTotal(0);
			gumballMachine.setState(gumballMachine.getSoldOutState());		
		}
	}
 
	public String toString() {
		return "dispensing a gumball";
	}
}


