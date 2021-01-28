//BFS
//TC: O(N)
//SC: O(N)
//Did it run successfully on Leetcode? : Yes
class Solution {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> result = new ArrayList();
        if ( root == null)
            return result;
        Queue<TreeNode> q = new LinkedList();
        q.add(root);
        while (!q.isEmpty())
        {
            int size = q.size();
            int max = Integer.MIN_VALUE;
            for ( int i = 0; i < size; i++)
            {
                TreeNode node = q.poll();
                max = Math.max(max, node.val);
                if (node.left != null)
                    q.add(node.left);
                if(node.right!= null)
                    q.add(node.right);    
            }
            result.add(max);
        }
        return result;
    }
}
