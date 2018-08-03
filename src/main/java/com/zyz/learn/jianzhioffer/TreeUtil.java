package com.zyz.learn.jianzhioffer;

/**
 * @author ZhangYuanzhuo
 * @since 2017/9/13
 */
public class TreeUtil {
    public static void printTree(TreeNode t) {
        if (t != null) {
            System.out.println(t.val);
            if (t.left != null) {
                System.out.print(t.val + "'l ");
                printTree(t.left);
            }
            if (t.right != null) {
                System.out.print(t.val + "'r ");
                printTree(t.right);
            }
        }
    }
}
