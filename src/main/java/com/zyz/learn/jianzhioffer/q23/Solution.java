package com.zyz.learn.jianzhioffer.q23;

import com.zyz.learn.jianzhioffer.TreeNode;

import java.util.ArrayList;

/**
 * @author ZhangYuanzhuo
 * @since 2017/9/10
 */
public class Solution {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if(root != null) list.add(root.val);
        helper(root, list);
        return list;
    }

    private void helper(TreeNode p, ArrayList<Integer> list) {
        if(p == null) return;
        if(p.left != null) list.add(p.left.val);
        if(p.right != null) list.add(p.right.val);
        helper(p.left, list);
        helper(p.right, list);
    }
}