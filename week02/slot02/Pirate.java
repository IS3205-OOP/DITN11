package week02.slot02;

public class Pirate {

	String name;
	int health;
	static int numPirate = 0;
	
	public Pirate(String newName, int newHealth) {
		numPirate++;
		name = newName;
		if(newHealth < 1) {
			newHealth = 1;
		}
		health = newHealth;
	}
	
	public String toString() {
		return name + "[HP: " + health + "]";
	}
	
}
