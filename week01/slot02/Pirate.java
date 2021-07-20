package week01.slot02;

public class Pirate {

	String name;
	int health;
	
	public Pirate(String newName, int newHealth) {
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
