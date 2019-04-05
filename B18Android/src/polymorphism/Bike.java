package polymorphism;
public class Bike
	{  
		final void run()
		{
			final int speed = 0;
			int speed1=0;
			System.out.println("running...");  // final methods are inherited
			//speed++;   <--- this is not allowed as it is declared as final
			System.out.println(++speed1);
		}
	}