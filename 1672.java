class Problem1672{
	
	int maxWealth(int[][] accounts){
		int maxWealth = Integer.MIN_VALUE;

		for(int[] person : accounts){
			int wealth = 0;
			for(int account : person){
				wealth+=accounts[person][account];
			}
			if(wealth>maxWealth){
				maxWealth = wealth;
			}
		}

	}
}	
