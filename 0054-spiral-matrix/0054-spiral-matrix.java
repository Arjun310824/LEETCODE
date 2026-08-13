import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;        // rows
        int m = matrix[0].length;     // cols
        int l = 0, r = m - 1;
        int top = 0, b = n - 1;
        
        List<Integer> ans = new ArrayList<>();
        
        while (l <= r && top <= b) {
            // Traverse top row
            for (int i = l; i <= r; i++) {
                ans.add(matrix[top][i]);
            }
            top++;
            
            // Traverse right column
            for (int i = top; i <= b; i++) {
                ans.add(matrix[i][r]);
            }
            r--;
            
            // Traverse bottom row (if still valid)
            if (top <= b) {
                for (int i = r; i >= l; i--) {
                    ans.add(matrix[b][i]);
                }
                b--;
            }
            
            // Traverse left column (if still valid)
            if (l <= r) {
                for (int i = b; i >= top; i--) {
                    ans.add(matrix[i][l]);
                }
                l++;
            }
        }
        
        return ans;
    }
}
