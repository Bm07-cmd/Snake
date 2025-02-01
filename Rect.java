import java.awt.Color;
import java.awt.Graphics;

public class Rect {
	int x_pos, y_pos, width, height;
	
	Rect(int x, int y, int w, int h){
		this.x_pos = x;
		this.y_pos = y;
		this.width = w;
		this.height = h;
	}
	
	
	public void draw(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(this.x_pos, this.y_pos, this.width, this.height);
	}
	
	
}