/**
 * 
 */
package test;

import static org.junit.jupiter.api.Assertions.*;
import model.ArcCleaner;
import model.Place;
import model.Transition;

import org.junit.jupiter.api.Test;

/**
 * @author Daniel Santos and Guillem Sanyas
 *
 */
class TestArcCleaner {

	/**
	 * Test method for {@link model.ArcCleaner#isCrossable()}.
	 */
	@Test
	void testIsCrossable() {
		Place p = new Place(4);
		Transition t1 = new Transition();
		ArcCleaner ac = new ArcCleaner(p, t1);
		assertTrue(ac.isCrossable());
		p = new Place(0);
		ac = new ArcCleaner(p, t1);
		assertFalse(ac.isCrossable());
	}

	/**
	 * Test method for {@link model.ArcCleaner#remove()}.
	 */
	@Test
	void testRemove() {
		Place p = new Place(6);
		Transition t1 = new Transition();
		ArcCleaner ac = new ArcCleaner(p, t1);
		ac.remove();
		assertEquals(0,p.getNumJetons());
	}

}
