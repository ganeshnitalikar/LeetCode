//Running sum of 1d array
/*Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.

 

Example 1:

Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
Example 2:

Input: nums = [1,1,1,1,1]
Output: [1,2,3,4,5]
Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
Example 3:

Input: nums = [3,1,2,10,1]
Output: [3,4,6,16,17]
*/

import java.util.Arrays;
class Problem{
	public static int[] runningSum(int[] nums) {
        	int runningSum[] = new int[nums.length];
        	runningSum[0] = nums[0];
        	for(int i =1; i<nums.length; i++){           
            		runningSum[i] = runningSum[i-1]+nums[i];
        	}
        return runningSum;
    	}
	public static void main(String[] args){
		int[] nums = {10,20,30,40,50};
		System.out.println(Arrays.toString(runningSum(nums)));
	}
}
