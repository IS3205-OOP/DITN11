package week03.slot02;

public class TestMap {
	public static void main(String[] args) {
		Map map = new Map(5, 5);
		Pirate pirate1 = new Pirate("Abu", 5);
		map.arena[2][3] = pirate1;
		map.arena[0][4] = new Pirate("Bakar", 10);
		
		printArena(map);
		
		map.arena[2][0] = new Pirate("Curi", 7);
		
		printArena(map);
		
		boolean success = map.addPirate(3, 4, new Pirate("Daging", 4));
		if(success) {
			System.out.println("Add Pirate successful");
		} else {
			System.out.println("Add Pirate failed");
		}
		
		printArena(map);
		
		map.addPirate(2, 0, new Pirate("Emak", 4));
		map.addPirate(2, 0, null);
		printArena(map);
		
		map.addPirate(4, 0, new Pirate());
		map.addPirate(0, 1, new Pirate());
		printArena(map);
		
		map.selectPirate(0, 1).attackOtherPirate(map.selectPirate(3, 0));
		printArena(map);
		
		map.movePirate(2, 0, 0, 1);
		printArena(map);
		map.movePirate(2, 0, 0, 1);
		printArena(map);
		map.movePirate(4, 0, 4, 4);
		printArena(map);
//		Map map1 = new Map(4, 3);
//		printArena(map1);
	}
	
	public static void printArena(Map map) {
		for(int y = 0; y < map.arena[0].length; y++) {
			for(int x = 0; x < map.arena.length; x++) {
				System.out.print(map.arena[x][y] + "\t");
			}
			System.out.println();
		}
		System.out.println();
	}
}
