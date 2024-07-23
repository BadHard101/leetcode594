import java.util.HashMap;
import java.util.Map;

class Solution1 {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        // Step 1: Populate the frequency map
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        int maxLength = 0;
        
        // Step 3: Iterate through the keys in the map
        for (int key : frequencyMap.keySet()) {
            // Step 4: Check if the map contains key + 1
            if (frequencyMap.containsKey(key + 1)) {
                // Step 5: Calculate the length of the harmonious subsequence
                int currentLength = frequencyMap.get(key) + frequencyMap.get(key + 1);
                // Step 6: Update the maxLength
                maxLength = Math.max(maxLength, currentLength);
            }
        }
        
        // Step 7: Return the maximum length found
        return maxLength;
    }
}