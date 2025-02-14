package Patterns.ArraysAndStrings.TwoPointers;
//https://www.geeksforgeeks.org/problems/segregate-0s-and-1s5106/1
public class Segregate0s1s {
    void segregate0and1(int[] arr) {
        int i = 0, j = arr.length-1;

        while(i<j){
            if(arr[i]==0){
                i++;
            }else{
                if(arr[j]==0){
                    arr[i]=0;
                    arr[j]=1;
                }else{
                    j--;
                }
            }
        }
    }
}
