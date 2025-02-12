package DS.Arrays;

public class AllNegativeToEnd {
    public void segregateElements(int[] arr) {
        int[] newArr = new int[arr.length];
        int j = 0;
        for(int i : arr){
            if(i>=0){newArr[j] = i;
                j++;}
        }
        for(int i : arr){
            if(i<0){newArr[j] = i;
                j++;}
        }

        System.arraycopy(newArr, 0, arr, 0, arr.length);
    }
}
