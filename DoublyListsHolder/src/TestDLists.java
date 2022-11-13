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
    	
		//Creates a queue object
    	
    	Queue<Integer> one = new Queue<Integer>();
    	Queue<Integer> two = new Queue<Integer>(1, 3);
    	
    	//tests out enqueue and toString
    	
    	System.out.println("Tests out enqueue and the toString");
    	
    	one.enqueue(1);
    	one.enqueue(2);
    	one.enqueue(3);
    	System.out.println(one);
    	System.out.println();
    	
    	//tests out the dequeue method
    	
    	System.out.println("Tests out the dequeue method");
    	System.out.println();
    	
    	System.out.println("Removed the first value: " + one.dequeue());
    	System.out.println("This is the new list: " + one);
    	System.out.println("Removed the first value: " + one.dequeue());
    	System.out.println("This is the new list: " + one);
    	System.out.println("Removed the first value: " + one.dequeue());
    	System.out.println("This is the new list: " + one);
    	System.out.println("Removed the first value: " + one.dequeue());
    	System.out.println("This is the new list: " + one);
    	
    	
    	//tests out isEmpty
    	
    	System.out.println();
    	System.out.println("tests out isEmpty");
    	
    	System.out.println();
    	System.out.println("The list is:" + one);
    	System.out.println("The list is empty: " + one.isEmpty());
    	one.enqueue(1);
    	one.enqueue(2);
    	one.enqueue(3);
    	System.out.println("The list is:" + one);
    	System.out.println("The list is empty: " + one.isEmpty());
    	System.out.println();
    	
    	//tests out sendToBack
    	
    	System.out.println("tests out sendToBack method");
    	System.out.println();
    	
    	System.out.println("The list is: " + one);
    	one.sendToBack();
    	System.out.println("The list now is: " + one);
    	one.sendToBack();
    	System.out.println("The list now is: " + one);
    	one.dequeue();
    	one.dequeue();
    	one.dequeue();
    	System.out.println(one);
    	one.sendToBack();//is list is null
    	System.out.println();
    	
    	//test out the size method
    	
    	System.out.println("tests out size method");
    	System.out.println();
    	
    	System.out.println("The list is: " + one);
    	System.out.println("The size of the list is: " + one.size());
    	one.enqueue(1);
    	one.enqueue(2);
    	one.enqueue(3);
    	System.out.println("The list is: " + one);
    	System.out.println("The size of the list is: " + one.size());
    	System.out.println();
    	
    	//tests out the capacity method
    	
    	System.out.println("tests out capacity method");
    	System.out.println();
    	
    	System.out.println("The list is:" + two);
    	System.out.println("The capacity for two is: " + two.Capacity());
    	two.changeCapacity(4);
    	System.out.println("The capacity for two is: " + two.Capacity());
    	System.out.println("The size is:" + two.size());
    	System.out.println("The list is:" + two);
    	two.enqueue(2);
    	two.enqueue(3);
    	two.enqueue(4);
    	
    	System.out.println(two);
    	
    	
    	
    }
    

}
