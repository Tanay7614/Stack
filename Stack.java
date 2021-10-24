package sample2;

public class Stack {
      public void push(Node newNode) {
    	  Mylinkedlist link=new  Mylinkedlist();
    	  link.add(newNode);
        //  link. deleteLast();
    	 
      }

	public void pop() {
		 Mylinkedlist link1=new  Mylinkedlist();
		 link1.deleteLast();
		 link1.print();
	}
}
