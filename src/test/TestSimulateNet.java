package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import logic.InvalidValueArc;
import logic.Logger;
import logic.SimulateNet;
import model.Arc;
import model.ArcRegular;
import model.PetriNet;
import model.Place;
import model.Transition;
/**
* <h1>Simulator Petri Networks</h1>
* Test Simulator  Petri Network
*
* @author  Daniel Santos and Guillem Sanyas
* @version 1.0
* @since   2019-10-08 
*/
class TestSimulateNet {

	@Test
	void test() {
		/** Define the elements to simulate a Petri Net **/
		PetriNet net = new PetriNet();
		Place p1, p2, p3;
		Place p4, p5, p6;
		Transition t1,t2;
		Arc a1 = null, a2=null, b1=null, b2=null;
		ArcRegular a3 =null, b3=null;
		
		/** Instance the elements **/
		p1 = new Place( 2 );
		p2 = new Place( 4 );
		p3 = new Place( 5 );
		p4 = new Place( 3 );
		p5 = new Place( 2 );
		p6 = new Place( 1 );
		t1 = new Transition( );
		t2 = new Transition( );
		
		try {
			/**inputs**/
			a1 = new ArcRegular( 1, p1);
			a2 = new ArcRegular( 2, p2);
			b1 = new ArcRegular( 1, p4);
			b2 = new ArcRegular( 2, p5);
			/**outputs**/
			a3 = new ArcRegular( 1, p3);
			b3 = new ArcRegular( 1, p6);
		}catch (InvalidValueArc e) {
			Logger.getLogger().log(e.getMessage());
			fail("Not yet implemented");
		}
		
		/** Add arcs to the transition**/	
		t1.addInput(a1);
		t1.addInput( a2 );
		t1.addOutput( a3 );
		
		t2.addInput(b1);
		t2.addInput(b2);
		t2.addOutput(b3);
		
		
		/** Add elements to the Petri Net **/
		net.addArc(a1);
		net.addArc(a2);
		net.addArc(a3);
		
		net.addPlace(p1);
		net.addPlace(p2);
		net.addPlace(p3);
		
		
		net.addTransition(t1);
		net.addTransition(t2);
		
		/** Simulate a Network**/
		SimulateNet simulator = new SimulateNet(net);
		simulator.run();
		assertEquals(1,1);
	}

}
