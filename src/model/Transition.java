package model;

import java.util.ArrayList;

import logic.InvalidJetonsNumber;
/**
 * 
 * @author xdanielsb et gsanyas
 * @version 1.0
 * Class that represents a transition
 *
 */
public class Transition {
	
	private ArrayList< Arc > input; 
	/**
	 * A list that represents the output ars, the 
	 * only type of arcs output are type regular
	 */
	private ArrayList< ArcRegular > output;
	
	public Transition() {
		input = new ArrayList<>();
		output = new ArrayList<>();
	}
	public void addInput( Arc arc){
		input.add(arc);
	}

	public void addOutput( ArcRegular arc){
		output.add(arc);
	}
	public boolean isPossible() {
		boolean flag = true; 
		for( int i = 0; i< input.size() && flag ; i++) {
			flag = input.get(i).isCrossable();
		}
		return flag;
	}
	
	/**
	 * 	Method that runs a transition
	 *  @return void
	 */
	public void exec() {
		boolean isPo = this.isPossible();
		if( isPo ) {
			for( int i = 0; i < input.size(); i++) {
				try {
					input.get(i).remove();
				} catch (InvalidJetonsNumber e) {
					// tested a priori
				}
			}
			for( int i = 0; i < output.size(); i++) {
				output.get(i).add();
			}
				
		}else {
			System.out.println( "Hey!, It is not possible to exec this transition.");
		}
	}
	@Override
	public String toString() {
		String desc, in="\t\t  In  : [\n", out="\t\t  Out : [\n";
		for( int i = 0; i < input.size(); i++) {
			if( i > 0 ) in+=",\n";
			in += "\t\t\t "+ input.get(i);
		}
		in += "\n\t\t        ]\n";
		for( int i = 0; i < output.size(); i++) {
			if( i > 0 ) out+=",\n";
			out += "\t\t\t "+ output.get(i);
		}
		out += "\n\t\t        ]\n";
		desc = in + out;
		return desc;
	}
}
