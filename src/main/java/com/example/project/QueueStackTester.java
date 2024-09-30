package com.example.project;

public class QueueStackTester {
    public static <T> void split(Queue<T> q, Queue<T> oq, Queue<T> eq)
    {
     //  throw new UnsupportedOperationException("Not supported yet.");
        // Write the recursive static method split that splits a queue of n elements into two
        // queues. The elements with odd orders (i.e. 1st, 3rd, 5th ...) should be put in the
        // first queue and elements with even orders (i.e. 2nd, 4th, 6th ...) should be put in
        // the second queue. The original queue should remain unchanged at the end of the
        // method.
        // Example. Given the queue (A, B, C, D, E,F), split results in oq (A, C, E), and eq(B, D).
    	
    	int size=q.length();
    	if(size%2!=0) {
    	for(int i=0;i<q.length();i++) {
    		if(size%2==0) {
    			T tmp=q.serve();
    			eq.enqueue(tmp);
    			q.enqueue(tmp);
    			//System.out.println(tmp);
    		}
    		else {
    			T tmp=q.serve();
    			oq.enqueue(tmp);
    			q.enqueue(tmp);
    		//	System.out.println(tmp);
    		}
    		size--;
    		
    	}
    	}
    	else {
    		for(int i=0;i<q.length();i++) {
        		if(size%2==0) {
        			T tmp=q.serve();
        			oq.enqueue(tmp);
        			q.enqueue(tmp);
        			//System.out.println(tmp);
        		}
        		else {
        			T tmp=q.serve();
        			eq.enqueue(tmp);
        			q.enqueue(tmp);
        		//	System.out.println(tmp);
        		}
        		size--;
        		
        	}
    		
    		
    		
    		
    	}
    }
    	
    	
    	
    	
    	
    
    public static <T> void remove(LinkedPQ<T> pq, int p)
    {
       // throw new UnsupportedOperationException("Not supported yet.");
        // Write a static method remove that removes every element in the priority queue
        // having priority less than p.
        // Example. Given pq: [A, 10], [D, 8], [B, 5], [E, 3], [C, 2] remove(pq, 5) results in
        // pq: [A, 10], [D, 8], [B, 5].
    	
    	if(pq.length()==0) {
    		return;
    	}
    	PQElement<T> tmp = null;
    	LinkedPQ<T> tmpL=new LinkedPQ<T>();
    	int size=pq.length();
    	for(int i=0;i<size;i++) {
    		tmp=pq.serve();
    		if(tmp.p>=p) {
    			tmpL.enqueue(tmp.data, tmp.p);
    			
    		}
    		else {
    			
    		}
    		
    	}
    	size=tmpL.length();
    	for(int i=0;i<size;i++) {
    		tmp=tmpL.serve();
    		pq.enqueue(tmp.data, tmp.p);
    	}
    	
    	
    	
    	
    	
    }
    public static <T> boolean search(Stack<T> st, T e)
    {
       // throw new UnsupportedOperationException("Not supported yet.");
        // Write the recursive static method search that searches for an element e in a stack st
        // and returns true if it’s found or false otherwise. st should not change at the end of
        // the method. You are not allowed to use any auxiliary data structures.
        // Example. Given the stack st (top-to-bottom): 5, 7, 5, 3, 2. search(st, 3) returns
        // true while search(st, 1) returns false.
        
        if(st.empty())
        	return false;
    	T tmp = null;
        while(!st.empty()) {
        	tmp=st.pop();
        	if(tmp==e) {
        		st.push(tmp);
        		return true;
        	} 	
        }
        st.push(tmp);
        
        
        
        return false;
    }
}