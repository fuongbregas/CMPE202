  

public class BuildOrder {

    public static Component getOrder()
    {
        Composite order = new Composite( "Order" ) ;
        order.addChild(new Leaf("Crispy Onion Strings", 5.50 ));
        order.addChild(new Leaf("The Purist", 8.00 ));

        CustomBurger customBurger1 = new CustomBurger( "Build Your Own Burger" ) ;
        // base price for 1/3 lb
        Burger b1 = new Burger( "Burger Options" ) ;
        String[] bo1 = { "Beef", "1/2lb.", "On A Bun" } ;
        b1.setOptions( bo1 ) ;
        // 1 cheese free, extra cheese +1.00
        Cheese c1 = new Cheese( "Cheese Options" ) ;
        String[] co1 = { "Yellow American", "Spicy Jalapeno Jack"} ;
        c1.setOptions( co1 ) ;
        c1.wrapDecorator( b1 ) ;
        
        // Premium Cheese
        PremiumCheese pc1 = new PremiumCheese( "Premium Cheese Options" ) ;
        String[] pco1 = { "Danish Blue Cheese" } ;
        pc1.setOptions( pco1 ) ;
        pc1.wrapDecorator( c1 ) ;
        
        // 1 sauce free, extra +.5
        Sauce s1 = new Sauce( "Sauce Options" ) ;
        String[] so1 = { "Mayonnaise", "Thai Peanut Sauce" } ;
        s1.setOptions( so1 ) ;
        s1.wrapDecorator( pc1 ) ;
        
        Toppings t1 = new Toppings("Toppings Options");
        String[] to1 = { "Dill Pickle Chips", "Black Olives", "Spicy Pickles" };
        t1.setOptions(to1);
        t1.wrapDecorator(s1);
        
        // Premium Toppings
        PremiumToppings pt1 = new PremiumToppings( "Premium Toppings Options" ) ;
        String[] pto1 = { "Marinated Tomatoes" } ;
        pt1.setOptions( pto1 ) ;
        pt1.wrapDecorator(t1); ;
        
        // Bun
        Bun bun1 = new Bun("Bun Options");
        String[] bun1o =  { "Ciabatta (Vegan)"  };
        bun1.setOptions(bun1o);
        bun1.wrapDecorator(pt1);
        
        // Side
        Side si1 = new Side("Side Options");
        String[] sio1 = {"Shoestring Fries"};
        si1.setOptions(sio1);
        si1.wrapDecorator(bun1);
        
        // Setup Custom Burger Ingredients
        customBurger1.setDecorator( s1 ) ;
        customBurger1.addChild( b1 ) ;
        customBurger1.addChild( c1 ) ;
        customBurger1.addChild( pc1 ) ;
        customBurger1.addChild( s1 ) ;
        customBurger1.addChild( t1 ) ;
        customBurger1.addChild(pt1);
        customBurger1.addChild(bun1);
        customBurger1.addChild(si1);
        
        // Add Custom Burger to the ORder
        order.addChild( customBurger1 );
        return order ;
    }

}


/*

Counter Burger Menu:
https://thecounterburger.emn8.com/?store=Times%20Square

*/