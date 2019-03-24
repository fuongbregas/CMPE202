
/**
 * Write a description of class PremiumToppings here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PremiumToppings extends LeafDecorator
{
    private String[] options;
	
    public PremiumToppings(String d)
    {
        // initialise instance variables
        super(d);
    }

	@Override
	public void setOptions(String[] options) {
		this.options = options;
		for ( int i = 0; i<options.length; i++ )
        {
            if ("Marinated Tomatoes".equals(options[i])) {
            	this.price += this.price + options.length * 2.00;
            }
            else if ("Sunny Side Up Egg".equals(options[i])){
            	this.price += this.price + options.length *3.00;
            }
            else {
            	this.price += this.price + options.length * 1.00;
            }            
        }
		
	}

	@Override
	public String getDescription() {
		String desc = "   " ;
        for ( int i = 0; i<options.length; i++ )
        {
            if (i>0) desc += " + " + options[i] ;
            else desc = options[i] ;
        }        
        return desc ;
	}

    
}
