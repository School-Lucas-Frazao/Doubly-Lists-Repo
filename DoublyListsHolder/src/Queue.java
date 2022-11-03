
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
	
	
}
