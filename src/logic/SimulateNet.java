package logic;
import java.util.ArrayList;
import model.PetriNet;
import model.Transition;

/**
* 
* Logic to simulate the behaviour of a PetriNet
* 
* @author  Daniel Santos and Guillem Sanyas
*/

public class SimulateNet {
	
	private PetriNet net;
	
	/**
	 * Constructor, receives a PetriNet
	 * @param _net
	 */
	public SimulateNet( PetriNet _net ) {
		net = _net;
	}
	
	/**
	 * Run the the PetriNet, show each state of the 
	 * PetriNet during the simulation  
	 */
	public void run() {
		System.out.println("The simulation has started...");
		System.out.println("The initial Petri Net is : ");
		System.out.println(net.toString());
		int step = 1;
		ArrayList<Transition> trans = net.getPossibleTransitions();
		while( trans.size() > 0 ) {
			System.out.println("------------------------------- Step " + step + " ----------------------" );
			int random = (int) Math.random()*(trans.size()-1);
			trans.get(random).exec();
			trans = net.getPossibleTransitions();
			System.out.println(net.toString());
			step++;
		}
		System.out.println("The simulation has finished...");
	}
}
