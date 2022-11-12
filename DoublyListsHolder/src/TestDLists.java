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
    	
    	/*
    	one.enqueue(1);
    	one.enqueue(2);
    	one.enqueue(3);
    	System.out.println(one);
    	System.out.println("Size of list: " + one.size());
    	System.out.println(one.dequeue());
    	System.out.println(one.dequeue());
    	System.out.println(one.dequeue());
    	System.out.println(one.dequeue());
    	System.out.println(one);
    	System.out.println(one.isEmpty());
    	*/
    	
    	one.enqueue(1);
    	one.enqueue(2);
    	System.out.println(one.size());
    	one.dequeue();
    	one.dequeue();
    	System.out.println("one is:" + one);
    	System.out.println(one.size());
    	System.out.println(one.isEmpty());
    	one.enqueue(1);
    	System.out.println(one.isEmpty());
    	System.out.println("size is " + one.size());
    	one.enqueue(2);
    	one.enqueue(3);
    	System.out.println("size is " + one.size());
    	System.out.println("one is: " + one);
    	one.sendToBack();
    	System.out.println("one is: " + one);
    }
    
	//Create your LinkedIntList class in another file called "LinkedIntList"
}
