package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.ArcRegular;
import model.Place;
import model.Transition;

/**
 * @author Daniel Santos and Guillem Sanyas
 *
 */
class TestArcRegular {
	@Test
	void testIsCrossable() {
		Place p = new Place(4);
		Transition t1 = new Transition();
		try{
			ArcRegular ac = new ArcRegular(p,t1,true, 2);
			assertTrue(ac.isCrossable());
			ac = new ArcRegular(p,t1, true, 4);
			assertTrue(ac.isCrossable());
			ac = new ArcRegular(p, t1, false, 5);
			assertFalse(ac.isCrossable());
		}
		catch (Exception e) {
			fail("Incorrect arc value");
		}
	}

	@Test
	void testRemove() {
		Place p = new Place(6);
		Transition t1 = new Transition();
		try{
			ArcRegular ac = new ArcRegular(p, t1, true, 2);
			ac.remove();
			assertEquals(p.getNumJetons(),4);
			ac = new ArcRegular(p, t1, false, 4);
			ac.remove();
			assertEquals(p.getNumJetons(),0);
		}
		catch (Exception e) {
			fail("Exception occured");
		}
		p = new Place(5);
		try{
			ArcRegular ac = new ArcRegular(p, t1, true, 7);
			ac.remove();
			fail("Excepted exception was not thrown");
		}
		catch (Exception e) {
			assertEquals(p.getNumJetons(),5);
		}
	}

	@Test
	void testArcRegularPlace() {
		Place p = new Place(3);
		Transition t1 = new Transition();
		ArcRegular ac = new ArcRegular(p,t1, true);
		assertEquals(ac.getValue(),1);
	}

	@Test
	void testArcRegularIntPlace() {
		Place p = new Place(0);
		Transition t1 = new Transition();
		try {
			ArcRegular ac = new ArcRegular(p, t1, true ,5);
			assertEquals(ac.getValue(),5);
		} catch(Exception e) {
			fail("Unpredicted exception was thrown");
		}
		try {
			ArcRegular ac = new ArcRegular(p, t1, true, -1);
			fail("Excepted exception was not thrown");
		} catch(Exception e) {
		}
	}

	@Test
	void testGetValue() {
		Place p = new Place(4);
		Transition t1 = new Transition();
		try{
			ArcRegular ac = new ArcRegular(p, t1, true,  2);
			assertEquals(ac.getValue(),2);
		}
		catch (Exception e) {
			fail("Unpredicted exception was thrown");
		}
	}

	@Test
	void testSetValue() {
		Place p = new Place(6);
		Transition t1 = new Transition();
		try{
			ArcRegular ac = new ArcRegular(p, t1, true, 3);
			ac.setValue(5);
			assertEquals(ac.getValue(),5);
		}
		catch (Exception e) {
			fail("Unpredicted exception was thrown");
		}
	}

	@Test
	void testAdd() {
		Place p = new Place(7);
		Transition t1 = new Transition();
		try{
			ArcRegular ac = new ArcRegular(p, t1, true, 1);
			ac.add();
			assertEquals(p.getNumJetons(),8);
		}
		catch (Exception e) {
			fail("Unpredicted exception was thrown");
		}
	}

	@Test
	void testToString() {
		// TODO
	}

}
