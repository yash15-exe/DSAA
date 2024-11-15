package Arrays.Easy;

import java.util.HashMap;
import java.util.Map;

public class IsSubset {
    public String isSubset( long a1[], long a2[], long n, long m) {
        Map<Long,Integer> map1=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map1.containsKey(a1[i])){
                map1.put(a1[i],map1.get(a1[i])+1);
            }else{
                map1.put(a1[i],1);
            }
        }
        for(int i = 0; i < m; i++) {
            if (map1.containsKey(a2[i]) && map1.get(a2[i]) > 0) {
                map1.put(a2[i], map1.get(a2[i]) - 1);
            } else {
                return "No";
            }
        }
        return "Yes";
    }
}
