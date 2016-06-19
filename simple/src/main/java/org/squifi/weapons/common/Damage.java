package org.squifi.weapons.common;

import junit.framework.Assert;

/**
 * Value Object for damage values.
 * @author Ben Mc Dougall
 *
 */
public class Damage {
	
	private static int damage;
	private static final int minDamage = 1;
	private static final int maxDamage = 400000000;
	
	private Damage() {
		damage = minDamage;
	}
	
	public static void set(int value) {
		Assert.assertNotNull(value);

		Assert.assertTrue("Lowest possible Damage value is " + minDamage, value >= minDamage);
		Assert.assertTrue("Damage can not be above " + maxDamage, value <= maxDamage);

		damage = value;
	}
	
	public static Damage create() {
		return new Damage();
	}
	
	public static int valueOf() {
		return damage;
	}
}