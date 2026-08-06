class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows=(matrix.length);
        int col=(matrix[0].length);
       int high=rows*col-1;
       int low=0;
       while(low<=high) {
        int mid = low + (high - low) / 2;
        int rm=mid /col;
        int cm=mid%col;
        if(matrix[rm][cm]==target){
            return true;
        }else if(matrix[rm][cm]<target){
            low=mid+1;
        }else{
            high=mid-1;
        }
       }
       return false;
    }
}