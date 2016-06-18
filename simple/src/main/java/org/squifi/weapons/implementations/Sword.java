package org.squifi.factorymethod;

import junit.framework.Assert;

public class Sword extends WeaponImpl {

	private Sword() {
		name = "Sword";
		damage = 20;
	}
	
	public static Iweapon create() {
		return new Sword();
	}
}
