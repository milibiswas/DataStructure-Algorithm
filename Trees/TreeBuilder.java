package TreeBuilder;
import java.util.Scanner;
class BinaryTree
{
	Node root;
	class Node
	{
		int data;
		Node lLink;
		Node rLink;
		Node(int data)
		{
			this.data= data;
			this.lLink= null;
			this.rLink=null;
		}
	}
	public Node addRcursive(Node current,int value)
	{
		if (current==null)
		{
			Node node = new Node(value);
			return node;
		}
		else
		{
			if(current.data<value)
			{
				current.rLink=addRcursive(current.rLink,value);
			}
			else
			{
				current.lLink=addRcursive(current.lLink,value);

			}
		}
		return current;
	}
    public void add(int value)
    {
    	root = addRcursive(root
    			,value);
    }
    
    public Node search(Node ptr,int key)
    {

    if(ptr.data!=key)
    {
    	Node ptr1;
    	
    	if(ptr.lLink!=null)
    	{
    		ptr1=search(ptr.lLink,key);
    	}
    	else
    		return null;
    	
    	if (ptr1 != null)
    		return ptr1;
    	
    	if(ptr.rLink!=null)
    	{
    		ptr1=search(ptr.rLink,key);

    	}
    	else
    		return null;
    	
    	if (ptr1 != null)
		   return ptr1;
    	
    	return ptr1;
    	
    }
    else
    	return ptr;
    	
    }
    public Node searchParent(Node ptr,Node parent1,int item)
    {
   	Node parent = parent1;   // Parent
   	Node child = ptr;
   	Node ptr1 = child.lLink;
   	Node ptr2 = child.rLink;
   if(child.data!=item)
   {
	   
	   if(ptr1!=null)
	   {
		   parent = searchParent(ptr1,child,item);
	   }
	   else
		   return null;
	   
	   if(parent!=null)
		   return parent;
	   
	   if(ptr2!=null)
	   {
		   parent = searchParent(ptr2,child,item);
	   }
	   else
		   return null;
		return parent;
	   
    }
   else
	   return parent;
   }

}


public class TreeBuilder {
	public static void main(String args[])
	{
		BinaryTree bt = new BinaryTree();
		bt.add(6);
	    bt.add(4);
	    bt.add(8);
	    bt.add(3);
	    bt.add(5);
	    bt.add(7);
	    bt.add(9);
	    bt.add(2);
	

	    BinaryTree.Node node = bt.searchParent(bt.root,null,9);
	    if(node!=null)
	    	System.out.println(node.data);
	    else
	    	System.out.println(node);
	    	
	}
	


}
