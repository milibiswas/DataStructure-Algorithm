package StackPackage;
import java.util.Scanner;
import java.util.*;

public class InfixToPostfix {
	
	/* 
	 *    This algorithm converts infix expression to postfix
	 *    
	 *    Input : an arithmetic expression in infix with ")" as end symbol, in stack symbol priority value, incoming symbol priority
	 *            value, 
	 *            readSymbol(X)       --->
	 *            inStackPriority(X)  --->
	 *            inComingPriority(X) --->
	 *            output(X)           --->
	 *    Output : Arithmetic expression in postfix notation
	 *    Data structure : stack 
	 * 
	 * */
    
	public char readSymbol(String expr,int index) {
		return expr.charAt(index);
	}
	
	
	public int  inStackPriority(char x) {
		
		switch(x) {
		
		case '+':
		case '-':
			return 2;
		case '*':
		case '/':
			return 4;
		case '^':
			return 5;
		case '(':
			return 0;
		case ')':
			return -1;
		default:
			return 8;
		
		}
				

	}
	
public int  inComingPriority(char x) {
		
		switch(x) {
		
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 3;
		case '^':
			return 6;
		case '(':
			return 9;
		case ')':
			return 0;
		default:
			return 7;
		
		}
				

	}
	

public boolean isOperand(char x) {
	
	if (x == '+'||x == '-'||x == '*'||x == '/'||x == '('||x == ')'||x == '^' )
		return false;
	return true;
}

public ArrayList postFix(String expr ) {
		
		/*Scanner scn = new Scanner(System.in);
		String expr = scn.next();
	InfixToPostfix obj1 = new InfixToPostfix();*/
	
	stackClass stack = new stackClass(20);
	stack.push('(');
	ArrayList<Character> aList = new ArrayList<Character>();

	for(int i=0; i<expr.length();i++) {
		
		
		char item = readSymbol(expr,i);
		char x = (char) stack.pop();
		if (isOperand(item))
		{
			
			stack.push(x);
			aList.add(item);
			
		}
		else if (item==')')
		{
			while(x !='(')
			{
				aList.add(x);
				x= (char)stack.pop();
			}
			
		}
		else if(inStackPriority(x)>=inComingPriority(item))
		{
			while(inStackPriority(x)>=inComingPriority(item))
			{
				aList.add(x);
				x = (char)stack.pop();
			}
			stack.push(x);
			stack.push(item);
			
			
		}
		else if(inStackPriority(x) <inComingPriority(item))
		{
			stack.push(x);
			stack.push(item);
			
		}
	  
		else
			System.out.println("invalid expr");

	}
	
	return aList;
	
	}
	
}
