//Maximum width of a binary tree.
import java.util.*;
public class B_T7 
{
	Node root;
	static class Node
	{
		int data;
		Node left,right;
		Node(int d)
		{
			data=d;
			right=left=null;
		}
	}
	int getMaxWidth(Node root)
	{
		int maxWidth=0,width,i;
		int h=height(root);
		for(i=1;i<=h;i++)
		{
			width=getWidth(root,i);
			if(width>maxWidth)
				maxWidth=width;
		}
		return maxWidth;
	}
	int getWidth(Node root,int level)
	{
		if(root==null)
			return 0;
		if(level==1)
			return 1;
		else if(level>1)
			return getWidth(root.right,level-1) + getWidth(root.left,level-1);
		return 0;
			
			
	}
	int height(Node root)
	{
		if(root==null)
			return 0;
		int lheight=height(root.left);
		int rheight=height(root.right);
		
		if(lheight>rheight)
			return lheight+1;
		return rheight+1;
	}
	public static void main(String[] args) 
	{
		B_T7 tree=new B_T7();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
		tree.root.right.right=new Node(8);
		tree.root.right.right.right=new Node(7);
		tree.root.right.right.left=new Node(6);
		System.out.println("The maximum width is :"+tree.getMaxWidth(tree.root));
	}
}
