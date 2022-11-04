
public class Queue <T>
{
	dNode<T> head = new dNode<T>();
	dNode<T> tail = new dNode<T>();
	
	public Queue()
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
		dNode<T> New = new dNode<T>();//makes the listnode nw
		dNode<T> temp = new dNode<T>();//sets temp to listnode new
		New.data = value;//sets the data in new equal to the parameter
		temp = head;//sets temp equal to front
		if( head == null)//if list is empty
		{
			head = New;
			tail = New;
		}
		else//if list is not empty
		{
			
			while( temp.next != null)
			{
				temp = temp.next;
			}
			
			temp.next = New;
			temp.prev = temp;
			tail = temp.next;
			//temp.next.next = temp;
		}
	}
	
	
	
	public String toString()
	{
		String x = "";//will be what is returned
		dNode<T> temp = new dNode<T>();
		temp = head;
		while(temp != tail)
		{
			x = x + temp.data + ",";
			temp = temp.next;
		}
		return x;
		
	}
	
	
}
