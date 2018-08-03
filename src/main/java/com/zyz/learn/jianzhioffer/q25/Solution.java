package com.zyz.learn.jianzhioffer.q25;

import com.zyz.learn.jianzhioffer.TreeNode;

import java.util.ArrayList;

/**
 * 输入一颗二叉树和一个整数，
 * 打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 *
 * @author ZhangYuanzhuo
 * @since 2017/9/12
 */
public class Solution {
    private ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
    private ArrayList<Integer> list = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if (root == null) {
            return lists;
        }

        list.add(root.val);
        target -= root.val;

        if (root.left == null && root.right == null) {
            if (target == 0) {
                lists.add(new ArrayList<>(list));
            }
        }
        if (root.left != null) {
            FindPath(root.left, target);
        }
        if (root.right != null) {
            FindPath(root.right, target);
        }

        list.remove(list.size() - 1);
        return lists;
    }
}