package interfaces_ZTS_Project2;
/**
 * This class represents a Task on a to-do list
 * @author sells
 *
 *	
 */

public class Task implements Priority, Comparable<Task>{
	private String name;
	private int priority;
	private Status status;
	//End initiate fields
/**
 * 	
 * @param name
 */
	public Task(String name) 	{
		this.name = name;
}//end preferred constructor  
/**
 * 	
 * @return
 */
	public String getName() {
		return name;
	}//end getName
/**
 * 
 * @param name
 */
	public void setName(String name) {
		this.name = name;
	}//end setName
/**
 * 
 * @return
 */
	public Status getStatus() {
		return status;
	}//end getStatus
/**
 * 
 * @param status
 */
	public void setStatus(Status status) {
		this.status = status;
	}//end setStatus 
/**
 * 	
 */
	@Override
	public int getPriority() {
		return priority;
	}//end getPriority
/**
 * 
 */
	@Override
	public void setPriority(int priority) {
		this.priority = priority;
	}//end setPriority
/**
 * 	
 */
	@Override
	public String toString() {
		return "Task [name=" + name + ", priorty=" + priority + ", status=" + status + "]";
	}//end toString 
/**
 * 	
 */
	@Override
	public int compareTo(Task op2) {
		// TODO Auto-generated method stub
		if(this.priority == op2.priority) {
		return 0;
		}//returns a 0 when comparing two matching priorities 
		return -1;
		//returns a -1 when comparing two non-matching priorities 
	}//end compareTo
}