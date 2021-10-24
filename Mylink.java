package sample2;

public class Mylink {
	
	 public void makeNode() {
		  
		   Node first=new Node(30);
		   Node second=new Node(56);
		   Node third=new Node(70);
		   Stack list=new Stack();
		   list.push(first);
		   list.push(second);
		   list.push(third);
		   Mylinkedlist link1=new  Mylinkedlist();
		   link1.print();
		   
	  }

}
