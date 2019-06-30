package StackPackage;

public class stackClass {
	
	private int top;
	private int size;
	private int[] stack;
	
	public stackClass(int size) {
		this.size = size;
		this.top=-1;
		this.stack = new int[this.size];
		
	}
	
	
	public void push(int val) {
		if (this.top<size-1) {
			this.top +=1;
			stack[this.top]= val;
			
		}
		else
			System.out.println("stack is full");
		
	}
	public int pop() {
		int retVal;
		if (this.top >= 0) {
		    retVal=stack[this.top];
		    this.top -= 1;
		    return retVal;
		}
		else
		{
		 System.out.println("stack is empty");
		return -1;
		}
	}
	
	public int isEmpty(){
		if(this.top==0)
			return 0;
		else
			return 1;
	}
	public int read(){
		int val = pop();
		push(val);
		return val;
	}
	
}
