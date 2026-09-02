class Solution {
    public boolean uniformArray(int[] nums1) {
        int evencount=0;
        int oddcount=0;
        for(int x: nums1){
            if(x%2==0){
                evencount++;
            }else{
                oddcount++;
            }
        }
        return oddcount==0||evencount==0||(oddcount>=1&&evencount>=1);
    }
}