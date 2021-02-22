package B_T;
import java.util.*;
//Diameter of a Binary Tree.
public class B_T3
{
	Node root;
	static class Node
	{
		int data;
		Node left,right;
		Node(int d)
		{
			data=d;
			left=right=null;
		}
	}
	int diameter(Node root)
	{
		if(root==null)
			return 0;
		int rheight=height(root.right);
		int lheight=height(root.left);
		
		int ldiameter=diameter(root.left);
		int rdiameter=diameter(root.right);
		
		return Math.max(1+lheight+rheight,Math.max(ldiameter, rdiameter));
	}
	int height(Node root)
	{
		if(root==null)
			return 0;
		return 1+Math.max(height(root.left),height(root.right));
		
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		B_T3 tree=new B_T3();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
		System.out.println("The diameter of the tree is:"+tree.diameter(tree.root));
	}

}
