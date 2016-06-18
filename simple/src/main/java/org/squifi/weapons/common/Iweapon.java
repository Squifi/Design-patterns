package org.squifi.factorymethod;

public interface Iweapon {
	
	void increaseDamage(int damage);
	
	void decreaseDamage(int damage);
	
	int dealDamage();
	
	int getDamage();
}
