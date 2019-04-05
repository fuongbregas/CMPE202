/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardCVC implements IDisplayComponent, IKeyEventHandler
{

	private IKeyEventHandler nextHandler ;
	private String cvc = "" ;

    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }	

	public String display() {
		if ( cvc.equals("") )
			return "[123]" + "  " ;
		else
			return "[" + cvc + "]" + "  " ;
	}	

	public void key(String ch, int cnt) {
		String checker = ch.toLowerCase();
		if ( cnt >= 21 ) {
			if ( cnt >= 21 && cnt <= 23 ) {
				if(ch.toLowerCase().matches("x")) {
					cvc = cvc.substring(0, cvc.length() - 1);
				}					
				else if (cvc.length()<3) {
					cvc += ch ;
				}
					
			}	
			else if ( nextHandler != null )
				nextHandler.key(ch, cnt) ;
		}
		
	}	

	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}

}