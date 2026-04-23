import java.util.*;

class Solution {
    public long[] distance(int[] nums) {
        int n = nums.length;

        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }

        Arrays.sort(arr, (a, b) -> {
            if (a[0] != b[0]) return a[0] - b[0];
            return a[1] - b[1];
        });

        long[] ans = new long[n];
        int i = 0;

        while (i < n) {
            int j = i;
            long total = 0;

            while (j < n && arr[j][0] == arr[i][0]) {
                total += arr[j][1];
                j++;
            }

            int size = j - i;
            long prefix = 0;

            for (int k = 0; k < size; k++) {
                long idx = arr[i + k][1];

                long left = k * idx - prefix;
                long right = (total - prefix - idx) - (long)(size - k - 1) * idx;

                ans[(int)idx] = left + right;
                prefix += idx;
            }

            i = j;
        }

        return ans;
    }
}