package jun19;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * (0 , 0 ) (0,1 ) (
 * 1 , 2 , 3
 *
 * 4 , 5 , 6
 *
 * 7 , 8 , 9
 *
 *
 */

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        SpiralMatrix   spiralMatrix = new SpiralMatrix();

        System.out.println(spiralMatrix.spiralOrder(matrix));

    }


    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            // Traverse top row
            for (int j = left; j <= right; j++) {
                result.add(matrix[top][j]);
            }
            top++;

            // Traverse right column
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;

            // Traverse bottom row (if valid)
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    result.add(matrix[bottom][j]);
                }
                bottom--;
            }

            // Traverse left column (if valid)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }


}


/**
 *
 *
 *
 * import java.util.ArrayList;
 * import java.util.List;
 *
 * class Solution {
 *     public List<Integer> spiralOrder(int[][] matrix) {
 *         List<Integer> result = new ArrayList<>();
 *         int top = 0, bottom = matrix.length - 1;
 *         int left = 0, right = matrix[0].length - 1;
 *
 *         while (top <= bottom && left <= right) {
 *             // Traverse top row
 *             for (int j = left; j <= right; j++) {
 *                 result.add(matrix[top][j]);
 *             }
 *             top++;
 *
 *             // Traverse right column
 *             for (int i = top; i <= bottom; i++) {
 *                 result.add(matrix[i][right]);
 *             }
 *             right--;
 *
 *             // Traverse bottom row (if valid)
 *             if (top <= bottom) {
 *                 for (int j = right; j >= left; j--) {
 *                     result.add(matrix[bottom][j]);
 *                 }
 *                 bottom--;
 *             }
 *
 *             // Traverse left column (if valid)
 *             if (left <= right) {
 *                 for (int i = bottom; i >= top; i--) {
 *                     result.add(matrix[i][left]);
 *                 }
 *                 left++;
 *             }
 *         }
 *         return result;
 *     }
 * }
 */
