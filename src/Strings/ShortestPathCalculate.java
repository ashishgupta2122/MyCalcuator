package Strings;
import java.util.*;
public class ShortestPathCalculate {
    public static float Path(String str) {
        int X = 0,Y = 0;
        for (int i = 0; i < str.length(); i++) {
            char dir = str.charAt(i);
            //East
            if (dir == 'E') {
                X++;
            }
            //West
            if (dir == 'W') {
                X--;
            }
            //North
            if (dir == 'N') {
                Y++;
            }
            //South
            if (dir == 'S') {
                Y--;
            }
        }
        int x2 = X*X;
        int y2 = Y*Y;
        return (float)Math.sqrt(x2 + y2);
    }
    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println(Path(str));
    }
}
