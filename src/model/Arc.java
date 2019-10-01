package model;

public class Arc {
	private int value;
	private Place p;
	public Arc() {
		this.value = 1;
	}
	public Arc(int _value, Place _p) {
		this.value = _value;
		this.p = _p;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public Place getP() {
		return p;
	}
	public void setP(Place p) {
		this.p = p;
	}
}
