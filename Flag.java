/**
 * Flag
 *
 * 		Draws the American Flag to the screen
 */
import java.awt.Color;
import java.awt.Graphics;
class Flag {
	private int width, height, stripeH, stripeW, cordA, cordB;
	private GraphicsPoint a, b, c;
	private Rectangle union;
	private Color color;

	public Flag (int width, int height) {
		setW(width);
		setH(height);
		stripeH = height/13;

	}

	public Flag (GraphicsPoint a, GraphicsPoint b, GraphicsPoint c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public void setW(int width) {
		this.width=width;
	}

	public int getW() {
		return this.width;
	}

	public void setH(int height) {
		this.height=height;
	}

	public int getH() {
		return this.height;
	}

	public void setColor(Color color) {
		this.color=color;
	}


	/**
	 * Draw
	 *
	 * @param g - graphics context
	 */
	public void draw(Graphics g) {
		for(int i = 0; i <13; i++) {
			//stripeW = stripeW - union.getW();
			g.fillRect(b.getX(), b.getY(), b.getX()+stripeW, b.getY()+stripeH);
		}
	}
}