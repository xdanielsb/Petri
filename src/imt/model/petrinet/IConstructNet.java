package imt.model.petrinet;
/**
 * 
 * @author Daniel Santos and Guillem Sanyas
 *  Interface that specify the contracts for building or modifying the Petri Net
 */
public interface IConstructNet {
	
	/**
	 * Add an arc to the net
	 * @return void
	 * @param Arc : 
	 */
	public void addArc(Arc a) ;
	
	/**
	 * Add a place to the net
	 * @return void
	 * @param Place : 
	 */
	public void addPlace( Place p);
	/**
	 * Add a  transition to the net
	 * @return void
	 * @param Transition : 
	 */
	public void addTransition( Transition tr);
	/**
	 * Remove an arc in the net
	 * @return void
	 * @param Arc : 
	 */
	public void removeArc( Arc arc);
	/**
	 * Remove a place in the net
	 * @return void
	 * @param Place : 
	 */
	public void removePlace( Place place);
	/**
	 * Remove a transition in the net
	 * @return void
	 * @param Transition : 
	 */
	public void removeTransition( Transition tran) ;
}
