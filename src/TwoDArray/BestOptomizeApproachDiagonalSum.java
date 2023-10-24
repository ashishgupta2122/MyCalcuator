package TwoDArray;
import java.util.*;
public class BestOptomizeApproachDiagonalSum {
    public static int Sum(int matrix[][]) {
        int n = matrix.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            //BR
            sum += matrix[i][i];

            //LB
            if (i != n-i-1) {
                sum += matrix[i][n-i-1];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        System.out.println(Sum(matrix));
    }
}
