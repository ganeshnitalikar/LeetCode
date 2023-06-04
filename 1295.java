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
