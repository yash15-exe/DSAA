class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[arr1.length];
        for(int i: arr1){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        int index = 0;
        for(int j: arr2){
            for(int i = 0; i < map.getOrDefault(j, 0); i++){
                result[index] = j;
                index++;
            }
            map.remove(j);
        }

         List<Integer> remaining = new ArrayList<>(map.keySet());
        Collections.sort(remaining);

        for (int num : remaining) {
            for (int k = 0; k < map.get(num); k++) {
                result[index++] = num;
            }
        }

        return result;
    }
}

//treemap implementation from here.....TreeMap ek sorted HashMap hai, unlike the unordered hashmap



// class Solution {
//     public int[] relativeSortArray(int[] arr1, int[] arr2) {
       
//         TreeMap<Integer, Integer> map = new TreeMap<>();
//         for (int num : arr1) {
//             map.put(num, map.getOrDefault(num, 0) + 1);
//         }

//         int[] result = new int[arr1.length];
//         int index = 0;

//         for (int num : arr2) {
//             int count = map.get(num);
//             for (int i = 0; i < count; i++) {
//                 result[index++] = num;
//             }
//             map.remove(num);
//         }

//         for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//             int key = entry.getKey();
//             int count = entry.getValue();
//             for (int i = 0; i < count; i++) {
//                 result[index++] = key;
//             }
//         }

//         return result;
//     }
// }
