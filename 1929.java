//concantenation of array
import java.util.Arrays;
class Problem{
	public static int[] getConcatenation(int[] nums) {
     		 int[] ans = new int[2*nums.length];
       		 for(int i =0 ; i<nums.length;i++){
       			ans[i] = ans[i+nums.length] =nums[i];
        	 }
        return ans;
    	}
	public static void main(String[] args){
		int[] nums = {1,2,1};
		System.out.println(Arrays.toString(getConcatenation(nums)));
	}
}
