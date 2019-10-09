package test;
import logic.InvalidValueArc;
import logic.SimulateNet;
import model.*;

/**
* <h1>Simulator Petri Networks</h1>
* Represent and Simulate a Petri Network
*
* @author  Daniel Santos and Guillem Sanyas
* @version 1.0
* @since   2019-10-08 
*/
public class Launcher {
	
   /**
   * This is the main method which makes use of SimulateNet
   * @param args Unused.
   * @return Nothing.
   */
	public static void main( String args[] ) {
		
		/* Define the elements of the Petri Net */
		//Create the petrinet
		PetriNet net = new PetriNet();
		
		Place p1, p2, p3;
		Transition t1;
		ArcRegular a1 = null, a2=null, a3 =null;
		
		/* Instance the elements */
		p1 = new Place( 2 );
		p2 = new Place( 4 );
		p3 = new Place( 5 );
		
		t1 = new Transition( );
		
		try {
			//inputs
			a1 = new ArcRegular( 1, p1);
			a2 = new ArcRegular( 2, p2);
			//outputs
			a3 = new ArcRegular( 1, p3);
		}catch (InvalidValueArc e) {
			System.err.println(e.getMessage());
			System.exit(0);
		}
		
		
		/* Add the arcs to the transition*/	
		t1.addInput( a1 );
		t1.addInput( a2 );
		t1.addOutput( a3 );
		
		
		// Add the elements to the Petri Net
		net.addArc(a1);
		net.addArc(a2);
		net.addArc(a3);
		
		net.addPlace(p1);
		net.addPlace(p2);
		net.addPlace(p3);
		
		
		net.addTransition(t1);
		
		
		// Simulate a Network
		SimulateNet simulator = new SimulateNet(net);
		simulator.run();
		
	}
	
}
