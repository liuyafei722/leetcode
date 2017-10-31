/*
辗转相除法求最大公约数
 */
public class GCD {
    public int getMaxCommonDivisor(int a, int b) {
        int m = a, n = b;
        if(b == 0) {
            return a;
        }
        else {
            return getMaxCommonDivisor(b, a%b);
        }
    }
}
