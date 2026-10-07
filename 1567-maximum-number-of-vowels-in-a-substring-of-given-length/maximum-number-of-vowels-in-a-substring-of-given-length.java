class Solution {
    public int maxVowels(String s, int k) {
        int count =0;
        String str="aeiou";
        for(int i=0;i<k;i++){
            if(str.indexOf(s.charAt(i))!=-1){
                count++;
            }
        }
        int max=count;
        for(int j=k;j<s.length();j++){
            if(str.indexOf(s.charAt(j-k))!=-1){
                count--;
            }
            if(str.indexOf(s.charAt(j))!=-1){
            count++;
            }
            max=Math.max(count,max);
        }
        return max;

    }
}