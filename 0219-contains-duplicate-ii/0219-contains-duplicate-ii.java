class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (k >= nums.length-1)
            return containsDuplicate(nums);
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i <= k; i++)
            set.add(nums[i]);
        if (set.size() != k+1)
            return true;
        for (int i = 1; i < nums.length-k; i++) {
            set.remove(nums[i-1]);
            set.add(nums[i+k]);
            if (set.size() != k+1)
                return true;
        }
        return false;
    }

    private boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num))
                return true;
            set.add(num);
        }
        return false;
    }
}