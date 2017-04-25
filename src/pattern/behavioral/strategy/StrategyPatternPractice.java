package pattern.behavioral.strategy;

public class StrategyPatternPractice {
	
	public static void main(String[] args){
		Soldier soldier1 = new Soldier(new Knife());
		soldier1.fight();
		soldier1.setWeapon(new Gun());
		soldier1.fight();
		soldier1.setWeapon(new Spear());
		soldier1.fight();
		
		System.out.println();
		
		Soldier soldier2 = new Soldier(new Knife());
		soldier2.fight();
		soldier1.setWeapon(new Spear());
		soldier1.fight();
		soldier1.setWeapon(new Gun());
		soldier1.fight();
		
	}
}
