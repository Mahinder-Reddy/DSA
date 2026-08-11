class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        recsubset(nums,0,new ArrayList<>(), ans);
        return ans;
        
    }
    public static void recsubset(int []nums,int ind,List<Integer> cur,List<List<Integer>> ans){
        if(ind==nums.length){
            ans.add(new ArrayList<>(cur));
            return;
        }
        cur.add(nums[ind]);
        recsubset(nums,ind+1,cur,ans);
        cur.remove(cur.size() - 1);
        recsubset(nums,ind+1,cur,ans);
    }
}