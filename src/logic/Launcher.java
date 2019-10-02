package logic;
import model.*;

public class Launcher {
	
	public static void main( String args[] ) {
		Place p1 = new Place( 2 );
		Place p2 = new Place( 4 );
		Place p3 = new Place( 5 );
		
		Transition t1 = new Transition( );
		Transition t2 = new Transition( );
		Transition t3 = new Transition( );
		
		/* Create arcs */
		
		try {
			//inputs
			Arc a1 = new Arc( 1, p1);
			Arc a2 = new Arc( 2, p2);
			
			//outputs
			Arc a3 = new Arc( 1, p3);
			
			t1.addInput( a1 );
			t1.addInput( a2 );
			t1.addOutput( a3 );
			
		}catch (InvalidValueArc e) {
			System.err.println(e.getMessage());
		}
		;
		
		//Simmulation
		SimulationPetriNet s = new SimulationPetriNet();
		s.addTransition(t1);
		

		// run all Transitions 
		s.runAllTransitions();
		
		
		// run an specific transition
		//s.runOneTransition(t1);
		
		// modify a place
		//p1.increaseJeton(10);
		
		
	}
	
}
