package logic;
import model.*;
/**
 * @author Daniel Santos and Guillem Sanyas
 * Represent and Simulate a Petri Network
 */
public class Launcher {
	
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
		simulator.runAllTransitions();

		// run all Transitions 
		//s.runAllTransitions();
		
		// run an specific transition
		//s.runOneTransition(t1);
		
		// modify a place
		//p1.increaseJeton(10);
		

		
	}
	
}
