import java.util.ArrayList;

public class Snake extends Rect {
	ArrayList<Coordinate> body;
	int TILE_SIZE = 20;


	Snake(int x, int y, int w, int h){
		super(x, y, w, h);
		this.body = new ArrayList<Coordinate>();
		Coordinate coordinate = new Coordinate(x, y);
		Coordinate coordinate2 = new Coordinate(x - TILE_SIZE, y);
		Coordinate coordinate3 = new Coordinate(x - (TILE_SIZE*2), y);
		this.body.add(coordinate);
		this.body.add(coordinate2);
		this.body.add(coordinate3);
		
	}
}