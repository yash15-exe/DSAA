package Patterns.ArraysAndStrings.TwoPointers;
//https://www.interviewbit.com/problems/remove-duplicates-from-sorted-array/
import java.util.ArrayList;
import java.util.Objects;

public class RemoveDuplicate {
    public int removeDuplicates(ArrayList<Integer> a) {

      int i = 0, j = 1;
      while(j<a.size()){
          if(Objects.equals(a.get(j), a.get(i))) {

              while (Objects.equals(a.get(j), a.get(i))) {
                  j++;
              }
              if (a.get(i) != null && a.get(j) != null) {
                  a.set(i, a.get(j));
              }
          }
          i++;
          j++;
      }
      return i+1;
    }
}
