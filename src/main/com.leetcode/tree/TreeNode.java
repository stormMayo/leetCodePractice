package tree;


public class TreeNode {

    private int treeValue;

    private TreeNode leftTreeNode;

    private TreeNode rightTreeNode;

    public TreeNode(int treeValue) {
        this.treeValue = treeValue;
    }

    public int getTreeValue() {
        return treeValue;
    }

    public void setTreeValue(int treeValue) {
        this.treeValue = treeValue;
    }

    public TreeNode getLeftTreeNode() {
        return leftTreeNode;
    }

    public void setLeftTreeNode(TreeNode leftTreeNode) {
        this.leftTreeNode = leftTreeNode;
    }

    public TreeNode getRightTreeNode() {
        return rightTreeNode;
    }

    public void setRightTreeNode(TreeNode rightTreeNode) {
        this.rightTreeNode = rightTreeNode;
    }
}
