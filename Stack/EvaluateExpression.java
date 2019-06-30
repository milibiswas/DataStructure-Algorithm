package StackPackage;
import java.util.*;

public class EvaluateExpression {
	
	public boolean isOperand(char x) {
		
		if (x == '+'||x == '-'||x == '*'||x == '/'||x == '('||x == ')'||x == '^' )
			return false;
		return true;
	}
	
	public int evaluate(ArrayList aList)
	{
		aList.add('#');
		char item;
		char op;
		int x;
		int y;
		int t=0;
		int value;
		stackClass stack = new stackClass(20);
		for(Object c1:aList) 
		{
			item = (char)c1;
			if (item!='#')
			{

				if (isOperand(item))
				{
					stack.push(Character.digit(item,10));
				}
				else
				{
					op = item;
					y =stack.pop();
					x= stack.pop();
					if(op=='+')
						t = x + y;
					if(op=='-')
						t = x - y;
					if(op=='*')
						t = x * y;
					if(op=='/')
						t = x / y;
					if(op=='^')
						t = x ^ y;
						
					stack.push(t);
				}
				
			 }	
		  }
		value = stack.pop();
		return value;
		
	}
	
	/*public static void main(String[] args)
	{
		
		EvaluateExpression obj1 = new EvaluateExpression();
		ArrayList<Character> aList = new ArrayList<Character>();
		aList.add('1');
		aList.add('2');
		aList.add('+');
		System.out.println(obj1.evaluate(aList));
		
	}*/

}
