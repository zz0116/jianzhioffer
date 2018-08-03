package com.zyz.learn.jianzhioffer.q25;

import com.zyz.learn.jianzhioffer.TreeNode;
import org.junit.Test;
import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * @author ZhangYuanzhuo
 * @since 2017/9/12
 */
public class SolutionTest {
    @Test
    public void findPath() throws Exception {
        Solution s = new Solution();
        TreeNode t1 = new TreeNode(10);
        TreeNode t2 = new TreeNode(5);
        TreeNode t3 = new TreeNode(12);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(7);
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
        ArrayList<ArrayList<Integer>> lists = s.FindPath(t1, 22);
        System.out.println(lists);
    }

}