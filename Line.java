/**
 * Line
 * 		draws a line
 */
import java.awt.Graphics;
class Line {
	private GraphicsPoint a, b;

	public Line(int x1, int y1, int x2, int y2) {
		this(new GraphicsPoint(x1,y1), new GraphicsPoint(x2,y2));
	}

	public Line(GraphicsPoint a, GraphicsPoint b) {
		this.a = a;
		this.b = b;
	}

	/**
	 * Getters and Setters
	 */
	
	public void setA(GraphicsPoint a) {
		this.a=a;
	}

	public void setA(int x, int y) {
		setA(new GraphicsPoint(x, y));
	}

	public GraphicsPoint getA() {
		return a;
	}


	/**
	 * Draw
	 *
	 * @param g - graphics context
	 */
	public void draw(Graphics g) {
		g.drawLine(a.getX(), a.getY(), b.getX(), b.getY());
	}
	
}