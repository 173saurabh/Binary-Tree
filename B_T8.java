class Solution {
    public List<Double> averageOfLevels(TreeNode root) 
    {
        List<Double> avg=new ArrayList<>();
        int h=height(root);
        for(int i=0;i<=h;i++)
        {
            int width=width(root,i);
            long total=TotalGivenLevel(root,i);
            Double x = new Double(total);
            avg.add(x/width);
        }
        return avg;
    }
    long TotalGivenLevel(TreeNode root,int level)
    {
        long total=0,ltotal=0,rtotal=0;
        if(root==null)
            return total;
        if(level==0)
        {
            return total+root.val;
        }
        else if(level>0)
        {
            ltotal=TotalGivenLevel(root.left,level-1);
            rtotal=TotalGivenLevel(root.right,level-1);
        }
        total=ltotal+rtotal;
        return total;
    }
    int width(TreeNode root,int level)
    {
        if(root==null)
            return 0;
        if(level==0)
            return 1;
        else if(level>0)
            return width(root.left,level-1)+width(root.right,level-1);
        return 0;
    }
    int height(TreeNode root)
    {
        if(root==null)
            return -1;
        int lh=height(root.left);
        int rh=height(root.right);
        
        if(lh>rh)
            return lh+1;
        return rh+1;
    }
}
