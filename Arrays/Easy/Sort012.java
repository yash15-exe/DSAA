package Arrays.Easy;

public class Sort012 {
    public void sort012(int[] arr) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for(int num: arr){
            if(num==0){
                count0++;
            }
            else if(num==1){
                count1++;
            }
            else if(num==2){
                count2++;
            }
        }
        for(int i=0; i<arr.length; i++){
            if(i<count0){
                arr[i] = 0;

            }
            if(i<count1+count0 && i >count0-1){
                arr[i] = 1;
            }
            if(i>count1+count0){
                arr[i] = 2;
            }
        }
    }
}
