class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> ans=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            ans.add(nums[i]);
        }
        for(int i=1;;i++){
            int multiple=k*i;
            if(!ans.contains(multiple)){
                return multiple;
            }
        }
      //  return -1;

    }
    
}