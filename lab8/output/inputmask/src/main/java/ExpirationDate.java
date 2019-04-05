
public class ExpirationDate implements IDecorator, IDisplayComponent{
	
	
	
	public ExpirationDate() {
				
	}
	
	@Override
	public String spacing(String date) {
		StringBuffer dateBuffer = new StringBuffer("");
		
		for (int i = 0; i < date.length(); i ++) {
			if(i == 2) {
				dateBuffer.append("/" + date.charAt(i));
			}
			dateBuffer.append(date.charAt(i));
		}
		return String.valueOf(dateBuffer);
	}

	@Override
	public String display() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addSubComponent(IDisplayComponent c) {
		// TODO Auto-generated method stub
		
	}

}
