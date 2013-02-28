package bean;

import java.util.Collections;
/**
 * Class that represents an Equation
 * @author caiquemoreira
 *
 */
import java.util.Vector;

public class Equation {
    
	private int numVariables = 0;
	private Vector<Variable> variables = new Vector<Variable>();
	
	public int getNumVariables() {
		return numVariables;
	}
	
	public Vector<Variable> getVariables() {
		return variables;
	}	
	
	public void setNumVariables( int i) {
		numVariables = i;
	}
	
	public Equation (String eq) throws Exception {
		if(eq != null) {
			String number = "";
			
			for (int i = 0; i < eq.length(); i++) {
				char c = eq.charAt(i);
				
				if (Character.isDigit(c) || c == '.' || c == '-') {
					number += c;
				} else if (Character.isLetter(c)){
					numVariables++;
					variables.add(new Variable(Double.valueOf(number),eq.charAt(i)));
					number = "";
				}
			}
			Collections.sort(variables);
			variables.add(new Variable(Double.valueOf(number),Variable.RESULT_LETTER));
		} else {
			throw new Exception("Invalid equation");
		}
	}
	
	public static void main (String args[]) {
		try {
			Equation e = new Equation("3x + -5.4c + 10a = 45");
			//System.out.println(e.getCoeficients().toString());
			System.out.println(e.getVariables().toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
