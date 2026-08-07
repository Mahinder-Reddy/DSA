class Solution {
    public int fib(int n) {
       return fibbo(n);
    }
    public static int fibbo(int n){
        if(n==0){
            return 0;
        }if(n==1){
            return n;
        }
        return fibbo(n-1)+fibbo(n-2);
    }
}