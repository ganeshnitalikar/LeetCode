//Running sum of 1d array

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
