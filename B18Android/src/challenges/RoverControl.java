package challenges;

public class RoverControl {
	
	static int currentPos = 1;
	static int matrixSize = 4;
	static int [][] position = {
			{1,2,3,4},
			{5,6,7,8}, 
			{9,10,11,12},
			{13,14,15,16}
			};
	static int currentCell = matrixSize * matrixSize; 

	
	public static void main(String [] args)
	{
		//char [] commands = {'U','D','L','R'};
		String [] instruction = {"right","left","up","down","down"};
		System.out.println(roverLocation(instruction));
		
	}

	public static void moveRight()
	{
		if(currentCell % matrixSize== 0) {}
		else
			currentPos++;
	}
	public static void moveLeft()
	{
		/**int leftMostElement = ((currentCell % currentPos)+1);
		
		if((currentPos-1) == (leftMostElement)) {}
		else
			currentPos--; **/
		for(int i = 0; i < matrixSize;i++)
		{
			
			if((currentPos-1) % matrixSize == 0){}
			else
				currentPos--;
		}
		
	}
	public static void moveUp()
	{
		int firstRowBegin = 1;
		int firstRowEnd = matrixSize;
		if(currentPos>=firstRowBegin && currentPos<=firstRowEnd) {}
		else
			currentPos-=matrixSize;
	}
	public static void moveDown()
	{
		int lastRowBegin = (matrixSize * (matrixSize-1)+1);
		int lastRowEnd = (matrixSize * matrixSize);
		if(currentPos >= lastRowBegin && currentPos <= lastRowEnd) {}
		else
		currentPos+=matrixSize;
	}
	
	public static int roverLocation(String[] s) 
	{
		for(int i = 0; i < s.length; i++)
		{
			
			if(s[i]== "right")
			{
				moveRight();
			}
			else if(s[i]== "left")
			{
				moveLeft();
			}
			else if(s[i]== "up")
			{
				moveUp();
			}
			else
			{
				moveDown();
			}
		}
	return currentPos;
	}
	

}
	
