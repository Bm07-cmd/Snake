import java.awt.Graphics;
import java.awt.Color;
import java.util.ArrayList;

public class Snake extends Rect {
	ArrayList<Coordinate> body;
	//int TILE_SIZE = 20;


	Snake(int x, int y, int w, int h){
		super(x, y, w, h);
		this.body = new ArrayList<Coordinate>();
		Coordinate coordinate = new Coordinate(x, y);
		Coordinate coordinate2 = new Coordinate(x - Settings.TILE_SIZE, y);
		Coordinate coordinate3 = new Coordinate(x - (Settings.TILE_SIZE*2), y);
		this.body.add(coordinate);
		this.body.add(coordinate2);
		this.body.add(coordinate3);
		
	}

	public void draw(Graphics g){
		g.setColor(Color.blue);
		for(int i = 0; i < this.body.size(); i++){
			g.fillRect(this.body.get(i).x_pos, this.body.get(i).y_pos, Settings.TILE_SIZE, Settings.TILE_SIZE);
		}
	}

}
