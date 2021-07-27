package week02.slot02;

public class TestMap {
	public static void main(String[] args) {
		Map map = new Map(5, 5);
		Pirate pirate1 = new Pirate("Abu", 5);
		map.arena[2][3] = pirate1;
		map.arena[0][4] = new Pirate("Bakar", 10);
		
		for(int y = 0; y < map.arena[0].length; y++) {
			for(int x = 0; x < map.arena.length; x++) {
				System.out.print(map.arena[x][y] + "\t");
			}
			System.out.println();
		}
	}
}
