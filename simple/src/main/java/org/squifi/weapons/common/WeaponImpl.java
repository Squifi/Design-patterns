package org.squifi.factorymethod;

import junit.framework.Assert;

public abstract class WeaponImpl implements Iweapon {

	String name = "weapon";
	void setName(String value) {
		Assert.assertTrue(value.length() > 0);
		Assert.assertNotNull(value);

		name = value;
	}
	
	String getName() {
		return name;
	}
	
	int damage = 10;
	void setDamage(int value) {
		Assert.assertNotNull(value);
		Assert.assertTrue(value > 0);
		
		damage = value;
	}
	
	public int getDamage() {
		return damage;
	}

	public void increaseDamage(int damage) {
		Assert.assertNotNull(damage);
		Assert.assertTrue(damage > 0);
		
		setDamage(damage);
	}

	public void decreaseDamage(int damage) {
		Assert.assertNotNull(damage);
		Assert.assertTrue(damage > 0);
		
		setDamage(damage * - 1);
	}

	public int dealDamage() {
		return damage;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Your " 
				+ getName() 
				+ " deals " 
				+ getDamage() + " points of damage");
		return sb.toString();
	}
}
