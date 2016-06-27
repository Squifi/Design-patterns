package org.squifi.weapons.common;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

public class Sword {

	@Test
	public void createSword() {
		//Arrange
		final Sword sword = Mockito.mock(Sword.class);
		
		//Act
		sword.createSword();
		
		//Assert
		assertNotNull(sword);
	}

}
