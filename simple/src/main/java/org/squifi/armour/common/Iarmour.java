package org.squifi.armour.common;

import java.util.HashSet;

public interface Iarmour {

	void SetArmourName(String armourName);

	String GetArmourName();

	void takeDamage(int damage, DamageType damageType);
	
	HashSet<DamageType> Resistance();
	
	void SetResistance(DamageType damageType);
}
