//Program to Find the Maximum Depth or Height of a Tree

import java.util.*;

import B_T.B_T5.Node;
public class B_T6 
{
	Node root;
	static class Node
	{
		Node left,right;
		int data;
		Node(int d)
		{
			data=d;
			left=right=null;
		}
	}
	int maxdepth(Node root)
	{
		if(root==null)
			return -1;
		int lheight=maxdepth(root.left);
		int rheight=maxdepth(root.right);
		
		if(lheight>rheight)
			return lheight+1;
		return rheight+1;
	}
	public static void main(String[] args) 
	{
		B_T6 tree=new B_T6();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
		System.out.println("Height of the tree is :"+tree.maxdepth(tree.root));
	}
}
