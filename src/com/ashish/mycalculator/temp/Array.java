package com.ashish.mycalculator.temp;
import java.util.*;
public class Array {
    public static int Maxprofit(int prices[]){
        int buy = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++){
            if (buy < prices[i]){
                profit = Math.max(prices[i] - buy, profit);
            }else {
                buy = prices[i];
            }
        }
        return profit;
    }
    public static void main(String[] args){
        int prices[] = {7,1,5,3,6,4};
        System.out.println("Profit "+Maxprofit(prices));
    }
}
