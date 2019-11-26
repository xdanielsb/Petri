package imt.model.petrinet;

import logic.InvalidJetonsNumber;

/**
* 
* Abstract class that represents an Arc,
* simulate a connection between a Place and a a Transition
* 
* @author  Daniel Santos and Guillem Sanyas
*/
public abstract class Arc {
	/**
	 * Attribute p: Place, the place that is connected to the arc
	 */
	private Place p;
	private Transition t;
	
	/**
	 * Attribute inTransition :
	 * true if the arc goes into the transition,
	 * false if it goes into the place
	 */
	private boolean inTransition;

	public Arc(Place p,Transition t,boolean inTransition) {
		this.p = p;
		this.t = t;
		this.inTransition = inTransition;
	}

	/** getters and setters for place*/
	public Place getP() {
		return p;
	}

	public void setP(Place p) {
		this.p = p;
	}
	
	public Transition getT() {
		return t;
	}

	public void setT(Transition t) {
		this.t = t;
	}

	public boolean isInTransition() {
		return inTransition;
	}

	public void setInTransition(boolean inTransition) {
		this.inTransition = inTransition;
	}

	/**
	 * Method that checks if is possible to execute a change 
	 * given the weight of the Arc and the Place
	 * @return boolean
	 */
	public abstract boolean isCrossable();
	
	/**
	 * Method that remove jetons from the connected place 
	 * @return void
	 */
	public abstract void remove() throws InvalidJetonsNumber;

}
