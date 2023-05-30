class Solution
{
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
    	// Your code here	
    	Node temp = head;
    	int counter =0;
    	
    	while(temp!=null){
    	    temp = temp.next;
    	    counter++;
    	}
    	if(n>counter){
    	    return -1;
    	}else
    	{
    	    
    	    while(n!=counter){
    	        head = head.next;
    	        counter--;
    	    }
    	     return head.data;
    	}
    }
}
