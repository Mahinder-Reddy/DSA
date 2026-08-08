class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map <Integer,Integer> store=new HashMap<>();
        int [] ans=new int[2];
        for(int i=0;i<nums.length;i++){
            int req=target-nums[i];
            if(store.containsKey(req)){
                ans[0]=i;
                ans[1]=store.get(req);
                return ans;
            }else{
                store.put(nums[i],i);
            }
        }
        return new int[]{-1,-1};
    }
}