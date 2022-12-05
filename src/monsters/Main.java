package monsters;
public class Main {
	public static void main(String[] args) {
		
		Monster m1 = new FireMonster("r2u2");
		Monster m2 = new WaterMonster("u2r2");
		Monster m3 = new StoneMonster("r2r2");
		
		System.out.println(m1.attack());
		System.out.println(m2.attack());
		System.out.println(m3.attack());
		
		m1 = new StoneMonster("a2b2");
		System.out.println(m1.attack());
		
		Monster m4 = new Monster("u2u2");
		System.out.println(m4.attack());
	
	}
	
}

class Monster {
	String name;
	
public Monster(String name) {
		this.name = name;
	}

public String attack() {	
	return "!^_&^$@+%$* I don't know how to attack!";
}


}

class FireMonster extends Monster {

	public FireMonster(String name) {
		super(name);
	}

	@Override
	public String attack() {
		return "Attack with fire!";
	}
	
}

class WaterMonster extends Monster {
	public WaterMonster(String name) {
		super(name);
	}

	@Override
	public String attack() {
		return "Attack with water!";
	}
	
}

class StoneMonster extends Monster {

	public StoneMonster(String name) {
		super(name);
	}

	@Override
	public String attack() {
		return "Attack with stones!";
	}
	
}

