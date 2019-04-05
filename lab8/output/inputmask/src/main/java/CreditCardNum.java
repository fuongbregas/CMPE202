/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardNum implements IDisplayComponent, IKeyEventHandler
{

	private IKeyEventHandler nextHandler ;
	private String number = "" ;
	private CreditCardSpace ccSpace = null;
	
	public CreditCardNum(CreditCardSpace ccCardSpace) {
		this.ccSpace = ccCardSpace;
	}

    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    	
    }	

	public String display() {
		if ( number.equals("") ) {
			return "[4444 4444 4444 4444]" + "  " ;
		}			
		else if(ccSpace == null) {
			return "[" + number + "]" + "  ";
		}
		else
			return "[" + ccSpace.spacing(number) + "]" + "  " ;
	}	

	public void key(String ch, int cnt) {
		String checker = ch.toLowerCase();
		if ( cnt <= 16 ) {
			if(checker.equals("x") && number.length() > 0) {
				number = number.substring(0, number.length() - 1);
			}
			else {
				number += ch ;
			}			
		}
			
		else if ( nextHandler != null )
			nextHandler.key(ch, cnt) ;
	}	

	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}
	
	
}