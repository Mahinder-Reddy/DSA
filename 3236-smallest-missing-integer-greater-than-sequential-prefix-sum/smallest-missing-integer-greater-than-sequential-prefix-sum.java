class Solution {
    public int missingInteger(int[] nums) {
        Set<Integer> check=new HashSet<>();
      int sum=nums[0];  
      for(int x: nums){
        check.add(x);
      }
      for(int i=1;i<nums.length;i++){
        if(nums[i]==nums[i-1]+1){
            sum+=nums[i];
        }else{
            break;
        }
      }
      while(check.contains(sum)){
        sum++;
      }
      return sum;
    }
}