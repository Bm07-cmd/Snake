import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;
import java.awt.Graphics;


public class Panel extends JPanel{
	Dimension PANEL_SIZE;
	Rect rect;

	Panel(int w, int h){
		this.PANEL_SIZE = new Dimension(w, h);

		this.setPreferredSize(PANEL_SIZE);
		this.setBackground(Color.black);

		this.rect = new Rect(100, 100, 50, 50);
	
	}

	@Override
	public void paint(Graphics g){
		super.paint(g);
		g.setColor(Color.red);
		
		this.rect.draw(g);
	}

}