package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.ArcZero;
import model.Place;
import model.Transition;

class ArcZeroTest {
	
	private Place p,p2;
	private ArcZero ac, ac2;
	private Transition t1;
	@BeforeEach
	void setUp() throws Exception {
		p2 = new Place(2);
		t1 = new Transition();
		ac2 = new ArcZero(p2, t1);
		p = new Place(0);
		ac = new ArcZero(p,t1);
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
