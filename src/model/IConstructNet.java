package model;

public interface IConstructNet {
	public void addArc(ArcRegular a) ;
	public void addPlace( Place p);
	public void addTransition( Transition tr);
	public void removeArc( ArcRegular arc);
	public void removePlace( Place place);
	public void removeTransition( Transition tran) ;
}
