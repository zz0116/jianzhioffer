package com.zyz.learn.jianzhioffer.q6;

import com.zyz.learn.jianzhioffer.TreeUtil;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author ZhangYuanzhuo
 * @since 2017/9/13
 */
public class SolutionTest {
    @Test
    public void reConstructBinaryTree() throws Exception {
        Solution s = new Solution();
        TreeUtil.printTree(s.reConstructBinaryTree(
                new int[]{1, 2, 4, 7, 3 ,5 ,6 ,8},
                new int[]{4, 7, 2, 1, 5, 3, 8, 6}));
    }

}