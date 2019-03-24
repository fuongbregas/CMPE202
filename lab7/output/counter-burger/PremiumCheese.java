
/**
 * Write a description of class PremiumCheese here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PremiumCheese extends LeafDecorator
{
    // instance variables - replace the example below with your own
    private String[] options;

    /**
     * Constructor for objects of class PremiumCheese
     */
    public PremiumCheese(String d)
    {
        
       	super(d);
    }

    

	@Override
	public void setOptions(String[] options) {
		// TODO Auto-generated method stub
		this.options = options;
		if(options.length > 0) {
			this.price = this.price + options.length * 1.5;
		}
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		String desc = "   " ;
        for ( int i = 0; i<options.length; i++ )
        {
            if (i>0) desc += " + " + options[i] ;
            else desc = options[i] ;
        }        
        return desc ;
	}
}
