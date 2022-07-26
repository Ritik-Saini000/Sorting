
public class Queue {

	int arr[]=new int[100];
	int lim=0;
	int front,rear;
	
	Queue(){
		front=-1;
		rear=-1;
		lim=10;
	}
	Queue(int x){
		front=-1;
		rear=-1;
		lim=x;
	}
	
	void enqueue(int x) {
		if(front==-1) {
			front=0;
			rear=0;
			arr[rear]=x;
		}
		else if(rear-front==lim-1)
			System.out.println("queue overflow");
		else {
			rear++;
			arr[rear]=x;
		}
	}
	
	void dequeue() {
		if(front==rear) {
			System.out.println("queue is empty");
			rear=-1;
			front=-1;
		}
		else
			front++;
	}
	
	void view_queue(char view_type) {
		if(view_type=='h')
		{
			System.out.println("Queue in horizontal");
			for(int i=front;i<=rear;i++)
				System.out.print(arr[i]+" ");
		}
		if(view_type=='v')
		{
			System.out.println("\nQueue in vertical");
			for(int i=front;i<=rear;i++)
				System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue q=new Queue();
		
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		q.enqueue(6);
		q.enqueue(7);
		q.enqueue(8);
		q.enqueue(9);
		q.view_queue('h');
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.view_queue('v');
	}

}
