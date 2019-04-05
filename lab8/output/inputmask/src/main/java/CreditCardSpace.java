
public class CreditCardSpace implements IDecorator, IDisplayComponent{

	public CreditCardSpace() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String spacing(String card) {
		StringBuffer cardBuffer = new StringBuffer("");
		
		for(int i = 0; i < card.length(); i++) {
			if(i == 4 || i == 8 || i == 12) {
				cardBuffer.append(" ");
			}
			cardBuffer.append(card.charAt(i));
		}
		return String.valueOf(cardBuffer);
	}

	@Override
	public String display() {
		// TODO Auto-generated method stub
		return " ";
	}

	@Override
	public void addSubComponent(IDisplayComponent c) {
		// TODO Auto-generated method stub
		
	}
	
}
