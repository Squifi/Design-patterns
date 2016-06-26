package org.squifi.designpatterns;

import org.springframework.context.annotation.*;
import org.squifi.weapons.common.Iweapon;
import org.squifi.weapons.implementations.Hammer;
import org.squifi.weapons.implementations.Sword;

@Configuration
@ComponentScan
public class App 
{
	
    public static void main( String[] args )
    {
    	// Factory Method examples
    	Iweapon hammer = Hammer.create();
    	Iweapon dagger = Sword.create();
    	System.out.println(hammer.attack());
    	System.out.print(dagger.attack());
    }
}
