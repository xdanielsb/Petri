package model;

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

	public Arc(Place p) {
		this.p = p;
	}

	/** getters and setters for place*/
	public Place getP() {
		return p;
	}

	public void setP(Place p) {
		this.p = p;
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
