package com.zyz.learn.jianzhioffer.q65;

import static org.junit.Assert.*;

/**
 * @author ZhangYuanzhuo
 * @since 2017/10/10
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution s = new Solution();
        boolean hasPath = s.hasPath(new char[]{'a', 'b', 'c', 'e', 's', 'f', 'c', 's', 'a', 'd', 'e', 'e'},
                3, 4, new char[]{'b', 'c', 'c', 'e', 'd'});
        System.out.println(hasPath);
    }
}