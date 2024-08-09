package oopsConcepts;


class bike{
	public String name= " Honda";
	
	public int speed(int speed) {
		
		return speed*10;
			
	}
	
}

class bicycle extends bike{
	
	
}

public class Inherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bike car = new bike();
		bicycle cycle = new bicycle();
		
		System.out.println(car.name);
		System.out.println(car.speed(10));
		
		System.out.println(cycle.speed(5));
		
		

	}

}
