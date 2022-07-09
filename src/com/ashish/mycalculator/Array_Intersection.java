package com.ashish.mycalculator;

public class Array_Intersection {
    public static int Intersection(int[] arr1, int[] arr2)
    {
        for (int i = 0; i < arr1.length; i++)
        {
            for (int j = 0; j < arr2.length; j++)
            {
                if(arr1[i] == arr2[j])
                {
                    System.out.println(arr1[i] +" ");
                    arr2[j] = Integer.MIN_VALUE;
                    break;
                }
            }
        }
        return 0;
    }
    public static void main(String[] args)
    {
        int arr1[] = {2,6,2,3,2};
        int arr2[] = {3,2,2};
        System.out.println(Intersection(arr1,arr2));
    }
}
