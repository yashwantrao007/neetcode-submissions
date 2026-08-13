class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int rows = matrix.length, cols = matrix[0].length;

        int l = 0; int r = (rows*cols)-1;



        while(l<=r){
            
            int mid = (l+r)/2;
            int val = matrix[mid/cols][mid%cols];

            if(val == target){
                return true;
            }else if(val > target){
                r= mid-1;
            }else{
                l = mid+1;
            }
            

        }
        

        return false;
        
    }
}
