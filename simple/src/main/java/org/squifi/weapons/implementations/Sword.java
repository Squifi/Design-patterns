package org.squifi.weapons.implementations;

import org.squifi.weapons.common.Iweapon;
import org.squifi.weapons.common.WeaponImpl;

import junit.framework.Assert;

public class Sword extends WeaponImpl {

	private Sword() {
		name = "Sword";
		damage = 20;
	}
	
	public static Iweapon create() {
		return new Sword();
	}

	public String performAction() {
		StringBuilder sb = new StringBuilder();
		sb.append("You let your " + getName() + " slice through the air.");
		return sb.toString();
	}
}
