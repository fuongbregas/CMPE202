/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

/**
 *  Main App Class for Displaying Screen.
 */
public class App {

    private Screen screen;
    private CreditCardNum num;
    private CreditCardExp exp;
    private CreditCardCVC cvc;
    private int count;

    public App() {

        screen = new Screen();
        num = new CreditCardNum(new CreditCardSpace());
        exp = new CreditCardExp(new ExpirationDate());
        cvc = new CreditCardCVC();

        screen.addSubComponent(num);
        screen.addSubComponent(exp);
        screen.addSubComponent(cvc);
               

        count = 0;

    }

    public String display() {
        String output = "";
        output += "========================================\n";
        output += screen.name() + "\n";
        output += "========================================\n";
        output += "\n\n\n\n";
        output += screen.display() + "\n";
        output += "\n\n\n\n";
        output += "========================================\n";
        return output;
    }

    public void key(String ch) {
    	if(ch.matches("[0-9]")) {
    		if(count < 23) {
    			count ++ ;
    			screen.key(ch, count);
    		}   		
    		
    	}
    	System.out.println("\nCount = " + count);
    	
    	if(ch.toLowerCase().matches("x") && count > 0) {
    		
    		screen.key(ch, count);
    		count --;
    	}
    }

}

