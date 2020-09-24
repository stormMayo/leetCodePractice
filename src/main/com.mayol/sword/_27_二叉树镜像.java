package sword;

/**
 * https://leetcode-cn.com/problems/er-cha-shu-de-jing-xiang-lcof/
 *
 */
public class _27_二叉树镜像 {
    public TreeNode mirrorTree(TreeNode root) {
        if(root == null){
            return null;
        }
        TreeNode tempNode = root.left;
        root.left = mirrorTree(root.right);
        root.right = mirrorTree(tempNode);
        return root;
    }
}
