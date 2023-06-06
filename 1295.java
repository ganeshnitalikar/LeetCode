//Find Numbers with Even Number of Digits\
/*Given an array nums of integers, return how many of them contain an even number of digits.

 

Example 1:

Input: nums = [12,345,2,6,7896]
Output: 2
Explanation: 
12 contains 2 digits (even number of digits). 
345 contains 3 digits (odd number of digits). 
2 contains 1 digit (odd number of digits). 
6 contains 1 digit (odd number of digits). 
7896 contains 4 digits (even number of digits). 
Therefore only 12 and 7896 contain an even number of digits.
Example 2:

Input: nums = [555,901,482,1771]
Output: 1 
Explanation: 
Only 1771 contains an even number of digits.
*/

class Problem1295{
	public static void main(String args[]){

	}
	static int evenDigits(int[] arr){
		int count = 0 ;

		for(int num : arr){
			if(even(num)){
				count++;
			}	
		}
		return count;
	}
	static boolean even(int num){
		int count = 0;
		while(num!=0){
			count++;
		}
		if(count%2==0){
			return true;
		}else{
			return false;
		}

	}
}
