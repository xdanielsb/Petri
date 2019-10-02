package logic;
import java.util.ArrayList;
import java.util.Collections;

import model.*;
/**
 * 
 * @author xdanielsb et gsanyas
 * @version 1.0
 * This project simulates a  configurable network of Petri 
 *
 */
public class SimulationPetriNet {
	private ArrayList< Arc> arcs;
	private ArrayList< Place> places;
	private ArrayList < Transition> trans;
	
	public SimulationPetriNet() {
		trans = new ArrayList<>();
	}
	
	public void runAllTransitions() {
		System.out.println("The simulation has started...");
		boolean isPossible;
		do {
			isPossible = false;
			//Show the simulation
			System.out.println("-------------------------------");
			System.out.println(this.toString());
			//Collections.shuffle(trans);
			int random = (int) Math.random()*trans.size() ;
			for( int i = random, j = 0; j < trans.size() && !isPossible; i++, j++) {
				
				if( trans.get(i% trans.size()).isPossible()) {
					isPossible = true;
					trans.get(i%trans.size()).exec();
				}
			}
		}
		while( isPossible );
		System.out.println("The simulation has finished...");
	}
	
	public void runOneTransition( Transition t) {
		t.exec();
	}
	
	public void addArc( int weight,Place pl) throws InvalidValueArc  {
		arcs.add(new Arc(weight,pl));
	}
	public void addPlace( int numJeton) {
		places.add(new Place(numJeton));
	}
	public void addTransition( Transition tr) {
		trans.add( tr);
	}
	
	public void removeArc( Arc arc) {
		arcs.remove(arc);
	}
	public void removePlace( Place place) {
		places.remove(place);
	}
	public void removeTransition( Transition tran) {
		trans.remove(tran);
	}
	
	
	@Override
	public String toString() {
		String desc = "";
		for ( Transition t : trans) desc += t.toString() ;
		return desc;
	}
	
	public void runSpecificTransition( ) {}
	
}
