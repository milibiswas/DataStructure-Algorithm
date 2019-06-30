package StackPackage;

public class MultipleStack {
	
	private int topX;
	private int topY;
	private int size;
	private int[] mStack;
	
	public MultipleStack(int size ) {
		this.topX=0;
		this.topY= size-1;
		this.size = size;
		mStack = new int[this.size];
	}
	public void pushX(int val) {
		if(this.topX <= this.topY)
		{
			mStack[this.topX] = val;
			this.topX +=1;
		}
		else
			System.out.println("Stack is full");
		
	}
	public void pushY(int val) {
		if (this.topX <= this.topY)
		{	
			mStack[this.topY]=val;
			this.topY -=1;

		}
		else
			System.out.println("stack is full");
		
	}
	public int popX() {
		if (this.topX>=0)
		{
			int retVal = mStack[this.topX-1];
		    return retVal;
		}
		else
		{
			System.out.println("stack is empty");
			return -1;
		}
		
	}
	public int popY() {
		if(topY<=this.size)
		{
			int retVal = mStack[topY+1];
			return retVal;
		}
		else
		{
			System.out.println("stack is mppty");
			return -1;
			
		}

		
		
	}
	

}
