public class solution {
    public int maxSubArray(int[] nums)
    {
        // Kadane's Algorithm (max sum only)
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            sum = Math.max(num, sum + num);
            max = Math.max(max, sum);
        }
        return max;
    }

    // Returns [maxSum, startIndex, endIndex] of the maximum subarray
    public int[] maxSubArrayRange(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        int start = 0, end = 0, tempStart = 0;

        for (int i = 0; i < nums.length; i++) {
            if (sum + nums[i] < nums[i]) {
                sum = nums[i];
                tempStart = i;
            } else {
                sum += nums[i];
            }

            if (sum > maxSum) {
                maxSum = sum;
                start = tempStart;
                end = i;
            }
        }

        return new int[] { maxSum, start, end };
    }
     public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        // Create an instance of Solution class
        solution sol = new solution();

        // Get max sum and its subarray range
        int[] res = sol.maxSubArrayRange(arr);
        int maxSum = res[0];
        int start = res[1];
        int end = res[2];

        // Print the max subarray sum
        System.out.println("The maximum subarray sum is: " + maxSum);

        // Print the subarray indices and elements
        System.out.println("Subarray indices: start=" + start + ", end=" + end);
        System.out.print("Subarray elements: ");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i]);
            if (i < end) System.out.print(" ");
        }
        System.out.println();
    }    
}
