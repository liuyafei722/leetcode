package leetcode;

import java.util.Stack;

/**
 * @Author: LiuYafei
 * @Date: 2017/11/21
 * @Time: 21:26
 * @Description:
 */
public class kuohao {
    public int longest(String str) {
        Stack<Integer> stack = new Stack<>();
        int len = str.length();
        boolean[] flag = new boolean[len];
        for(int i=0;i<len;i++) {
            flag[i] = false;
        }
        for (int i = 0;i< str.length();i++) {
            if (str.charAt(i) == '(') {
                stack.push(i);
            }
            else {
                if(!stack.empty()) {
                    int a = stack.pop();
                    flag[a] = true;
                    flag[i] = true;
                }
            }
        }

        int max =0;
        int temp =0;
        int i=0;
        while (i<len) {
            temp = 0;
            while (i<len && flag[i]) {
                temp++;
                i++;
            }
            i++;
            if(temp>max) {
                max = temp;
            }
        }
        return max;

    }
}
