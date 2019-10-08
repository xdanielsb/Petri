package model;

import logic.InvalidValueArc;

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
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	public boolean isCrossable() {
		return this.value <= this.getP().getNumJetons();
	}
	
	public void add() {
		this.getP().increaseJeton(this.getValue());
	}
	
	public void remove() {
		this.getP().decreaseJeton(this.getValue());
	}
	@Override
	public String toString() {
		String str = "( weight= "+value +"  jetons= "+this.getP().getNumJetons() +")";
		return str;
	}
}
