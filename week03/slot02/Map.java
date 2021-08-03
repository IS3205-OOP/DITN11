package week03.slot02;

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
		if(checkCoordinate(x, y)
				&& arena[x][y] == null) {
			arena[x][y] = newPirate;
			return true;
		}
		return false;
	}
	
	public Pirate selectPirate(int x, int y) {
		if(checkCoordinate(x, y)) {
			return arena[x][y];
		}
		return null;
	}
	
	public boolean checkCoordinate(int x, int y) {
		if(x >= 0 && x < arena.length 
				&& y >= 0 && y < arena[0].length) {
			return true;
		}
		return false;
	}
	
	public void movePirate(int x, int y, int newX, int newY) {
		Pirate pirate = selectPirate(x, y);
		if(pirate != null) {
			if(checkCoordinate(newX, newY)) {
				Pirate otherPirate = selectPirate(newX, newY);
				if(otherPirate != null) {
					// Attack the other pirate
					pirate.attackOtherPirate(otherPirate);
					if(otherPirate.health <= 0) {
						arena[newX][newY] = pirate;
						arena[x][y] = null;
					}
				} else {
					// Move the pirate
					arena[newX][newY] = pirate;
					arena[x][y] = null;
				}
			}
		}
	}
	
	public void movePirateUp(int x, int y) {
		movePirate(x, y, x, y - 1);
	}
	
	public void movePirateDown(int x, int y) {
		movePirate(x, y, x, y + 1);
	}
	
	public void movePirateLeft(int x, int y) {
		movePirate(x, y, x - 1, y);
	}
	
	public void movePirateRight(int x, int y) {
		movePirate(x, y, x + 1, y);
	}

}
