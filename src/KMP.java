public class KMP {
    public static int[] getNextArray(String P) {
        if(P == null || P.length() == 0) {
            return null;
        }
        int[] next = new int[P.length() + 1];
        next[0] = 0;
        next[1] = 0;
        int temp = 0;
        for(int i = 1; i < P.length(); i++){
            while(temp > 0 && P.charAt(i) != P.charAt(temp)) {
                temp = next[temp];
            }
            if(P.charAt(i) == P.charAt(temp)) {
                temp++;
            }
            next[i+1] = temp;
            System.out.println(next[i+1]);
        }
        return next;
    }
    public static void KMPSearch(String O, String P) {
        int[] next = getNextArray(P);
        int n = 0;
        for(int i = 0; i < O.length(); i++){
            while(n > 0 && O.charAt(i) != P.charAt(n)) {
                n = next[n];
            }
            if(O.charAt(i) == P.charAt(n)) {
                n++;
            }
            if(n == P.length()){
                System.out.println("Find the position" + (i-n));
                System.out.println(O.substring(i-n+1, i+1));
                n = next[n];
            }
        }
    }
    public static void main(String[] args) {
        String o = "BBCABCDABABCDABCDABDE";
        String p = "ABCDABD";
        KMPSearch(o,p);
    }
}
