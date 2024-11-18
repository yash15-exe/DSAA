package Arrays.LeetcodeMedium;

public class HIndex {
    public int hIndex(int[] citations) {
        // for(int i = citations.length; i>0; i--){
        //     int count = 0;
        //     for(int cit: citations){
        //         if(cit>=i){
        //             count++;
        //         }
        //     }
        //     if(count>=i)return i;
        // }
        // return 0;

        Arrays.sort(citations);
        for(int i = 0; i<citations.length; i++){
            if(citations[i]>=citations.length-i)return citations.length-i;
        }
        return 0;
    }
}
