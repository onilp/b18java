package inheritance;

public class Son extends Father {
	
	@Override
	void playGame()
	{
		super.playGame();
		System.out.println("play cricket");
	}
	public static void main(String [] args)
	{
		Son son = new Son();
		son.playGame();
	}

}
