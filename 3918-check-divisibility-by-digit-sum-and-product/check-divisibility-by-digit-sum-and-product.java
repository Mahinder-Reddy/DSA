class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int product=1;
        int num=n;
        while(n!=0){
            int digit=n%10;
            sum+=digit;
            product*=digit;
            n/=10;
        }
        int divisor=sum+product;
        if(num%divisor==0){
            return true;
        }
        return false;
    }
}