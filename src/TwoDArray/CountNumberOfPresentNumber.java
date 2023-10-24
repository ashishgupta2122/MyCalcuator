package TwoDArray;
import java.util.*;
public class CountNumberOfPresentNumber {
    public static void main(String[] args) {
        int matix[][] = {{4,7,8},
                {8,8,7}};
        int count = 0;
        for (int i = 0; i < matix.length; i++) {
            for (int j = 0; j < matix[0].length; j++) {
                if (matix[i][j] == 7)  {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
