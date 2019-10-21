package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.ArcZero;
import model.Place;

class ArcZeroTest {
	
	private Place p,p2;
	private ArcZero ac, ac2;

	@BeforeEach
	void setUp() throws Exception {
		p2 = new Place(2);
		ac2 = new ArcZero(p2);
		p = new Place(0);
		ac = new ArcZero(p);
	}

	@Test
	void testIsCrossable() {
		assertTrue(ac.isCrossable());
		assertFalse(ac2.isCrossable());
	}

	@Test
	void testRemove() {
		ac.remove();
		assertEquals(p.getNumJetons(),0);
	}

	@Test
	void testGetP() {
		assertSame(ac.getP(),p);
	}

	@Test
	void testSetP() {
		ac.setP(p2);
		assertSame(ac.getP(),p2);
	}

}
