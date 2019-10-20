package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Place;

class TestPlace {

	@Test
	void test() {
		Place p = new Place(2);
		assertEquals(2, p.getNumJetons());
	}

}
