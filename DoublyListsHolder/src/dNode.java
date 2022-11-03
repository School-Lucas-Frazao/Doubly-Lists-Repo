public class dNode<T> {

     T data;
    dNode<T> next;
    dNode<T> prev;

    public dNode()
    {
    	data = null;
    	next = null;
    	prev = null;
    }
    
    public dNode(T data)
    {
    	this.data = data;
    	next = null;
    	prev = null;
    }
 
    public dNode(T data, dNode<T> next, dNode<T> prev)
    {
    	this.data = data;
    	this.next = next;
    	this.next = next;
    }  
}