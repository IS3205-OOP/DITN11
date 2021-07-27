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

}
