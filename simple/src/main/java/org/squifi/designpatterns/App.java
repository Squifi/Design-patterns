package org.squifi.designpatterns;

import org.springframework.context.annotation.*;
import org.squifi.weapons.common.Iweapon;
import org.squifi.weapons.implementations.Hammer;

@Configuration
@ComponentScan
public class App 
{
	
    public static void main( String[] args )
    {
    	// Factory Method examples
    	Iweapon hammer = Hammer.create();
    	System.out.println(hammer.attack());
    }
}
