package pattern.behavioral.strategy;

public class Soldier {
	
	Weapon weapon;
	
	Soldier(Weapon weapon){
		this.weapon = weapon;
	}
	
	public void setWeapon(Weapon weapon){
		this.weapon = weapon;
	}
	
	public void fight(){
		weapon.attack();
	}
}
