package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeDemo {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.println(root);
        List<Integer> integers = inOrderTraversal(root);
        System.out.println(integers);
        System.out.println(getMaxDepth(root));
        levelOrder(root);

    }


    /**
     * 中序遍历
     *
     * @param root
     * @return
     */
    public static List<Integer> inOrderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inOrderTraversal(root, result);
        return result;

    }

    public static void inOrderTraversal(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }

        inOrderTraversal(root.left, list);
        list.add(root.val);
        inOrderTraversal(root.right, list);

    }

    public static int getMaxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int leftDepth = getMaxDepth(root.left);
            int rightDepth = getMaxDepth(root.right);
            System.out.println("left = " + leftDepth + "right = " + rightDepth);
            return Math.max(leftDepth, rightDepth) + 1;
        }
    }

    public static void levelOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
       while (!queue.isEmpty()){
           TreeNode node = queue.poll();
           System.out.println(node.val);
           if(node.left != null){
               queue.offer(node.left);
           }

           if(node.right != null){
               queue.offer(node.right);
           }

       }
    }


}
