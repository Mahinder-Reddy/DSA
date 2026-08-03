class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=-1;
        int last=-1;
        int low=0;int high=nums.length-1;
        int l=0;int h=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                first=mid;
             high=mid-1;
            }
            else if(nums[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        while(l<=h){
            int mid=l+(h-l)/2;
            if(nums[mid]==target){
                last=mid;
                l=mid+1;
            }
            else if(nums[mid]>target){
                h=mid-1;
            }else{
                l=mid+1;
            }
        }
        int[]ans={first,last};
        return ans;
    }
}