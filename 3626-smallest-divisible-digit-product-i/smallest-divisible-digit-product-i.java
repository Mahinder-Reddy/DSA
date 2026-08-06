class Solution {
    public int smallestNumber(int n, int t) {
        for(int i=n;i<=100;i++){
            if(product(i)%t==0){
                return i;
            }
        }
        return -1;
    }
    public static int product(int n){
        int pro=1;
        while(n!=0){
            int digit=n%10;
            pro*=digit;
            n/=10;
        }
        return pro;
    }
}