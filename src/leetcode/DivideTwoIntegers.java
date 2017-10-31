package leetcode;

public class DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor == -1 || divisor == 0 ) {
            return Integer.MAX_VALUE;
        }
        int rechar = 1;
        if(dividend < 0 && divisor > 0 || dividend > 0 && divisor < 0)
        {
            rechar = -1;
        }
        long i = 0;
        long dsor = Math.abs((long)divisor);
        long dend = Math.abs((long)dividend);
        while(dend >= dsor){
            long t = dsor;
            long p = 1;
            while(dend>=(t<<1)) {
                t <<= 1;
                p <<= 1;
            }
            i += p;
            dend -= t;
        }
        return (int)(rechar*i);
    }
}
