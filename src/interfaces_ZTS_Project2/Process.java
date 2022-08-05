package interfaces_ZTS_Project2;
/**
 * This class represents process on a task manager 
 * @author sells
 *
 */
public class Process implements Priority, Comparable<Process>{
	private final String processID;
	private int priority;
	//initiates fields 
/**
 * 	
 * @param processID
 */
	public Process(String processID) {
		this.processID = processID;	
	}//end preferred constructor 
/**
 * 	
 * @return
 */
	public String getProcessID() {
		return processID;
	}//end getProcess
/**
 * 	
 */
	@Override
	public void setPriority(int priority) {
		// TODO Auto-generated method stub
		this.priority = priority;
	}//end setPriority
/**
 * 
 */
	@Override
	public int getPriority() {
		// TODO Auto-generated method stub
		return priority;
	}//end getPriority
/**
 * 	
 */
	@Override
	public String toString() {
		return "Process [processID=" + processID + ", priority=" + priority + "]";
	}//end toString
/**
 * 
 */
	@Override
	public int compareTo(Process op2) {
		// TODO Auto-generated method stub
			if(this.priority == op2.priority) {
			return 0;
			}//returns a 0 when comparing two matching priorities 
			return -1;
			//returns a -1 when comparing two non-matching priorities
	}//end compareTo
}

