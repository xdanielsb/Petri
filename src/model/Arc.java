package model;

import logic.InvalidValueArc;

public class Arc {
	private int value;
	private Place p;
	public Arc() {
		this.value = 1;
	}
	public Arc(int _value, Place _p) throws InvalidValueArc {
		this.value = _value;
		if (_value <= 0) {
			throw new InvalidValueArc();
		}
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
	
	public boolean isCrossable() {
		return this.value <= this.p.getNumJetons();
	}
	@Override
	public String toString() {
		String str = "( weight= "+value +"  jetons= "+this.p.getNumJetons() +")";
		return str;
	}
}
