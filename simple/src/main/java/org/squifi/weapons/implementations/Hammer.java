package org.squifi.weapons.implementations;

import org.squifi.weapons.common.Iweapon;
import org.squifi.weapons.common.WeaponImpl;

public class Hammer extends WeaponImpl {

	private Hammer(){
		name = "Thor's Hammer";
		
	}
	
	public static Iweapon create() {
		return new Hammer();
	}

	public String performAction() {
		StringBuilder sb = new StringBuilder();
		sb.append("You swing your " + getName() + " with a loud swoosh.");
		return sb.toString();
	}
}
