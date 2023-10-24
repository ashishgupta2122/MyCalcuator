package Array;
import java.util.*;
public class WaveArrayProblems {
    public static void Swap(ArrayList<Integer> list,int index1,int index2) {
        int temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2,temp);
    }
    public static void Wave(ArrayList<Integer> list) {
        //You Can Code Here
        Collections.sort(list);
        int n = list.size();
        for (int i = 1; i < n; i+=2) {
            Swap(list,i,i-1);
        }
    }
    public static void Print(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer A[] = {1,9,5,2,0,7,4,8,3,6};
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(9);
        list1.add(5);
        list1.add(2);
        list1.add(0);
        list1.add(7);
        list1.add(4);
        list1.add(8);
        list1.add(3);
        list1.add(6);
        Wave(list1);
        Print(list1);
    }
}
