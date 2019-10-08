package model;
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
public class PetriNet implements IConstructNet{
	private ArrayList< ArcRegular> arcs;
	private ArrayList< Place> places;
	private ArrayList < Transition> trans;
	
	public PetriNet() {
		trans = new ArrayList<>();
		arcs = new ArrayList<>();
		places = new ArrayList<>();
	}
		
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
	public void addArc(ArcRegular a) {
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
	public void removeArc( ArcRegular arc) {
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
		for ( Transition t : trans) desc += t.toString() ;
		return desc;
	}
	
	public void runSpecificTransition( ) {}
	
}
