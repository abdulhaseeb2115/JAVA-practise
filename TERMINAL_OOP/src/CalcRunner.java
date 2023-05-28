import java.io.*;

public class CalcRunner {
	    public static void main(String[] args) throws IOException, FileNotFoundException,  ClassNotFoundException {
	        Calculator c = new Calculator();
	        if(c.loadHistory()) System.out.println("History loaded successfully");
	        else System.out.println("History cannot be loaded");
	        System.out.println(c);    // Prints current history
	        c.clearHistory();            // Clears history from memory
	        System.out.println(c.add(1, 2));                   // add the two operands and print result
	        System.out.println(c.add(2, 2));        
	        System.out.println(c.add(3, 2));
	        System.out.println(c.sub(4, 2));                   // subtract two operands and print result
	        c.storeHistory();           // store history in the history file
	    }
	}



