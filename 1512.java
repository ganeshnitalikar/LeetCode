//Number Of Good Pairs

import java.util.Arrays;
class Problem {
	
	public static int numIdenticalPairs(int[] nums) {          
        	int goodPairs = 0;

        	for(int i= 0 ; i<nums.length; i++){
            		for(int j = 0 ; j<nums.length ;j++){
                		if(i==j){
                    			continue;
                		}
                		if(nums[i] == nums[j] && i< j){
                    			goodPairs++;
                		}
            		}
        	}
        return goodPairs;
    	}
	public static void main(String[] args){
		int[] arr = {1,2,3,1,1,3};
		System.out.println(numIdenticalPairs(arr));
	}
}
