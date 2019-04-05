package polymorphism;
class Bike7{  
	int speed;  

	Bike7()
	{
		System.out.println("Constructor is invoked and speed is "+speed);
		System.out.println();
	}  

	{
		speed=100;
		System.out.println("Instance initializer block is invoked");
	}  

	public static void main(String args[]){  
		Bike7 b1=new Bike7();  
		Bike7 b2=new Bike7();  
	}      
}  