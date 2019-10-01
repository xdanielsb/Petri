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
			if( this.input.get(i).getValue() > this.input.get(i).getP().getNumJetons()  ) 
				flag = false; 
		}
		return flag;
	}
	public void exec() {
		if( isPossible()) {
			for( Arc arc: input) {
				arc.getP().setNumJetons(arc.getP().getNumJetons()-arc.getValue());
			}
			for( Arc arc: output) {
				arc.getP().setNumJetons(arc.getP().getNumJetons()+arc.getValue());
			}
		}else {
			System.out.println( "Hey!, It is not possible to exec this transition.");
		}
	}
	
}
