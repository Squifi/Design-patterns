package org.squifi.weapons.common;

import junit.framework.Assert;

public abstract class WeaponImpl implements Iweapon {

	protected String name = "weapon";
	void setName(String value) {
		Assert.assertTrue(value.length() > 0);
		Assert.assertNotNull(value);

		name = value;
	}
	
	protected String getName() {
		return name;
	}
	
	protected int damage = 10;
	void setDamage(int value) {
		Assert.assertNotNull(value);
		Assert.assertTrue(value > 0);
		
		damage = value;
	}
	
	public int getDamage() {
		return damage;
	}

	public int dealDamage() {
		return damage;
	}
	
	public String performAction() {
		StringBuilder sb = new StringBuilder();
		sb.append("You swing your weapon");
		return sb.toString();
	}
	
	public String attack() {
		return this.toString() + "\n" + this.performAction();
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
