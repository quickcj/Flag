/**
 * Rectangle
 *
 * 		draws a rectangle
 */
import java.awt.Color;
import java.awt.Graphics;
class Rectangle {
	private GraphicsPoint p;
	private int w, h;
	private Color color;

public Rectangle (int w, int h, int a, int b) {
	this(new GraphicsPoint(a,b));
	setW(w);
	setH(h);
}
public Rectangle (GraphicsPoint p) {
		this.p = p;
	}

public void setW(int w) {
		this.w=w;
	}

	public int getW() {
		return this.w;
	}

	public void setH(int h) {
		this.h=h;
	}

	public int getH() {
		return this.h;
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
		g.setColor(color);
		g.fillRect(p.getX(), p.getY(), p.getX()+w, p.getY()+h);
	}



}