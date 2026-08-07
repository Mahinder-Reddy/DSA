class Solution {
    public boolean isPowerOfThree(int n) {
        return pow3(n);
    }
    public static boolean pow3(int n){
        if(n==1){
            return true;
        }
        if(n>0&&n%3==0){
            return pow3(n/3);
        }
        return false;
    }
}