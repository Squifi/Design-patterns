package org.squifi.designpatterns;

import org.squifi.factorymethod.Hammer;
import org.squifi.factorymethod.Iweapon;
import org.squifi.factorymethod.Sword;

public class App 
{
    public static void main( String[] args )
    {
    	Iweapon weapon = Hammer.create();
    	System.out.println(weapon.toString());
    }
}
