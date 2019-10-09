package model;

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

}
