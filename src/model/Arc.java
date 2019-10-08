package model;

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
	
	public abstract boolean isCrossable();
	
	public abstract void remove();

}
