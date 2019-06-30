package Qpackage;

public class DQueue {
	private int rear;
	private int front;
	private int size;
	private int[] queue;
	
	public  DQueue(int size)
	{
		this.rear = -1;
		this.front = -1;
		this.size = size;
		this.queue =new int[this.size];
	}

	public void enqueue(int value)
	{
		if(this.rear==this.size)
			System.out.println("Queue is full");
		
		if (this.front==-1 && this.rear==-1)
		{

			this.front += 1;

		}

			this.rear += 1;
			this.queue[this.rear] = value;
		
	
	}
	
	public int dequeue()
	{
		if(this.front==-1)
		{
			System.out.println("empty");
			return -1;
		}
		
		else
		{
			int value=this.queue[this.front];
			for(int i=0;i<this.queue.length-1;i++)
			{
	
					this.queue[i] = this.queue[i+1];
					

			}
			this.queue[this.rear]=0;
			this.rear -=1;
			return value;
		}
	}
	public static void main(String[] args)
	{
		DQueue queue = new DQueue(4);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		queue.enqueue(40);
		queue.enqueue(50);

	}
}
