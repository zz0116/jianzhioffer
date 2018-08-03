package com.zyz.learn.jianzhioffer.q22;

import java.util.LinkedList;
import java.util.Stack;

/**
 * 输入两个整数序列，第一个序列表示栈的压入顺序，
 * 请判断第二个序列是否为该栈的弹出顺序。
 * 假设压入栈的所有数字均不相等。
 * 例如序列1,2,3,4,5是某栈的压入顺序，
 * 序列4,5,3,2,1是该压栈序列对应的一个弹出序列，
 * 但4,3,5,1,2就不可能是该压栈序列的弹出序列。
 * （注意：这两个序列的长度是相等的）
 *
 * @author ZhangYuanzhuo
 * @since 2017/9/10
 */
public class Solution {
    public boolean IsPopOrder(int[] pushA, int[] popA) {
        // 使用的栈
        Stack<Integer> use = new Stack<>();
        // 未入栈的元素储存集合
        LinkedList<Integer> store = new LinkedList<>();

        for (int i : pushA) {
            store.add(i);
        }

        for (int i : popA) {
            boolean flag = false;

            // 检查是否是use的top元素
            if (use.size() != 0) {
                Integer peek = use.peek();
                // 如果是，就弹栈
                if (i == peek) {
                    use.pop();
                    flag = true;
                }
            }

            // 如果use为空，或者i不是use的top元素，就检查store
            while (store.size() > 0) {
                Integer pop = store.pop();
                if (i == pop) {
                    flag = true;
                    break;
                } else {
                    use.push(pop);
                }
            }
            if (!flag) {
                return false;
            }
        }

        return true;
    }
}