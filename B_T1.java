package B_T;
//Tree Traversal (Inorder,Preorder & Postorder)
import java.util.*;
class Node
{
	Node left,right;
	int data;
	Node(int item)
	{
		data=item;
		left=right=null;
	}
}
public class B_T1
{
	Node root;
	void printPreorder(Node node)
	{
		if(node==null)
			return;
		System.out.print(node.data+" ");
		printPreorder(node.left);
		printPreorder(node.right);
	}
	void printInorder(Node node)
	{
		if(node==null)
			return;
		printInorder(node.left);
		System.out.print(node.data+" ");
		printInorder(node.right);
	}
	void printPostorder(Node node)
	{
		if(node==null)
			return;
		printPostorder(node.left);
		printPostorder(node.right);
		System.out.print(node.data+" ");
	}
	public static void main(String[] args) 
	{
		B_T1 tree=new B_T1();
		
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
		
		System.out.println("Preorder Traversal of Binary Tree is:");
		tree.printPreorder(tree.root);
		
		System.out.println("\nInorder Traversal of Binary Tree is:");
		tree.printInorder(tree.root);
		
		System.out.println("\nPostorder Traversal of Binary Tree is:");
		tree.printPostorder(tree.root);
	}
}
