package logic;
import java.util.ArrayList;
import model.*;
/**
 * 
 * @author xdanielsb et gsanyas
 * @version 1.0
 * This project simulates a  configurable network of Petri 
 *
 */
public class Simulation {
	private ArrayList< Arc> arcs;
	private ArrayList< Place> places;
	private ArrayList < Transition> trans;
	
	public Simulation() {
		trans = new ArrayList<>();
	}
	
	public void start() {
		System.out.println("The simulation has started...");
		boolean isPossible;
		do {
			isPossible = false;
			for( int i = 0; i < trans.size(); i++) {
				
				if( trans.get(i).isPossible()) {
					isPossible = true;
					trans.get(i).exec();
				}
			}
		}
		while( isPossible );
		System.out.println("The simulation has finished...");
	}
	
	public void addArc( Arc arc) {
		arcs.add(arc);
	}
	public void addPlace( Place plc) {
		places.add(plc);
	}
	public void addTransition( Transition tr) {
		trans.add( tr);
	}
	
	public void runSpecificTransition( ) {}
	
}
