class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map <Integer,Integer> store=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int req=target-nums[i];
            if(store.containsKey(req)){
                return new int[]{store.get(req), i};
            }else{
                store.put(nums[i],i);
            }
        }
        return new int[]{-1,-1};
    }
}