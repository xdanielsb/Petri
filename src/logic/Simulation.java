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
	
	public void addArc( int weight,Place pl) {
		arcs.add(new Arc(weight,pl));
	}
	public void addPlace( int numJeton) {
		places.add(new Place(numJeton));
	}
	public void addTransition( Transition tr) {
		trans.add( tr);
	}
	
	public void runSpecificTransition( ) {}
	
}
