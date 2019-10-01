package logic;
import model.*;

public class Launcher {
	
	public static void main( String args[] ) {
		Place p1 = new Place( 1 );
		Place p2 = new Place( 2 );
		Place p3 = new Place( 3 );
		
		Transition t1 = new Transition( );
		Transition t2 = new Transition( );
		Transition t3 = new Transition( );
		
		/* Create arcs */
		//inputs
		Arc a1 = new Arc( 1, p1);
		Arc a2 = new Arc( 2, p2);
		
		//outputs
		Arc a3 = new Arc( 1, p3);
		
		t1.addInput( a1 );
		t1.addInput( a2 );
		t1.addOutput( a3 );
		
	}
	
}
