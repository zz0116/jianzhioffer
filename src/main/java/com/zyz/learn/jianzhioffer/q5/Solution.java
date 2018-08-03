package com.zyz.learn.jianzhioffer.q5;

import com.zyz.learn.jianzhioffer.ListNode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 输入一个链表，从尾到头打印链表每个节点的值。
 *
 * @author ZhangYuanzhuo
 * @since 2017/9/12
 */
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack = new Stack<>();
        ListNode p = listNode;
        ArrayList<Integer> list = new ArrayList<>();

        while (p != null) {
            stack.push(p.val);
            p = p.next;
        }
        while (!stack.empty()) {
            list.add(stack.pop());
        }

        return list;
    }
}