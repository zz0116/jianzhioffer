package com.zyz.learn.jianzhioffer.q24;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author ZhangYuanzhuo
 * @since 2017/9/10
 */
public class SolutionTest {
    @Test
    public void verifySquenceOfBST() throws Exception {
        Solution s = new Solution();
        System.out.println(s.VerifySquenceOfBST(new int[]{4, 8, 6, 12, 16, 14, 10}));
        System.out.println(s.VerifySquenceOfBST(new int[]{4, 6, 7, 5}));
        System.out.println(s.VerifySquenceOfBST(new int[]{1, 2, 3, 4, 5}));
    }

}