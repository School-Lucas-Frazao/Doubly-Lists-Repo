/*
 * LinkedListReplicated.java, Lucas Frazao, Period 7, file will serve to test all methods in
 * LinkedIntList.java
 * 
 */

//import java.io.File;
//import java.io.IOException;


public class TestDLists
{
 
    public static void main(String s[]) 
    {
    	
		//Students create 2 LinkedIntList objects.
    	
    	Queue<Integer> one = new Queue<Integer>();
    	
    	

    	
		
      	//Test out each of your various methods (add, insert, get, indexOf, remove, size, toString)) 
      	//using either of the instantiated LinkedIntList objects
    	
    	
    	one.enqueue(1);
    	one.enqueue(2);
    	one.enqueue(3);
    	one.enqueue(4);
    	one.dequeue();
    	one.isEmpty();
    	one.sendToBack();
    	
    	System.out.println(one);
    	System.out.println(one.isEmpty());
    	
    	System.out.println(one.size());
    	
    	
    	
    	
    	

    	
    	
    	

    }
    
	//Create your LinkedIntList class in another file called "LinkedIntList"
}
