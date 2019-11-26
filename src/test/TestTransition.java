package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Arc;
import model.ArcRegular;
import model.Place;
import model.Transition;

class TestTransition {
	
	private Transition t;

	@BeforeEach
	void setUp() throws Exception {
		t = new Transition();
		Place p2 = new Place(2);
		Arc ac2 = new ArcRegular(p2, t, true);
		t.addInput(ac2);
		Place p3 = new Place(3);
		ArcRegular ac3 = new ArcRegular(p3, t, false ,2);
		t.addOutput(ac3);
	}

	@Test
	void testIsPossible() {
		assertTrue(t.isPossible());
	}

}
