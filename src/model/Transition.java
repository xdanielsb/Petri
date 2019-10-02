package model;

import java.util.ArrayList;

public class Transition {
	
	private ArrayList< Arc > input; 
	private ArrayList< Arc > output;
	
	public Transition() {
		input = new ArrayList<>();
		output = new ArrayList<>();
	}
	public void addInput( Arc arc){
		input.add(arc);
	}

	public void addOutput( Arc arc){
		output.add(arc);
	}
	public boolean isPossible() {
		boolean flag = true; 
		for( int i = 0; i< input.size() && flag; i++) {
			int jetons = this.input.get(i).getP().getNumJetons();
			int cost = this.input.get(i).getValue(); 
			if(  cost > jetons  ) {
				flag = false;
			}
				 
		}
		return flag;
	}
	public void exec() {
		if( isPossible()) {
			for( int i = 0; i < input.size(); i++)
				input.get(i).getP().setNumJetons(input.get(i).getP().getNumJetons()-input.get(i).getValue());
			for( int i = 0; i < output.size(); i++) 
				output.get(i).getP().setNumJetons(output.get(i).getP().getNumJetons()+output.get(i).getValue());
		}else {
			System.out.println( "Hey!, It is not possible to exec this transition.");
		}
	}
	
}
