package com.ashish.mycalculator;
import java.util.*;
public class Graph_Data_Structure {
    public static void addEdge(int arr[][],int source,int dest)
    {
        arr[source][dest] = 1;
        arr[dest][source] = 1;
    }
    public static void addEdge(ArrayList<ArrayList<Integer>> s1,int source,int dest)
    {
        s1.get(source).add(dest);
        s1.get((dest)).add(source);
    }
    public static void main(String[] args)
    {
        int v = 5;
        int e = 10;

        int arr[][] = new int[v+1][v+1];

        ArrayList<ArrayList<Integer>> s1 = new ArrayList<>();
        for (int i = 0; i <= v; i++)
        {
            s1.add(new ArrayList<>());
        }
    }
}
