package tree;



/**
 *
 */
public class CreatTree {


    /**
     * 动态创建二叉查找树
     *
     * @param treeRoot 根节点
     * @param value    节点的值
     */
    public static void createTree(TreeRoot treeRoot, int value) {
        //如果树根为空(第一次访问)，将第一个值作为根节点
        if (treeRoot.getTreeRoot() == null) {
            TreeNode treeNode = new TreeNode(value);
            treeRoot.setTreeRoot(treeNode);
        } else  {
            //当前树根
            TreeNode tempRoot = treeRoot.getTreeRoot();
            while (tempRoot != null) {
                //当前值大于根值，往右边走
                if (value > tempRoot.getTreeValue()) {
                    //右边没有树根，那就直接插入
                    if (tempRoot.getRightTreeNode() == null) {
                        tempRoot.setRightTreeNode(new TreeNode(value));
                        return ;
                    } else {
                        //如果右边有树根，到右边的树根去
                        tempRoot = tempRoot.getRightTreeNode();
                    }
                } else {
                    //左没有树根，那就直接插入
                    if (tempRoot.getLeftTreeNode() == null) {
                        tempRoot.setLeftTreeNode(new TreeNode(value));
                        return;
                    } else {
                        //如果左有树根，到左边的树根去
                        tempRoot = tempRoot.getLeftTreeNode();
                    }
                }
            }
        }
    }

}
