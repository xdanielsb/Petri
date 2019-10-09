package model;
/**
* 
* Abstract class that represents an Arc,
* simulate a connection between a Place and a a Transition
* 
* @author  Daniel Santos and Guillem Sanyas
*/
public abstract class Arc {
	 private Place p;

	public Arc(Place p) {
		this.p = p;
	}

	public Place getP() {
		return p;
	}

	public void setP(Place p) {
		this.p = p;
	}
	
	/**
	 * Method that check if is possible to execute a change 
	 * given the weight of the Arc and the Place
	 * @return boolean
	 */
	public abstract boolean isCrossable();
	
	public abstract void remove();

}
