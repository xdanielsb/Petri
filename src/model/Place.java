package model;
/**
 * 
 * @author xdanielsb et gsanyas
 * @version 1.0
 * Class that represents a Place 
 *
 */
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
		this.numJetons = Math.max(0, this.numJetons);
	}
	public void setNumJetons(int numJetons) {
		this.numJetons = numJetons;
	}
	
	
}
