class Solution {
    public int mySqrt(int x) {
        int h=x;
        int l=1;
        int mid=0;
        int ans=0;
        while(l<=h){
            mid=l+(h-l)/2;
            if((long)mid*mid==x){
                return mid;
            }else if((long)mid*mid<x){
                ans=mid;
                l=mid+1;
            }else{
                h=mid-1;
            }
        }
        return ans;
    }
}