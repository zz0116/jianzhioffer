package com.zyz.learn.jianzhioffer.q22;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author ZhangYuanzhuo
 * @since 2017/9/10
 */
public class SolutionTest {
    @Test
    public void isPopOrder() throws Exception {
        int[] pushA = {1,2,3,4,5};
        int[] popA = {4,5,3,2,1};
//        int[] popA = {4,3,5,1,2};
        Solution s = new Solution();
        System.out.println(s.IsPopOrder(pushA, popA));
    }

}