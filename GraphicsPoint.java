/**
 * GraphicsPoint
 *
 * 		a point that is limited to positive integers
 */

public class GraphicsPoint {
	
	private int x, y;

	/**
	 * Constructer
	 *
	 * @param x - x coordinate on a plane
	 * @param y - y coordinate on a plane
	 */
	public GraphicsPoint(int x, int y) {
		moveTo(x, y);
	}
	/**
	 * Getters and Setters
	 */
	
	/**
	 * limit x to a positive integer
	 */
	public void setX(int x) {
		if(x>=0) {
		this.x=x;
		}
	}

	public int getX() {
		return this.x;
	}

	/**
	 * limits y to a positive integer
	 */
	public void setY(int y) {
		if(y>=0) {
		this.y=y;
		}
	}

	public int getY() {
		return this.y;
	}

	//methods
	
	public void moveTo(int x, int y) {
		setX(x);
		setY(y);
	}
}