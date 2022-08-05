package interfaces_ZTS_Project2;
/**
 * This class contains an interface containing priority constants and methods
 * @author sells
 *
 */
public interface Priority { 
	public static final int MED_PRIORITY = 5;
	public static final int MIN_PRIORITY = 1;
	public static final int MAX_PRIORITY = 10;
	//initiates constants fields
/**
 * 	
 * @param priority
 */
	public void setPriority (int priority);
	public int getPriority ();
}//end setPriority and getPriority
