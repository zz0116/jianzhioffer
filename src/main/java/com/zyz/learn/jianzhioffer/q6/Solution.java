package com.zyz.learn.jianzhioffer.q6;

import com.zyz.learn.jianzhioffer.TreeNode;

/**
 * 输入某二叉树的前序遍历和中序遍历的结果，
 * 请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和
 * 中序遍历序列{4,7,2,1,5,3,8,6}，
 * 则重建二叉树并返回。
 *
 * @author ZhangYuanzhuo
 * @since 2017/9/12
 */
public class Solution {
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre.length == 0) {
            return null;
        } else if (pre.length == 1) {
            return new TreeNode(pre[0]);
        }

        int split = pre[0];
        int index = 0;
        for (int i = 0; i < in.length; i++) {
            if (in[i] == split) {
                index = i;
                break;
            }
        }

        int[] leftPre = new int[index];
        for (int i = 1; i < index + 1; i++) {
            leftPre[i - 1] = pre[i];
        }
        int[] leftIn = new int[index];
        for (int i = 0; i < index; i++) {
            leftIn[i] = in[i];
        }

        int[] rightPre = new int[pre.length - index - 1];
        for (int i = index + 1; i < pre.length; i++) {
            rightPre[i - index - 1] = pre[i];
        }
        int[] rightIn = new int[pre.length - index - 1];
        for (int i = index + 1; i < in.length; i++) {
            rightIn[i - index - 1] = in[i];
        }

        TreeNode parent = new TreeNode(split);
        parent.left = reConstructBinaryTree(leftPre, leftIn);
        parent.right = reConstructBinaryTree(rightPre, rightIn);
        return parent;
    }
}