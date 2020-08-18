/**
 * @class _94二叉树的中序遍历_
 * @package leetcode
 * @date 2020/8/17 15:26
 * Copyright (c) 2019 ZheJiang Loong Airlines CO.,Ltd, All Rights Reserved.
 * 本代码仅限于浙江长龙航空有限公司内部使用，禁止外泄，禁止用于其他任何商业目的。
 */
package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *  https://leetcode-cn.com/problems/binary-tree-inorder-traversal/
 */
public class _94二叉树的中序遍历_ {
    List<Integer> result = new ArrayList<>();
    //递归
    public List<Integer> inorderTraversal1(TreeNode root) {
        if(root != null){
            inorderTraversal(root.left);
            result.add(root.val);
            inorderTraversal(root.right);
        }
        return result;
    }

    //迭代
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if(root == null){
            return result;
        }
        TreeNode currentNode = root;
        while (currentNode != null || !stack.isEmpty()){
            while (currentNode != null){
                stack.push(currentNode);
                currentNode = currentNode.left;
            }
            currentNode = stack.pop();
            result.add(currentNode.val);
            currentNode = currentNode.right;
        }
        return result;
    }

}
