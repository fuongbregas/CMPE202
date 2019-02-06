
public class GumballMachine {
	private int num_gumballs;
    private boolean has_coin;
    private int total = 0;
    private int typeMachine;
          
    
    public GumballMachine(int num_gumballs, int typeMachine){
    	this.num_gumballs = num_gumballs;
    	total = 0;
    	this.typeMachine = typeMachine;    	
    }

    public void insertCoin(int coin)
    {
    	// Only takes quarter
        if ( typeMachine == 1 || typeMachine == 2){
        	if(coin == 25){
        		total = total + coin;    
        		this.has_coin = true;
        	}
        	else{
        		System.out.println("Only 25 cents accepted. Returned + " + coin + " cent(s)");
        		//this.has_coin = false;
        	}
        }
            
        // Take all
        if ( typeMachine == 3){ 
            total = total + coin;
            this.has_coin = true;
        }
    }
    
    public void turnCrank()
    {
    	
    	while(has_coin == true){
    		
    		// Machine 1 accept one quarter
    		if(typeMachine == 1){
    			if(total > 0 && num_gumballs > 0 ){
    				total = total - 25;
    				num_gumballs--;    				
    				System.out.println("Gumball Ejected. Gumballs Remain = " + num_gumballs
    						+ " Total Remains: " + total);
    			}
    			else if (total == 0 ){
    				//hasNothing();
    				has_coin = false;    				
    				break;
    			}
    			else if (num_gumballs == 0 && total > 0){    				
    				System.out.println("Run out of gumball. Return " + total/25 + " quarter(s)");
    				total = 0;
    				has_coin = false;
    				break;    				
    			}    			
    		}
    		
    		// Machine 2 accepts 2 quarters
    		if(typeMachine == 2){
    			if(total >= 50 && num_gumballs > 0){
    				num_gumballs --;
    				total = total - 50;
    				System.out.println("Gumball Ejected. Gumballs Remain = " + num_gumballs
    						+ " Total Remains: " + total);
    			}
    			
    			else if (total < 50 && total > 0 && num_gumballs !=0){
    				has_coin = false;
    				System.out.println("Not enough quarters. Returned " + total/25 + " quarters.");
    				total = 0;
    				break;
    			}
    			else if (num_gumballs == 0 && total > 0){
    				System.out.println("Runs out of gumball. Return " + total/25 + " quarter(s)");
    				total = 0;
    				has_coin = false;
    				break;
    			}
    			else if (total == 0){
    				has_coin = false;
    				break;
    			}
    		}
    		
    		// Machine 3 accepts any money
    		if(typeMachine == 3){
    			if(total >= 50 && num_gumballs > 0){
    				num_gumballs --;
    				total = total - 50;
    				System.out.println("Gumball Ejected. Gumballs Remain = " + num_gumballs
    						+ " Total Remains: " + total);
    			}
    			else if (total < 50 && total > 0 && num_gumballs != 0){    				
    				System.out.println("Not enough money. Returned " + total + " cent(s).");    
    				has_coin = false;
    				total = 0;
    				break;
    			}
    			
    			else if (num_gumballs == 0 && total > 0){
    				System.out.println("Run out of gumball. Returned " + total + " cent(s).");
    				total = 0;
    				has_coin = false;
    				break;
    			}    			
    			
    			else if (total == 0){
    				has_coin = false;
    				break;
    			}
    		}
    	}
    	
    	
    	if(has_coin == false){
    		hasNothing();
    	}
    	
    }
	
    public void hasNothing(){
    	if(has_coin == false && num_gumballs > 0){
    		if (typeMachine == 1){
    			System.out.println("Insert a Quarter.");
    		}
    		
    		else if (typeMachine == 2){
    			System.out.println("Insert enough Quarters.");
    		}
    		else{
    			System.out.println("No coin. Insert coin(s).");
    		}    		
    	}
    	else if (num_gumballs == 0){
    		System.out.println("Machine has no ball. Insert somewhere else");
    	}
    }
}
