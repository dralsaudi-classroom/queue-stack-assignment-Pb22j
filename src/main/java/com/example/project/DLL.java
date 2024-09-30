package com.example.project;

public class DLL<T> {
	private DLLNode<T> head;
	private DLLNode<T> current;

    public DLL() {
        head = current = null;
    }
    public boolean empty() {
        return head == null;
    }
    public boolean last() {
        return current.next == null;
    }
    public boolean first() {
        return current.previous == null;
    }
    public boolean full() {
        return false;
    }
    public void findFirst() {
        current = head;
    }
    public void findNext() {
        current = current.next;
    }
    public void findPrevious() {
        current = current.previous;
    }
    public T retrieve() {
        return current.data;
    }
    public void update(T val) {
        current.data = val;
    }
    public void insert(T val) {
        DLLNode<T> tmp = new DLLNode<T>(val);
        if(empty()) {
            current = head = tmp;
        }
        else {
            tmp.next = current.next;
            tmp.previous = current;
            if(current.next != null)
                current.next.previous = tmp;
            current.next = tmp;
            current = tmp;
        }
    }
    public void remove() {
        if(current == head) {
            head = head.next;
            if(head != null)
               head.previous = null;
        }
        else {
            current.previous.next = current.next;
            if(current.next != null)
               current.next.previous = current.previous;
        }
        if(current.next == null)
            current = head;
        else
            current = current.next;
    }
    public void removeBetween(T e1, T e2) {
     //   throw new UnsupportedOperationException("Not supported yet.");
        // throw new UnsupportedOperationException("Not supported yet.");
        // Write the method removeBetween, member of the class DoubleLinkedList. The method
        // takes two elements e1 and e2, and removes all the elements between the two elements
        // (e1 and e2 not included). If e1 or e2 or both doesn’t exist, no element will be removed. You can assume the elements to be unique, e1 comes before e2, and that
        // e1 ̸= e2. Current is moved to head if the removal is successful. Do not call any
        // methods and do not use any auxiliary data structures. The method signature
        // is: public void removeBetween(T e1, T e2).
        // Example 3.1. Given the list: A ↔ B ↔ C ↔ D ↔ E ↔ F, removeBetween(’B’,
        // ’E’) results in: A ↔ B ↔ E ↔ F.
    	DLLNode<T> tmp1=head;
    	DLLNode<T> tmp2=head;
    	
    	boolean found1=false;
    	boolean notFound1=true;
    	boolean found2=false;
    	boolean notFound2=true;
    	int counter1=0;
    	int counter2=0;
    	while(!found1&&notFound1) {
    		if(tmp1.data ==e1) {
           		
           		found1=true;
           		notFound1=false;
           		
           	  	  }
           	   
    		else if(tmp1.next!=null) {		
       		 tmp1=tmp1.next;
       		counter1++;
       	 if(tmp1.data ==e1) {
       		
       		found1=true;
       		notFound1=false;
       	  	  }
       	   }
       	 else if(tmp1.next==null) {
       		 notFound1=true;
       		 found1=true;
       	    }
           }
    	/*
        while(tmp1.data !=e1) {
        	tmp1=tmp1.next;
         }
         */
        while(!found2&&notFound2) {
        	
        	if(tmp2.data ==e2) {	
           		found2=true;
           		notFound2=false;
           		//counter2--;
           	  	  }
        	else if(tmp2.next!=null) {		
        		 tmp2=tmp2.next;
        		 counter2++;
        	 if(tmp2.data ==e2) {
        		
        		found2=true;
        		notFound2=false;
        	  	  }
        	   }
        	 else if(tmp2.next==null) {
        		 notFound2=true;
        		 found2=true;
        	    }
            }
    	
    	System.out.println(tmp1.data +""+ tmp2.data);
    	System.out.println(counter1 +"   "+ counter2);
        if(found1==true&&notFound1==true)
        	found1=false;
        if(found2==true&&notFound2==true)
        	found2=false;
        if(found1&&found2) {
        	if(counter1<counter2) {
        	
        while(tmp1.next!=tmp2) {
        	tmp1.next.next.previous=tmp1;
        	tmp1.next=tmp1.next.next;
        }
        tmp2.previous=tmp1;
        current=head;
        }
        	else if(counter1>counter2) {
        		while(tmp2.next!=tmp1) {
                	tmp2.next.next.previous=tmp2;
                	tmp2.next=tmp2.next.next;
                }
                tmp1.previous=tmp2;
                current=head;
        		
        	}
        }
        
        else {
        	
     	
        }
       
    }
}