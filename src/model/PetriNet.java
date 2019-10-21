package model;
import java.util.ArrayList;
import java.util.Collections;

import model.*;
/**
 * 
 * @author Daniel Santos and Guillem Sanyas
 * @version 1.0
 * This project simulates a  configurable network of Petri 
 *
 */
public class PetriNet implements IConstructNet{
	private ArrayList< Arc> arcs;
	private ArrayList< Place> places;
	private ArrayList < Transition> trans;
	
	public PetriNet() {
		trans = new ArrayList<>();
		arcs = new ArrayList<>();
		places = new ArrayList<>();
	}
	/**
	 * Get all transition that are crossable
	 * @return
	 */
	public ArrayList< Transition > getPossibleTransitions() {
		ArrayList< Transition > possibles = new ArrayList<>();
		for (Transition t : trans) 
			if(t.isPossible()) possibles.add(t);
		return possibles;
	}
	
	public void runOneTransition( Transition t) {
		t.exec();
	}
	@Override
	public void addArc(Arc a) {
		arcs.add(a);
	}
	@Override
	public void addPlace( Place p) {
		places.add(p);
	}
	@Override
	public void addTransition( Transition tr) {
		trans.add( tr);
	}
	@Override
	public void removeArc( Arc arc) {
		arcs.remove(arc);
	}
	@Override
	public void removePlace( Place place) {
		places.remove(place);
	}
	@Override
	public void removeTransition( Transition tran) {
		trans.remove(tran);
	}
	
	@Override
	public String toString() {
		String desc = "";
		for( int i =0; i< trans.size(); i++) {
			desc +="\t\t------ Transition # "+(i+1)+" ------\n";
			desc += trans.get(i);
		}
		return desc;
	}
	
	public void runSpecificTransition( ) {}
	
}
