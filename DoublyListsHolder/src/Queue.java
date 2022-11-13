//Lucas Frazao, Period 7, Queue file, Meant to manipulate doubly list nodes
public class Queue <T>
{
	dNode<T> head = new dNode<T>();//creates the two reference nodes
	dNode<T> tail = new dNode<T>();
	private int capacity = 0;
	
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
	
	public Queue(T t, int cap)
	{
		head = new dNode<T>(t);
		tail = head;
		capacity = cap;
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
		
	
	public void enqueue(T value)
	{
		dNode<T> Value = new dNode<T>();
		dNode<T> temp = new dNode<T>();
		temp = head;
		Value.data = value;
		
		if( capacity == size())
		{
			throw new IllegalStateException();
		}
		
	
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
	
	public int Capacity()
	{
		return capacity;
	}
	
	public void changeCapacity(int value)
	{
		capacity = value;
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
		
		tail.next = head;
		head.prev = tail;
		tail = head;
		head = head.next;
		
		
		 
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
