class Solution {
    public int minimumDeletions(int[] nums) {
       int max=Integer.MIN_VALUE;
       int maxInd=0;
       int minInd=0;
       int min=Integer.MAX_VALUE;
       for(int i=0;i<nums.length;i++){
        if(nums[i]<min){
            min=nums[i];
            minInd=i;
        }
        if(nums[i]>max){
            max=nums[i];
            maxInd=i;
        }
       }
       int left=Math.min(minInd,maxInd);
       int right=Math.max(minInd,maxInd);
       int option1=right+1;
        int option2=nums.length-left;
        int option3=(left+1)+(nums.length-right);
        return Math.min(option1, Math.min(option2, option3));


    }
}