/**
 * This class tests the methods contained in "RationalNumber" 
 * @author sells
 * @version 0.1
 *	module 2 Lab 
 */

public class Application {
/**
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//create new rational number 
		RationalNumber r1 = new RationalNumber(40,75);		
//create a new rational number that falls inside the .0001 tolerance 
		RationalNumber r2 = new RationalNumber(2667,5000);
//create a new rational number that falls outside the .0001 tolerance
		RationalNumber r3 = new RationalNumber(267,500);
//converts three rationalNumber objects to floats	
		System.out.println(r1.Convert());
		System.out.println(r2.Convert());
		System.out.println(r3.Convert());
		
//will return a 0 because r1 and r2 are equal based on our tolerance guideline  
		System.out.println(r1.compareTo(r2));
//will return a -1 because r1 and r2 are not equal based on our tolerance guidelines
		System.out.println(r1.compareTo(r3));
	}

}
