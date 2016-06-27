package org.squifi.weapons.common;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class WeaponImplTest {

	@Test
	public void SetWeaponName() {
		//Arrange
		WeaponImpl weaponImpl = Mockito.mock(WeaponImpl.class);

		//Act
		Mockito.when(weaponImpl.getName()).thenReturn("TestSword");
		
		//Assert
		assertEquals(weaponImpl.getName(), "TestSword");
	}
	
	@Test
	public void SetWeaponDamage() 
	{
		//Arrange
		WeaponImpl weaponImpl = Mockito.mock(WeaponImpl.class);

		//Act
		Mockito.when(weaponImpl.getDamage()).thenReturn(50);
		
		//Assert
		assertEquals(weaponImpl.getDamage(), 50);
	}

}
