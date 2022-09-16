package com.ashish.mycalculator;
import java.util.HashMap;
public class Distinct_Element {
    public static void count(int arr[],int k)
    {
        HashMap<Integer,Integer> sc = new HashMap<>();
        for (int i = 0; i < k; i++)
        {
            sc.put(arr[i], sc.getOrDefault(arr[i],0)+1);
        }
        System.out.println(sc.size());

        for (int i = k; i < arr.length; i++)
        {
          //  if (sc.get(arr[i - k] == 1))
            {
                sc.remove(arr[i - k]);
            }
            //else
            {
                sc.put(arr[i - k],sc.get(arr[i - k])-1);
            }
            System.out.println(sc.size());
        }
    }
    public static void main(String[] args) {

    }
}
