package interfaces_ZTS_Project2;
/**
 * This class test the code written in Classes "Priority, Process, Status, Task"
 * @author sells
 * @version 0.1
 * Module 2 Project Problem 2
 * 8/05/2022
 */
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
// Created four new task objects, gave them names, set priorities and Statuses, and printed out a toString() for each  	
		Task t1 = new Task("(1)Learn to code");
		t1.setPriority(Priority.MAX_PRIORITY);
		t1.setStatus(Status.IN_PROCESS);
		System.out.println(t1.toString());
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		Task t2 = new Task ("(2)Apply to financial aid");
		t2.setPriority(Priority.MED_PRIORITY);
		t2.setStatus(Status.NOT_STARTED);
		System.out.println(t2.toString());
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	
		Task t3 = new Task ("(3)Graduate form undergrad the first time");
		t3.setPriority(Priority.MIN_PRIORITY);
		t3.setStatus(Status.COMPLETE);
		System.out.println(t3.toString());
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------");		
		
		Task t4 = new Task("(4)Find a job in the tech industry");
		t4.setPriority(Priority.MAX_PRIORITY);
		t4.setStatus(Status.IN_PROCESS);
		System.out.println(t4.toString());
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
//Compares the first task to the second. The two tasks have different set priorities so it returns a "-1"		
		System.out.println(t1.compareTo(t2) + " Priority does not match");
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
//Compares the first task to the fourth. The two tasks have the same set priorities so it returns a "0"		
		System.out.println(t1.compareTo(t4) + " Priority does match");
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		

	
//// Created four new Process objects, gave them IDs, set priorities, and printed out a toString() for each  		
		Process p1 = new Process("(0001)Locate disk");
		p1.setPriority(Priority.MAX_PRIORITY);
		System.out.println(p1.toString());
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------");		
		
		Process p2 = new Process("(0002)Open file");
		p2.setPriority(Priority.MED_PRIORITY);
		System.out.println(p2.toString());
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		Process p3 = new Process("(0003)Delelte file");
		p3.setPriority(Priority.MIN_PRIORITY);
		System.out.println(p3.toString());
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		Process p4 = new Process("(0004)Create new file");
		p4.setPriority(Priority.MIN_PRIORITY);
		System.out.println(p4.toString());
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
//Compares the first process to the third. The two processes have different set priorities so it returns a "-1"			
		System.out.println(p1.compareTo(p3) + " Priority does not match");
//Compares the third process to the fourth. The two processes have the same set priorities so it returns a "0"			
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println(p3.compareTo(p4) + " Priority does match");
	}

}
