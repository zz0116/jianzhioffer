package com.zyz.learn.jianzhioffer.q7;

import java.util.Stack;

/**
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。
 * 队列中的元素为int类型。
 *
 * @author ZhangYuanzhuo
 * @since 2017/9/13
 */
public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if(!stack2.isEmpty()) return stack2.pop();
        int n = stack1.size();
        while(n-- > 0) {
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }
}
