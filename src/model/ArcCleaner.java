package model;
/**
* 
* Concret type of Arc, whose behaviour is:
* make the number of jetons equals zero if 
* the method isCrossable returns true
* @author  Daniel Santos and Guillem Sanyas
* @see Arc
*/
public class ArcCleaner extends Arc{
	public ArcCleaner(Place p) {
		super(p);
	}
	public boolean isCrossable() {
		return this.getP().getNumJetons()>=1;
	}
	@Override
	public void remove() {
		this.getP().setNumJetons(0);
	}
	@Override
	public String toString() {
		String str = "(j = "+this.getP().getNumJetons() +")";
		return str;
	}
}
