
/**
 * Write a description of class Bun here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bun extends LeafDecorator
{
	private String[] options;
	
	public Bun(String d) {
		super(d);
		
	}

	@Override
	public void setOptions(String[] options) {
		this.options = options;
		for ( int i = 0; i<options.length; i++ )
        {
            if ("Gluten-Free Bun".equals(options[i]) || "Hawaiian Bun".equals(options[i]) ) 
            {
            	this.price += options.length * 1.00;
            }
            else if ("Pretzel Bun".equals(options[i])) {
            	this.price += options.length * 0.50;
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
