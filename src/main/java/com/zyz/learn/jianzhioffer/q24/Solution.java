package com.zyz.learn.jianzhioffer.q24;

/**
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 *
 * @author ZhangYuanzhuo
 * @since 2017/9/10
 */
public class Solution {
    public boolean VerifySquenceOfBST(int[] sequence) {
        // 测试用例{}为false
        if (sequence.length == 0) {
            return false;
        }

        if (sequence.length < 3) {
            return true;
        }
        int split = sequence[sequence.length - 1];

        int[] left;
        int[] right;
        int rightStart = 0;

        /*
        用i < sequence.length和sequence[i] >= parent可以区分
        循环到sequence.length-1正常出循环和循环到它break的情况
         */
        for (int i = 0; i < sequence.length; i++) {
            rightStart = i;
            if (sequence[i] >= split) {
                break;
            }
        }

        left = new int[rightStart];
        for (int i = 0; i < rightStart; i++) {
            left[i] = sequence[i];
        }

        right = new int[sequence.length - rightStart - 1];
        for (int i = rightStart; i < sequence.length - 1; i++) {
            if (sequence[i] < split) {
                return false;
            }
            right[i - rightStart] = sequence[i];
        }

        if (rightStart == 0) {
            return VerifySquenceOfBST(right);
        } else if (rightStart == sequence.length - 1) {
            return VerifySquenceOfBST(left);
        } else {
            return VerifySquenceOfBST(left) && VerifySquenceOfBST(right);
        }
    }
}