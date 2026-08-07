class Solution {
    public void reverseString(char[] s) {
        reverse(s,s.length,0);
    }
    public static void reverse(char []s,int n, int ind){
        if(ind>=n-ind){
            return ;
        }
        char t=s[ind];
        s[ind]=s[n-1-ind];
        s[n-1-ind]=t;
        reverse(s,n,ind+1);
        
    }
}