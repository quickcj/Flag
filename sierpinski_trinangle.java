/**
 * Math for triangle
 *
 *		x = .9(Math.min(w/2,h/2))
 *		c = center point = (a+w/2, b+h/2)
 *		T = top = (cx, cy - x)
 *		y = x sin30
 *		z = math.squareroot(x^2 - y^2)
 *		R= right = (cx + 2, cy + y)
 *		L = left = (cx-2, by + y)
 */

public class sierpinski_trinangle {
	private double w, h, a, b, c, x, y, z;
	private int depth;
	private Graphics g;

	public static final int MAX_DEPTH = 7;




	/**
	 * Constructor
	 *
	 * @param w = width of triangle
	 * @param h = height of the triangle
	 * @param d = depth of the triangle
	 */
	public sierpinski_trinangle (double w, double h) {
		this.w = w;
		this.h = h;
		this.depth=1;
	}
	
	/**
	 * incrementDepth
	 */
	public void incrementDepth() {
		if(depth == MAX_DEPTH) {
			depth = 1;
		}else {
			depth++;
		}
	}

	/**
	 * draw
	 * 		draw the htree to the screen
	 *
	 * 		this is an accessor mehtod that calls the real private recursive method
	 *
	 * @param g - the Graphics object associated with the window
	 */
	public void draw(Graphics g) {
		this.g = g;
		recursiveDraw(w, h);
	}

	public void recursiveDraw(int w, int h) {
		x = .9*(Math.min(w/2, h/2));
		c = (a+w/2, b+h/2);
		double top = (cx, cy - x);
		y = x math.sin(30);
		z = math.squareroot(math.pow(x) - math.pow(y));


	}


}