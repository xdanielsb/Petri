package model;

public class Place {
	private int numJetons;
	public Place( int _numJetons) {
		this.numJetons = _numJetons;
	}
	public int getNumJetons() {
		return numJetons;
	}
	public void increaseJeton(int numJetons) {
		this.numJetons += numJetons;
	}
	public void decreaseJeton(int numJetons) {
		this.numJetons -= numJetons;
	}
	
}
