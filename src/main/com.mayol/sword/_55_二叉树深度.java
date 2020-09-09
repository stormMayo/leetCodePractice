
package sword;

import java.util.LinkedList;
import java.util.Queue;

/**
 * https://leetcode-cn.com/problems/er-cha-shu-de-shen-du-lcof/
 */
public class _55_二叉树深度 {
    public int maxDepth(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null){
            return 0;
        }
        queue.offer(root);
        int depth = 0;
        int count = 1;
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            count--;
            if(node.left != null){
                queue.offer(node.left);
            }
            if(node.right != null){
                queue.offer(node.right);
            }
            if(count ==0){
                count = queue.size();
                depth++;
            }
        }
        return depth;
    }
    
}
