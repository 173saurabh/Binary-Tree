package B_T;
//Level Order Binary Tree Traversal(Breadth First Traversal)
import java.util.*;
public class B_T2 
{
	Node root;
	static class Node
	{
		Node left,right;
		int data;
		Node(int d)
		{
			left=null;
			right=null;
			data=d;
		}
	}
	void printLevelOrder()
	{
		int h=height(root);
		for(int i=1;i<=h;i++)
			printGivenLevel(root,i);
	}
	int height(Node root)
	{
		if(root==null)
			return 0;
		int lheight=height(root.left);
		int rheight=height(root.right);
		if(lheight<rheight)
			return rheight+1;
		return lheight+1;
	}
	void printGivenLevel(Node root,int level)
	{
		if(root==null)
			return;
		if(level==1)
			System.out.print(root.data+" ");
		else if(level>1)
		{
			printGivenLevel(root.left,level-1);
			printGivenLevel(root.right,level-1);
		}
	}
	public static void main(String[] args) 
	{
		B_T2 tree=new B_T2();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
		System.out.println("Level Order Traversal of Binary Tree is:");
		tree.printLevelOrder();
	}
}
