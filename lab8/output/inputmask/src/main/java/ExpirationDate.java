
public class ExpirationDate implements IDecorator{
	
	
	
	public ExpirationDate() {
				
	}
	
	@Override
	public String spacing(String date) {
		StringBuffer dateBuffer = new StringBuffer("");
		
		for (int i = 0; i < date.length(); i ++) {
			if(i == 2) {
				dateBuffer.append("/" + date.charAt(i));
			}
			else {
				dateBuffer.append(date.charAt(i));
			}			
		}
		return String.valueOf(dateBuffer);
	}

	

	
}
