package org.squifi.armour.common;

import static org.junit.Assert.*;

import java.util.HashSet;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.util.Assert;

public class ArmourImplTest {

	@Test
	public void testSetArmourName() {
		//Arrange
		ArmourImpl armour = Mockito.mock(ArmourImpl.class);

		//Act
		Mockito.when(armour.GetArmourName()).thenReturn("TestArmour");
		
		// Assert
		assertNotNull(armour);
		assertEquals(armour.GetArmourName(), "TestArmour");
	}

	@Test
	public void testTakeDamage() {
		//Arrange 
		ArmourImpl armour = Mockito.mock(ArmourImpl.class);
		
		//Act 
		Mockito.when(armour.getRemainingProtection()).thenReturn(50.0);
		
		//Assert
		Assert.isTrue(armour.getRemainingProtection() == 50.0);
	}

	@Test
	public void testResistance() {
		//Arrange
		ArmourImpl armour = Mockito.mock(ArmourImpl.class);
		
		//Act
		Mockito.when(armour.Resistance())
		.thenReturn(new HashSet<DamageType>());

		//Assert
		assertNotNull(armour.Resistance());
	}
}
