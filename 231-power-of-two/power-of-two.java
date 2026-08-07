class Solution {
    public boolean isPowerOfTwo(int n) {
       return powOf2(n);
    }
    public static boolean powOf2(int n){
        if(n==1){
            return true;
        }if(n%2!=0||n==0){
            return false;
        }
        return powOf2(n/2);
    }
}
