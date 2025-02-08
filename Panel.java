import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.util.ArrayList;


public class Panel extends JPanel{
	Dimension PANEL_SIZE;
	Rect rect;
	int TILE_SIZE = 20;
	int row; 
	int column;
	ArrayList<Rect> grid;

	Panel(int w, int h){
		this.PANEL_SIZE = new Dimension(w, h);

		this.setPreferredSize(PANEL_SIZE);
		this.setBackground(Color.black);


		//this.rect = new Rect(100, 100, 50, 50);
		this.row = (int)h/TILE_SIZE;
		this.column = (int)w/TILE_SIZE;
		this.grid = new ArrayList<>();
		for(int i = 0; i < row; i++){
			for(int j = 0; j < column; j++){
				Rect rect = new Rect(j*TILE_SIZE, i*TILE_SIZE, TILE_SIZE - 2, TILE_SIZE - 2);
				grid.add(rect);
			}
		}
	

	
	}

	@Override
	public void paint(Graphics g){
		super.paint(g);
		g.setColor(Color.red);
		
		//this.rect.draw(g);
		for(int i = 0; i < grid.size(); i++){
			this.grid.get(i).draw(g);
		}
	}

}
