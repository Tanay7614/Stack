package sample2;

public class Mylink {
	
	 public void makeNode() 
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
		   
		   queue.dequeue();
		   queue.print();
		 
	 }

}
