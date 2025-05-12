class Solution {
    // public int[] findEvenNumbers(int[] digits) {
    //brute force
    //     Set<Integer> result = new HashSet<>();
    //     int n = digits.length;
        
    //     for (int i = 0; i < n; i++) {
    //         if (digits[i] == 0) continue; 
    //         for (int j = 0; j < n; j++) {
    //             if (i == j) continue;
    //             for (int k = 0; k < n; k++) {
    //                 if (k == i || k == j) continue;
    //                 int num = digits[i] * 100 + digits[j] * 10 + digits[k];
    //                 if (num % 2 == 0) {
    //                     result.add(num);
    //                 }
    //             }
    //         }
    //     }
        
    //     return result.stream().sorted().mapToInt(i -> i).toArray();
    // }
     public int[] findEvenNumbers(int[] digits) {
        int[] mpp = new int[10];
        for (int d : digits) mpp[d]++;
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            if (mpp[i] == 0) continue;
            mpp[i]--;
            for (int j = 0; j <= 9; j++) {
                if (mpp[j] == 0) continue;
                mpp[j]--;
                for (int k = 0; k <= 8; k += 2) {
                    if (mpp[k] == 0) continue;
                    mpp[k]--;
                    res.add(i*100 + j*10 + k);
                    mpp[k]++;
                }
                mpp[j]++;
            }
            mpp[i]++;
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}
