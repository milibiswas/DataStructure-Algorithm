package StackPackage;

public class ReadStack {
	
	public void travarseStack(stackClass stack) {
		int[] arr;
		int index=0;
		arr = new int[10];
		while (stack.isEmpty() == 1) {
			
			arr[index] = stack.pop();
			index++;
			
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
			stack.push(arr[i]);
		}
		
		
	}

}
