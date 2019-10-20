package model;

import logic.InvalidValueArc;
/**
* 
* Concret type of Arc, represents a normal edge 
* whose default value is equals to one
* 
* @author  Daniel Santos and Guillem Sanyas
* @see Arc
*/
public class ArcRegular extends Arc{
	private int value;
	
	public ArcRegular(Place _p) {
		super(_p);
		this.value = 1;
	}
	public ArcRegular(int _value, Place _p) throws InvalidValueArc {
		super(_p);
		this.value = _value;
		if (_value <= 0) {
			throw new InvalidValueArc();
		}
	}
	/** setters and getters */
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	
	public boolean isCrossable() {
		return this.value <= this.getP().getNumJetons();
	}
	
	/**
	 * Function who increase the number of Jetons
	 * @return void
	 */
	public void add() {
		this.getP().increaseJeton(this.getValue());
	}

	/**
	 * Function who decreasethe number of Jetons
	 * @return void
	 */
	public void remove() {
		this.getP().decreaseJeton(this.getValue());
	}
	@Override
	public String toString() {
		String str = "(w = "+value +",  j = "+this.getP().getNumJetons() +")";
		return str;
	}
}
