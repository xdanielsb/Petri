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
	
	public void start() {
		boolean isPossible =false;
		do {
			for( int i = 0; i < trans.size(); i++) {
				if( trans.get(i).isPossible()) {
					isPossible = true;
					trans.get(i).exec();
				}
			}
		}
		while( isPossible );
	}
	
	public void runSpecificTransition( ) {}
	
}
