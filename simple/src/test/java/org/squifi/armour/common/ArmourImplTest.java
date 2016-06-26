package org.squifi.armour.common;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

public class ArmourImplTest {

	ArmourImpl testItem = Mockito.mock(ArmourImpl.class);
	ArmourImpl armour = Mockito.mock(ArmourImpl.class);

	@Before
	public void setUp() throws Exception {
		armour.SetArmourName("TestArmour");
		armour.SetResistance(DamageType.BASIC);
	}

	@Test
	public void testSetArmourName() {
		testItem.SetArmourName("TestArmour");
		assertEquals(armour.GetArmourName(), testItem.GetArmourName());
	}

	@Test
	public void testTakeDamage() {
		fail("Not implemented");
	}

	@Test
	public void testResistance() {
		armour.SetResistance(DamageType.BASIC);
		assertTrue(armour.Resistance().contains(DamageType.BASIC));
	}
}
