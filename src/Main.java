import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.geom.Ellipse2D;

import javax.swing.JFrame;

public class Main extends Component
{
	int down = 0;
	Ellipse2D raindrop = new Ellipse2D.Double(50, down, 20, 20);
	Ellipse2D raindrop2 = new Ellipse2D.Double(80, down, 20, 20);
	Ellipse2D raindrop3 = new Ellipse2D.Double(110, down, 20, 20);
	JFrame gameFrame;
	int width = Toolkit.getDefaultToolkit().getScreenSize().width;
	int height = Toolkit.getDefaultToolkit().getScreenSize().height;

	public static void main(String[] args)
	{

		new Main().getGoing();
	}

	private void getGoing()
	{

		gameFrame = new JFrame();
		gameFrame.add(this);

		gameFrame.setVisible(true);
		gameFrame.setSize(width, height);
		gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	

	}

	public void paint(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		
		g.draw3DRect(50, down, 10, 10, true);
		g.setColor(Color.BLUE);
		g.fill3DRect(50, down,10, 10, true);
		down += 1;
		repaint();	
		g2.draw(raindrop);
		g2.draw(raindrop2);
		g2.draw(raindrop3);
		g2.setColor(Color.BLUE);
		
	}

}
