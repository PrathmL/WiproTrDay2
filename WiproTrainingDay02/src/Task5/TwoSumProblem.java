package Task5;
import java.util.HashMap;
public class TwoSumProblem {
    public static int[] twoSum(int[] nums, int target) {
	        // Create a hash map to store elements and their indices
	        HashMap<Integer, Integer> numIndices = new HashMap<>();

	        for (int i = 0; i < nums.length; i++) {
	            int complement = target - nums[i];
	            if (numIndices.containsKey(complement)) {
	                // Found a pair that adds up to the target
	                return new int[] { numIndices.get(complement), i };
	            }
	            numIndices.put(nums[i], i); // Store the current element and its index
	        }

	        // No pair found that adds up to the target
	        return new int[] { -1, -1 };
	    }

	    public static void main(String[] args) {
	        int[] nums = { 2, 7, 11, 15 };
	        int target = 26;
	        int[] result = twoSum(nums, target);
	        System.out.printf("Indices of the two numbers that add up to %d: [%d, %d]%n", target, result[0], result[1]);
	    }
	


}
