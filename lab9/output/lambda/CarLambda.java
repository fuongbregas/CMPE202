

public class CarLambda{
	
public static void main(String [] args){
		Car basicCar = () -> {
			return " Adding features of ";
		};
		
		Car sportsCar = () -> basicCar.assemble() + "Sports Car.";
		System.out.println(sportsCar.assemble());
		System.out.println("\n*****");
		
		Car sportsLuxuryCar = () -> basicCar.assemble() + " Luxury Car." + sportsCar.assemble()  ;		
		System.out.println(sportsLuxuryCar.assemble());
	}
}