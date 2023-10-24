package com.ashish.mycalculator.temp;
import java.util.*;
public class FirstElementtOccursKthTime {
    public static int Occurs(int arr[],int k){
        HashMap<Integer,Integer> s1 = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            if(s1.containsKey(arr[i])){
                s1.put(arr[i], s1.get(arr[i])+1);
            }else{
                s1.put(arr[i], i);
            }
        }
        for (int i = 0; i < arr.length; i++){
            if(k == s1.get(arr[i])){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,7,4,3,4,8,7};
        int k = 2;
        System.out.println(Occurs(arr,k));
    }
}
