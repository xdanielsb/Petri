package model;

public class ArcCleaner extends Arc{

	public ArcCleaner(Place p) {
		super(p);
		// TODO Auto-generated constructor stub
	}
	
	public boolean isCrossable() {
		return this.getP().getNumJetons()>=1;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		this.getP().setNumJetons(0);
	}

}
