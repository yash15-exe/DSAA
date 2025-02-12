package DS.Arrays;

public class BinSort {
    public void binSort(int[] arr) {
        int count = 0;
        for(int i: arr){
            if(i == 0){
                count++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if(i<count){
                arr[i] = 0;
                continue;
            }
            arr[i] = 1;
        }
    }
}
