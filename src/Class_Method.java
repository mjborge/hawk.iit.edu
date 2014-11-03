import javax.swing.JOptionPane;

public class Class_Method {
	
	
	public static void main(String[]args)
	{
		double a=0;
		double b=0;
		double sum=0;
		
		JOptionPane.showMessageDialog(null, 
				  "This program asks the user for two numbers and displays their sum",
				  "Welcome", JOptionPane.PLAIN_MESSAGE );
		
		a= input_numbers();
		b= input_numbers();
		
		sum=a+b;
		JOptionPane.showMessageDialog(null, "The sum of the two numbers is " + sum);
	}
	
	
	public static double input_numbers()
	{
		double a=0;
	    String x = JOptionPane.showInputDialog("Please enter your number: \n");
	    try{
	     	a=Double.parseDouble(x);
	    	}
	    catch(Exception e) {
	    	JOptionPane.showMessageDialog(null,"You didn't enter a digit as input.  Please enter a number next time");
	    	System.exit(0);
	    	}
	    return a;
	    
	}
	
	
	
}
