//Lucas Frazao, Period 7, Queue file, Meant to manipulate doubly list nodes
public class Queue <T>
{
	dNode<T> head = new dNode<T>();//creates the two reference nodes
	dNode<T> tail = new dNode<T>();
	
	public Queue()//consructors
	{
		head = null;
		tail = null;
	}
	
	public Queue(T t)
	{
		head = new dNode<T>(t);
		tail = head;
	}
		
	
	public void enqueue(T value)
	{
		dNode<T> Value = new dNode<T>();
		dNode<T> temp = new dNode<T>();
		temp = head;
		Value.data = value;
		
		if(head == null)
		{
			head = Value;
			tail = Value;
		}
		else
		{
		
			while(temp != tail )
			{
				temp = temp.next;
			}
			
			temp.next = Value;
			tail = Value;
		}
		
	}
	
	public T dequeue()//method to remove first node
	{
		
		T t = null;//any info var
	
		
		if (head == null)//what happens when head is null
		{
			return null;
		}
		if(head == tail)
		{
			t = head.data;
			head = null;
			tail = head;
		}
		else
		{
			t = head.data;
			head = head.next;
			tail.next = head;
			head.prev = head;
		}
		return t;
	}
	
	public boolean isEmpty()//simple code to check if code empty
	{
		if(head == null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void sendToBack()
	{
		
		dNode<T> temp = new dNode<T>();
		temp = head;
		while(temp != tail)
		{
			temp = temp.next;
		}
		
		temp.next.prev = tail;
		head = head.next;
		
		 
	}
	
	public int size()
	{
		int count = 0;//counts the size
		dNode<T> temp = new dNode<T>();
		temp = head;
		
		if(head == null)
		{
			count = -1;
		}
		else
		{
			while(temp != tail)
			{
				count ++;
				temp = temp.next;
			}
		}
		
		return count+1;//compensates for code not reaching tail
	}
	
	public String toString()
	{
		String x = "";//var that will be returned
		dNode<T> temp = new dNode<T>();
		temp = head;
		
		while(temp != tail)
		{
			x = x + temp.data + "|";
			temp = temp.next;
		}
		if (temp == tail && temp != null)
		{
			x = x + temp.data;
		}
		
		return x;
	}
	

	
	
}
