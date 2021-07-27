package week02.slot02;

public class Map {
	
	Pirate[][] arena;
	final static int DEFAULT_SIZE = 3;
	
	public Map(int width, int height) {
		if(width < DEFAULT_SIZE) {
			width = DEFAULT_SIZE;
		}
		if(height < DEFAULT_SIZE) {
			height = DEFAULT_SIZE;
		}
		arena = new Pirate[width][height];
	}
	
	public boolean addPirate(int x, int y, Pirate newPirate) {
		if(x >= 0 && x < arena.length && y >= 0 && y < arena[0].length
				&& arena[x][y] == null) {
			arena[x][y] = newPirate;
			return true;
		}
		return false;
	}

}
