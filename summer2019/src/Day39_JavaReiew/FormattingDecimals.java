package Day39_JavaReiew;

import java.text.DecimalFormat;

public class FormattingDecimals {
	
	public static void main(String[] args) {
		
	DecimalFormat format = new DecimalFormat("0.00");	
	
	double b = 23.1234848373;
	
	// format(double): format to decimal and retu the string value
	
	String num1 = format.format(b);
	
	System.out.println(num1);
	
	double c = 45.56789;
	
	System.out.println(format.format(c)); //45.57
	
	c = Double.parseDouble (format.format(c));
	
	System.out.println(c+1);
		
		
		
		
		
		
	}

}
