//TC - O(m * n)   SC - O(m * n)
public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;  

        int left = 0;
        int right = cols-1;
        int top = 0; 
        int bottom = rows-1; 

        while(left<=right && top<=bottom){
            for(int i = left; i<=right; i++){
                res.add(matrix[top][i]);
            }
            top++;

            for(int i = top; i<=bottom; i++){
                res.add(matrix[i][right]);
            }
            right--;

            if(top<=bottom){ 
                for(int i = right; i>=left; i--){
                    res.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if(left<=right){ 
                for(int i = bottom; i>=top ; i--){
                    res.add(matrix[i][left]);
                }
            }
            left++;
        }

        return res; 
    }
}