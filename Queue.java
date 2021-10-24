package sample2;

public class Queue {
	public final Mylinkedlist link = new Mylinkedlist();
    public void enqueue(Node newNode) 
    {
    link.append(newNode);
     }

	public void dequeue() 
	{
		 link.dequeue();
	}

	public void print()
	{
		 link.print();
		
	}

}
