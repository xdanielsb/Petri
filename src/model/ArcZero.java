package model;
/**
* Class that represents a special Arc whose is crossable,
* if the number of jetons in the place is equal to zero.
 * @see Arc
 */
public class ArcZero extends Arc{

	public ArcZero(Place _p) {
		super(_p);
	}
	public boolean isCrossable() {
		return this.getP().getNumJetons()==0;
	}
	@Override
	public void remove() {
		// does not change any state
	}
	@Override
	public String toString() {
		String str = "(j = "+this.getP().getNumJetons() +")";
		return str;
	}
}
