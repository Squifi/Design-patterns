package org.squifi.weapons.common;

import junit.framework.TestCase;

public class DamageTest extends TestCase {

	Damage damage = Damage.create();
	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testSet() {
		damage.set(10);
		assertEquals(10, damage.valueOf());
	}

	public void testCreate() {
		assertNotNull(Damage.create());
	}

	public void testValueOf() {
		assertEquals(10, damage.valueOf());
	}

}
