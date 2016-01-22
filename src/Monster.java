
public class Monster {
	
	public final String TOMBSTONE = "Here lies a dead monster.";
	
	private int health = 500;
	private int attack = 20;
	private int movement = 2;
	private int xPos = 0;
	private int yPos = 0;
	private boolean alive = true;
	
	public String name = "Big Monster";

	public Monster(int newHealth, int newAttack, int newMovement) {
		this.health = newHealth;
		this.attack = newAttack;
		this.movement = newMovement;
	}
	
	public Monster() {
		
	}

	/**
	 * @return the health
	 */
	public int getHealth() {
		return health;
	}

	/**
	 * @param health the health to set
	 */
	public void setHealth(int decreaseHealth) {
		this.health -= decreaseHealth;
		if (health < 0) {
			alive = false;
		}
	}
	
	/**
	 * @param health the health to set
	 */
	public void setHealth(double decreaseHealth) {
		this.health -= (int) decreaseHealth;
		if (health < 0) {
			alive = false;
		}
	}

	/**
	 * @return the attack
	 */
	public int getAttack() {
		return attack;
	}

	/**
	 * @param attack the attack to set
	 */
	public void setAttack(int attack) {
		this.attack = attack;
	}

	/**
	 * @return the movement
	 */
	public int getMovement() {
		return movement;
	}

	/**
	 * @param movement the movement to set
	 */
	public void setMovement(int movement) {
		this.movement = movement;
	}

	/**
	 * @return the xPos
	 */
	public int getxPos() {
		return xPos;
	}

	/**
	 * @param xPos the xPos to set
	 */
	public void setxPos(int xPos) {
		this.xPos = xPos;
	}

	/**
	 * @return the yPos
	 */
	public int getyPos() {
		return yPos;
	}

	/**
	 * @param yPos the yPos to set
	 */
	public void setyPos(int yPos) {
		this.yPos = yPos;
	}

	/**
	 * @return the alive
	 */
	public boolean isAlive() {
		return alive;
	}

	/**
	 * @param alive the alive to set
	 */
	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	public static void main(String[] args) {
		Monster Frank = new Monster();
		System.out.println(Frank.attack);

	}

}
