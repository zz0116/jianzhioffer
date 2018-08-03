package com.zyz.learn.jianzhioffer.q4;

/**
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。
 * 例如，当字符串为We Are Happy。
 * 则经过替换之后的字符串为We%20Are%20Happy。
 *
 * @author ZhangYuanzhuo
 * @since 2017/9/12
 */
public class Solution {
    public String replaceSpace(StringBuffer str) {
        int n = str.length();
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < n; i++) {
            if (str.charAt(i)==' ') {
                sb.append("%20");
            }else {
                sb.append(str.charAt(i));
            }
        }
        return String.valueOf(sb);
    }
}