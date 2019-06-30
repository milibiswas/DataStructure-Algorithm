package StackPackage;
import java.util.*;

public class MainClass {
	public static void main(String[] args)
	{
		InfixToPostfix obj1 = new InfixToPostfix();
		String expr = "1+2-4/2)";
		ArrayList aList = obj1.postFix(expr);
		EvaluateExpression obj2 = new EvaluateExpression();
		
		System.out.println(obj2.evaluate(aList));
		
		
	
    }
	}
