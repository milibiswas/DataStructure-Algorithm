package Qpackage;

public class QueueClass {
	private int rear;
	private int front;
	private int size;
	private int[] queue;
	
	public  QueueClass(int size)
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
		if(this.front==-1 && this.rear==-1)
		{
			System.out.println("Queue is empty");
			return -1;
		}
		  
		else
		{
			
			int value = this.queue[this.front];
			this.queue[this.front] = 0;
			if(this.front == this.rear)
			{
				this.front = -1;
				this.rear = -1;
			}
			else
				this.front +=1;
			return value;
		}
	}
	
	public static void main(String[] args)
	{
		QueueClass queue = new QueueClass(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		System.out.println(queue.dequeue());
		System.out.println(queue.front);
		System.out.println(queue.rear);
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.front);
		System.out.println(queue.rear);
	}
	
}
