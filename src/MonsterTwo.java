import java.util.Arrays;

public class MonsterTwo {
	
	static char[][] battleBoard = new char[10][10];
	
	public static void buildBattleBoard() {
		for (char[] row : battleBoard) {
			Arrays.fill(row, '*');
		}
	}
	
	public static void redrawBoard() {
		int k = 1;
		while (k <= 30) {System.out.print('-'); k++;}
		System.out.println();
		
		for (int i = 0; i < battleBoard.length; i++) {
			for (int j = 0; j < battleBoard[i].length; j++) {
				System.out.print("|" + battleBoard[i][j] + "|");
			}
			System.out.println();
		}
		
		k = 1;
		while (k <= 30) {System.out.print('-'); k++;}
		System.out.println();
	}
	
	public final String TOMBSTONE = "Here lies a dead monster.";
	public int xPos = 0;
	public int yPos = 0;
	public String name = "Big Monster";
	public char nameChar1 = 'B';
	public static int numMonsters = 0;
	
	private int health = 500;
	private int attack = 20;
	private int movement = 2;
	private boolean alive = true;

	public MonsterTwo(int newHealth, int newAttack, int newMovement, String name) {
		this.health = newHealth;
		this.attack = newAttack;
		this.movement = newMovement;
		this.name = name;
		
		int maxXboardSpace = battleBoard.length - 1;
		int maxYboardSpace = battleBoard[0].length - 1;
		
		int randNumX, randNumY;
		
		do {
			randNumX = (int) (Math.random() * maxXboardSpace);
			randNumY = (int) (Math.random() * maxYboardSpace);
		} while (battleBoard[randNumX][randNumY] != '*');
		
		this.xPos = randNumX;
		this.yPos = randNumY;
		
		this.nameChar1 = this.name.charAt(0);
		
		battleBoard[this.xPos][this.yPos] = this.nameChar1;
		
		numMonsters++;
	}
	
	public MonsterTwo() {
		numMonsters++;
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
		MonsterTwo Frank = new MonsterTwo();
		System.out.println(Frank.attack);

	}

}
