package com.zyz.learn.jianzhioffer.q21;

import java.util.LinkedList;
import java.util.Stack;

/**
 * 面试题21：包含min函数的栈
 *
 * @author ZhangYuanzhuo
 * @since 2017/9/10
 */
public class Solution {
    private Stack<Integer> stack = new Stack<>();
    // 从大到小排列
    private LinkedList<Integer> list = new LinkedList<>();

    public void push(int node) {
        if (stack.size() == 0) {
            list.add(node);
        } else {
            int i = 0;
            for (; i < list.size(); i++) {
                if (list.get(i) < node) {
                    list.add(i, node);
                    break;
                }
            }
            if (i == list.size()) {
                list.addLast(node);
            }
        }
        stack.push(node);
    }

    public void pop() {
        list.remove(stack.pop());
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return list.getLast();
    }
}