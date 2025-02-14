package Patterns.ArraysAndStrings.TwoPointers;
//https://www.geeksforgeeks.org/problems/equal-to-product3836/1
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class ProductPair {

    //Using HashSet

    boolean isProduct(int[] arr, long x) {
        HashSet<Integer> set = new HashSet<>();
        for(int i:arr){
            set.add(i);
        }

        for (int i = 0; i < arr.length; i++) {
            if(set.contains((int)x/arr[i]))return true;
        }
        return false;
    }

    //using sort

    boolean isProduct1(int[] arr, long x) {
        Arrays.sort(arr);
        int i = 0, j = arr.length-1;
        while(i<j){
            if((long)arr[i]*arr[j]==x)return true;
            if((long)arr[i]*arr[j]<x){
                i++;
            }else{
                j--;
            }
        }

        return false;
    }
}
