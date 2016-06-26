package org.squifi.armour.common;

import java.util.ArrayList;
import java.util.HashSet;

public class ArmourImpl implements Iarmour {

	private HashSet<DamageType> damageType = new HashSet<DamageType>();
	private double damage = 0;
	private String armourName = "Basic Armour";
	
	@Override
	public String GetArmourName() {
		return armourName;
	}

	@Override
	public void SetArmourName(String armourName) {
		this.armourName = armourName;
	}

	@Override
	public void takeDamage(int damage, HashSet<DamageType> damageType) {
		for(DamageType dt: damageType)
		{
			if (this.damageType.contains(dt) )
			{
				// TODO: Currently static damage, needs a better solution
				// Also the iteration over damageTypes is Mediocre
				this.damage = damage * 0.5;
			}
		}
	}

	@Override
	public HashSet<DamageType> Resistance() {
		return damageType;
	}

}
