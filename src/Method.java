import javax.swing.JOptionPane;

public class Method {
	public static void main(String[]args){
		double a=0;
		double b=0;
		double sum=0;
		
		JOptionPane.showMessageDialog(null, 
				  "This program asks the user for two numbers and displays their sum",
				  "Welcome", JOptionPane.PLAIN_MESSAGE );
	
	    String x = JOptionPane.showInputDialog("Please enter your first number: \n");
	    try{
	     	a=Double.parseDouble(x);
	    	}
	    catch(Exception e) {
	    	JOptionPane.showMessageDialog(null,"You didn't enter digits as input.  Please enter numbers next time");
	    	System.exit(0);
	    	}
	    try{
	    String y = JOptionPane.showInputDialog("Please enter your second number: \n");
	    b=Double.parseDouble(y);
	    }
	    catch(Exception e){
	    	JOptionPane.showMessageDialog(null,"You didn't enter digits as input.  Please enter numbers next time");
	    	System.exit(0);	
	    }
		sum=a+b;
		JOptionPane.showMessageDialog(null, "The sum of the two numbers is " + sum);
	}

}
