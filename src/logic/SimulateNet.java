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
		Logger.getLogger().log("----- The simulation has started. ------\n");
		Logger.getLogger().log("\t------- Notation -------" );
		Logger.getLogger().log("\t  w = weight arc" );
		Logger.getLogger().log("\t  j = # jettons of the place connected to that arc \n" );
		
		Logger.getLogger().log(" \t------- Initial Configuration  Net: \n");
		
		Logger.getLogger().log(net.toString());
		ArrayList<Transition> trans = net.getPossibleTransitions();
		for( int step = 1; trans.size() > 0; step++ ) {
			Logger.getLogger().log("\t------- Step " + step + " -------" );
			int random = (int) Math.random()*(trans.size()-1);
			trans.get(random).exec();
			trans = net.getPossibleTransitions();
			Logger.getLogger().log(net.toString());
			step++;
		}
		Logger.getLogger().log("The simulation has finished...");
	}
}
