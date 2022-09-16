package com.ashish.mycalculator;
import java.util.*;
public class FindTheMedian {
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    public  void Median(int num)
    {
        if (maxHeap.isEmpty() || maxHeap.size() >= num)
        {
            maxHeap.add(num);
        }
        else
        {
            minHeap.add(num);
        }

        if(maxHeap.size() > minHeap.size()+1)
        {
            minHeap.add(maxHeap.poll());
        }
        else if(minHeap.size()+1 > maxHeap.size())
        {
            maxHeap.add(minHeap.poll());
        }
    }
    public  double findMedian(int i)
    {
        if (maxHeap.size() == minHeap.size())
        {
            return maxHeap.peek() / 2.0 + minHeap.peek() / 2.0;
        }
        return maxHeap.peek();
    }
    public static void main(String[] args)
    {
        FindTheMedian s1 = new FindTheMedian();
        s1.findMedian(3);
        s1.findMedian(1);
        //System.out.println("The Median is: "+findMedian());
    }
}
