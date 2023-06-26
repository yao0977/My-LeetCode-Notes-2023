class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        
        // Iterate through the numbers array
        for (int i = 0; i < numbers.length; i++) {
            if (target < numbers[i]) {
                // If the current number is greater than the target, no need to continue
                return null;
            } else {
                // Iterate through the remaining numbers
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[j] == target - numbers[i]) {
                        // If a pair is found that adds up to the target
                        res[0] = i + 1;  // Store the indices (1-based)
                        res[1] = j + 1;
                        return res;
                    }
                }
            }
        }
        
        // If no pair is found
        return null;
    }
}
