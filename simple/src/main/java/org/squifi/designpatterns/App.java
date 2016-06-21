package org.squifi.designpatterns;

import org.squifi.weapons.common.Iweapon;
import org.squifi.weapons.implementations.Hammer;
import org.squifi.weapons.implementations.Sword;

public class App 
{
    public static void main( String[] args )
    {
    	// Factory Method examples
    	Iweapon dagger = Sword.create();
    	Iweapon hammer = Hammer.create();

    	System.out.println(dagger.attack());
    	System.out.println(hammer.attack());
    }
}
