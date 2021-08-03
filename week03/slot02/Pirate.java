package week03.slot02;

public class Pirate {

	String name;
	int health;
	static int numPirate = 0;
	
	public Pirate() {
		this("Pirate" + numPirate, 2);
		numPirate++;
	}
	
	public Pirate(String newName, int newHealth) {
		name = newName;
		if(newHealth < 1) {
			newHealth = 1;
		}
		health = newHealth;
	}
	
	public void attackOtherPirate(Pirate otherPirate) {
		if(otherPirate != null) {			
			otherPirate.health--;
		}
	}
	
	public String toString() {
		return name + "[HP: " + health + "]";
	}
	
}
