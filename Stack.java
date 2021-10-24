package sample2;

public class Stack {
	public final Mylinkedlist link = new Mylinkedlist();
    public void push(Node newNode) {
    link.add(newNode);
      }

	public void pop() 
	{
		 link.pop();
	}

	public void print()
	{
		 link.print();
		
	}

	public int  peak() 
	{
		int value=link.peak();
		return value;
	}
 }