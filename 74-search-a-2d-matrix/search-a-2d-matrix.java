class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int col=matrix[0].length;
        int s=0,e=row*col-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            int ridx=mid/col;
            int cidx=mid%col;
            if(matrix[ridx][cidx]==target){
                return true;
            }
            else if(matrix[ridx][cidx]>target){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return false;
    }
}