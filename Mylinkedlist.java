package sample2;

     public class Mylinkedlist {
     Node head;
     Node tail;
	
    public Mylinkedlist()
    {
	    this.head = head;
		this.tail=tail;
	}
    
    public void add(Node newNode)
    {
		 if(head==null && tail==null) 
		 {
			head=newNode;
			tail=newNode;
			
	     }
	  else {
	    	Node temp = head;
	    	head=newNode;
	    	head.next=temp;
	    	 
	     } 
    }
   
     
     public void append(Node newNode) 
     {
    	 if(head==null && tail==null) 
    	 {
			   head=newNode;
			   tail=newNode;
			   
		 }
	    
	     else
	     {
	    	
	    	 Node temp=newNode;
	    	 tail.next=newNode;
	    	 tail=temp;
	    }
    }
    
     public void dequeue()
     {
 		Node node=	head;
 		head=node.next;
 		
 	 }
     
     public void pop()
     {
 		Node node=	head;
 		head=node.next;
 		
 	 }
     
     public int peak() 
     {
 		
 		return head.data;
 		
 	 }
    
     public void print()
      {
    	Node node=head;
		while(node.next!=null)
		{
			System.out.println(node.data);
			node=node.next;
		}
		 System.out.println(node.data);
			
	  }
	

 }
     

