/**
 * LineTest
 * 		tests graphics
 */
import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Graphics;
class LineTest extends JFrame {
	
	public static void main(String[] args) {
		LineTest lt = new LineTest("Tester");
	}

	private Line l, m, n, o;
	private Rectangle r;
	private Flag american;

	/**
	 * Constructor
	 *
	 * @param title - title of the window
	 */
	public LineTest(String title) {
		super(title);
		this.l = new Line(100, 100, 200, 100);
		this.m = new Line(100, 100, 100, 200);
		this.n = new Line(100, 200, 200, 200);
		this.o = new Line(200, 100, 200, 200);
		this.r = new Rectangle(200, 100, 100, 100);
		r.setColor(Color.green);
		this.american = new Flag(20, 30);
		american.setColor(Color.green);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 100, 600, 400);
		this.setVisible(true);
	}
	public void paint(Graphics g) {
		this.american.draw(g);
		//this.r.draw(g);
		//this.l.draw(g);
		//this.m.draw(g);
		//this.n.draw(g);
		//this.o.draw(g);
	}

}