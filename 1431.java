//Kids with the greatest Number of Candies

import java.util.*;
class Problem{
	
	public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
		int max = -1;
        	for(int n : candies){
            		if(n>max){
                		max = n;
            		}
        	}
        List<Boolean> ans = new ArrayList();
        	for(int i : candies){
            		if(i+extraCandies >= max){
               		 	ans.add(true);
            		}else{
            			ans.add(false);
            		}
        	}
        return ans;
        }
	public static void main(String[] args){
		int[] candies = {2,3,5,1,3};
		int extraCandies = 3;
		System.out.println(Arrays.toString(kidsWithCandies(candies,extraCandies)));
	}
}
