package org.squifi.factorymethod;

public class Hammer extends WeaponImpl {

	private Hammer(){
	}
	
	public static Iweapon create() {
		return new Hammer();
	}
}
