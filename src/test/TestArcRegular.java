package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.ArcRegular;
import model.Place;

/**
 * @author Daniel Santos and Guillem Sanyas
 *
 */
class TestArcRegular {
	@Test
	void testIsCrossable() {
		Place p = new Place(4);
		try{
			ArcRegular ac = new ArcRegular(2,p);
			assertTrue(ac.isCrossable());
			ac = new ArcRegular(4,p);
			assertTrue(ac.isCrossable());
			ac = new ArcRegular(5,p);
			assertFalse(ac.isCrossable());
		}
		catch (Exception e) {
			fail("Incorrect arc value");
		}
	}

	@Test
	void testRemove() {
		Place p = new Place(6);
		try{
			ArcRegular ac = new ArcRegular(2,p);
			ac.remove();
			assertEquals(p.getNumJetons(),4);
			ac = new ArcRegular(4,p);
			ac.remove();
			assertEquals(p.getNumJetons(),0);
		}
		catch (Exception e) {
			fail("Exception occured");
		}
		p = new Place(5);
		try{
			ArcRegular ac = new ArcRegular(7,p);
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
		ArcRegular ac = new ArcRegular(p);
		assertEquals(ac.getValue(),1);
	}

	@Test
	void testArcRegularIntPlace() {
		Place p = new Place(0);
		try {
			ArcRegular ac = new ArcRegular(5,p);
			assertEquals(ac.getValue(),5);
		} catch(Exception e) {
			fail("Unpredicted exception was thrown");
		}
		try {
			ArcRegular ac = new ArcRegular(-1,p);
			fail("Excepted exception was not thrown");
		} catch(Exception e) {
		}
	}

	@Test
	void testGetValue() {
		Place p = new Place(4);
		try{
			ArcRegular ac = new ArcRegular(2,p);
			assertEquals(ac.getValue(),2);
		}
		catch (Exception e) {
			fail("Unpredicted exception was thrown");
		}
	}

	@Test
	void testSetValue() {
		Place p = new Place(6);
		try{
			ArcRegular ac = new ArcRegular(3,p);
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
		try{
			ArcRegular ac = new ArcRegular(1,p);
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
