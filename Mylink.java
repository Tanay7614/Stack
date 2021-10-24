package sample2;

public class Mylink {
	
	 public void makeNodeForQueue() 
	 {
		  // Create a Node
		   Node first=new Node(30);
		   Node second=new Node(56);
		   Node third=new Node(70);
		  
		   Queue queue=new Queue();
		 
		   // Add Node in Queue
		   
		   queue.enqueue(first);
		   queue.enqueue(second);
		   queue.enqueue(third);
		   
		   // Delete element
		   queue.dequeue();
		   queue.print();
		 
	 }
	 
	 public void makeNodeForStack() 
	 {
		  // Create a Node
		   Node first=new Node(30);
		   Node second=new Node(56);
		   Node third=new Node(70);
		  
		   Stack stack =new Stack();
		 
		   // Add Node in stack
		   
		   stack.push(first);
		   stack.push(second);
		   stack.push(third);
		  
		   // delete element
		   stack.pop();
		   
	       stack.print();
		 
	 }

}
