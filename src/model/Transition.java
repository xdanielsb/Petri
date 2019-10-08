package model;

import java.util.ArrayList;

public class Transition {
	
	private ArrayList< Arc > input; 
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
	public void exec() {
		boolean isPo = this.isPossible();
		if( isPo ) {
			for( int i = 0; i < input.size(); i++) {
				input.get(i).remove();
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
		String desc, in="Input [  ", out="Output = [";
		for( Arc arc: input) in += arc.toString();
		in += "]\n";
		for( ArcRegular arc: output) out += arc.toString();
		out += "]\n";
		desc = in + out;
		return desc;
	}
}
