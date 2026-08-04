class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        int freq[]=new int[101];
        int small=101;
        int big=0;
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
            if(nums[i]<small){
                small=nums[i];
            }
            if(nums[i]>big){
                big=nums[i];
            }
        }
        for(int i=small;i<big;i++){
            if(freq[i]==0){
                ans.add(i);
            }
        }
        return ans;

    }
}