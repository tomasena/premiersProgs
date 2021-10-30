package testJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HelloTest {

	@Test
	void testAjouter() {
		//fail("Not yet implemented");
		Hello testHello = new Hello();
		int somme = testHello.ajouter(2, 3);
		assertEquals(5, somme);


	}

}
