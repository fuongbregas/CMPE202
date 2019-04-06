
public class CreditCardSpace implements IDecorator{

	public CreditCardSpace() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String spacing(String card) {
		StringBuffer cardBuffer = new StringBuffer("");
		
		for(int i = 0; i < card.length(); i++) {
			if(i == 4 || i == 8 || i == 12) {
				cardBuffer.append(" " + card.charAt(i));
			}
			else {
				cardBuffer.append(card.charAt(i));
			}			
		}
		return String.valueOf(cardBuffer);
	}

	
	
}
