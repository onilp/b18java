package snake;

public class Snake {
	/**
	 * snake will move at the given speed
	 * @param speed
	 */
	public void move(int speed) {}
	
	/**
	 *  snake turns into the given direction
	 *  ex: 1=up,2=down,3=left,4=right
	 * @param direction
	 */
	public void turn(int direction) {}
	
	/**
	 * Snake eats the food and grows
	 */
	public void eat() {}
	
	/**
	 * snake grows one tile at a time
	 */
	public void grow() {}
	
	/**
	 * snake stops moving at the current state and pauses the game
	 */
	public void pause() {}
	
	/**
	 * snake shrinks to the default size if it bites itself
	 */
	public void shrink() {}
	
	/**
	 * when the snake runs out of moves or hits the wall
	 * snake dies and ends the current game
	 */
	public void die() {}
}
