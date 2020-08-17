package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 *https://leetcode-cn.com/problems/binary-tree-preorder-traversal/
 */
public class _114二叉树的前序遍历_ {
    List<Integer> result = new ArrayList<>();
    public List<Integer> preorderTraversal1(TreeNode root) {
        if(root != null ) {
            result.add(root.val);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
        return result;
    }
    /**
     * 迭代
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack();
        List<Integer> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode currentNode = stack.pop();
            result.add(currentNode.val);
            if(currentNode.right != null){
                stack.push(currentNode.right);
            }
            if(currentNode.left != null){
                stack.push(currentNode.left);
            }
        }
        return result;
    }

}
