/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardExp implements IDisplayComponent, IKeyEventHandler
{

	private IKeyEventHandler nextHandler ;
	private String date = "" ;
	private ExpirationDate expDate;
	
	

    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }	

	public String display() {
		if ( date.equals("") ) {
			return "[MM/YY]" + "  " ;
		}			
		else if(expDate == null) {
			return "[" + date.trim() + "]" + "  ";
		}
		else
			return "[" + expDate.spacing(date) + "]" + "  " ;
	}	

	public void key(String ch, int cnt) {
		String checker = ch.toLowerCase();
		if ( cnt >= 17 && cnt <= 20  ) {
			if(checker.equals("x") && date.length() > 0) {
				date = date.substring(date.length() - 1);
			}		
			date += ch ;
		}
		else if ( nextHandler != null ) {
			nextHandler.key(ch, cnt) ;
		}
	}	

	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}
	
	public void decorate(ExpirationDate expDate) {
		this.expDate = expDate;
	}

}