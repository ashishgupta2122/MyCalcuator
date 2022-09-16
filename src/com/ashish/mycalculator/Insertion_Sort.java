package com.ashish.mycalculator;

public class Insertion_Sort {
    public static void Insertion(int[] arr)
    {
        for (int i = 1; i < arr.length; i++)
        {
            int temp = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > temp)
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }
    public static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        Insertion_Sort s1 = new Insertion_Sort();
        int arr[] = {8,4,1,5,9,2};
        s1.Insertion(arr);
        s1.printArray(arr);

    }
}
