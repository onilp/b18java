package polymorphism;

public class Honda2 extends Bike{  
	public static void main(String args[]){  
		//new Honda2().run();  
		Honda2 honda2 = new Honda2();
		honda2.run(); // the method run is inherited from the Bike class
	}  
}  