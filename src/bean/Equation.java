package bean;

/**
 * Class that represents an Equation
 * @author caiquemoreira
 *
 */
import java.util.Vector;

public class Equation {
    
	private int numVariables = 0;
	private Vector<Character> variables = new Vector<Character>();
	private Vector<Double> coeficients = new Vector<Double>();
	
	public int getNumVariables() {
		return numVariables;
	}
	
	public Vector<Character> getVariables() {
		return variables;
	}
	
	public Vector<Double> getCoeficients() {
		return coeficients;
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
					variables.add(eq.charAt(i));
					coeficients.add(Double.valueOf(number));
					number = "";
				}
			}
		} else {
			throw new Exception("Equação invalida");
		}
	}
	
	public static void main (String args[]) {
		try {
			Equation e = new Equation("3x + -5.4y + 10z = 45");
			System.out.println(e.getCoeficients().toString());
			System.out.println(e.getVariables().toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
