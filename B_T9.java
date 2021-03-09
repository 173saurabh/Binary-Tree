class Solution {
    public TreeNode addOneRow(TreeNode root, int v, int d) 
    {
        if(d==1)
        {
            TreeNode node=new TreeNode(v);
            node.left=root;
            return node;
        }
        insert(root,v,d);
        return root;
    }
    public void insert(TreeNode node,int v,int d)
    {
        if(node==null)
            return;
        if(d==2)
        {
            TreeNode temp=node.left;
            node.left=new TreeNode(v);
            node.left.left=temp;
            temp=node.right;
            node.right=new TreeNode(v);
            node.right.right=temp;
        }
        else
        {
            insert(node.left,v,d-1);
            insert(node.right,v,d-1);
        }
    }
}
