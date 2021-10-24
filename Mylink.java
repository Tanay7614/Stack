package sample2;

public class Mylink {
	
	 public void makeNode() 
	 {
		  
		   Node first=new Node(30);
		   Node second=new Node(56);
		   Node third=new Node(70);
		   Stack stack=new Stack();
		   stack.push(first);
		   stack.push(second);
		   stack.push(third);
		   int value= stack.peak();
		   stack.pop();
		   stack.print();
		 
	 }

}
