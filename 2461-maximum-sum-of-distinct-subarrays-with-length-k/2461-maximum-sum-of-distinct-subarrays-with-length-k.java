
import java.util.HashMap;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        long sum = 0;
        long ans = 0;

        for (int right = 0; right < nums.length; right++) {
            // Add the incoming element
            sum += nums[right];
            freq.put(nums[right],
                freq.getOrDefault(nums[right], 0) + 1);

            // Remove the outgoing element when window exceeds k
            if (right >= k) {
                int out = nums[right - k];
                sum -= out;

                if (freq.get(out) == 1) {
                    freq.remove(out);
                } else {
                    freq.put(out, freq.get(out) - 1);
                }
            }

            // Update answer if window has k distinct elements
            if (right >= k - 1 && freq.size() == k) {
                ans = Math.max(ans, sum);
            }
        }

        return ans;
    }
}
 // learn gpt