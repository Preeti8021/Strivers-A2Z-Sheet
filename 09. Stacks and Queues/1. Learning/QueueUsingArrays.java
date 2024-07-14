public class QueueUsingArrays {

  int front, rear;
	int arr[] = new int[100005];

    MyQueue()
	{
		front=0;
		rear=0;
	}
	
	//Function to push an element x in a queue.
	void push(int x)
	{
	    if(rear == arr.length){
	        throw new RuntimeException();
	    }
	    arr[rear++] = x; 
	} 

    //Function to pop an element from queue and return that element.
	int pop()
	{
	    if(front==rear){
	        return -1;
	    }
	    int x = -1;
        x = arr[front];
	    front++;
	    
		return x; 
	} 
}
