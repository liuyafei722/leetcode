package leetcode;

import java.util.*;
/*
 * 最长有效括号
 *
 */

public class LongestValidParentheses {
    public int longestValidParentheses(String s) {
        Stack<Character> sta = new Stack<>();
        int count = 0;
        int longestCount = 0;
        for(int i = 0; i < s.length(); i++) {
            if(sta.empty() || s.charAt(i) == '(') {
                sta.push(s.charAt(i));
            }
            else if(s.charAt(i) == ')') {
                if (sta.peek() == '(') {
                    sta.pop();
                    count += 2 ;
                }
                else if(sta.peek() == ')') {
                    count = 0;
                }
            }
            if(count > longestCount) longestCount = count;
        }
        return longestCount;
    }
}
