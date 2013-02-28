package bean;

public class Variable implements Comparable{
    
    private double coefficient;
    private char letter;
    
    public static char RESULT_LETTER = '#';
    
    public Variable(double coefficient, char letter) {
        this.coefficient = coefficient;
        this.letter = letter;
    }
    
    public double getCoefficient() {
        return coefficient;
    }
    
    public void setCoefficient(double coefficient) {
        this.coefficient = coefficient;
    }
    
    public char getLetter() {
        return letter;
    }
    
    public void setLetter(char letter) {
        this.letter = letter;
    }

    /**
     * for ordenation purposes
     */
    @Override
    public int compareTo(Object o) {
        Variable other = (Variable) o;
        if (this.letter < other.letter)
            return -1;
        else if (this.letter == other.letter)
            return 0;
        return 1;
    }
    
    @Override
    public  String toString() {
        return String.valueOf(coefficient) + letter + "";
    }

}
