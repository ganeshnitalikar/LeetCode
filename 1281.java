//substract the product and sum of digits of an integer


class Problem{
	public static  int subtractProductAndSum(int n) {
        //int sumOfDigits = sum(n);
        int sum = 0;
        int mult = 1;
        while(n!=0){
           	int temp = n%10;
            	mult = mult*temp;
            	sum += temp;
            	n=n/10;
        	}
        return mult-sum;
   	}
	public static void main(String args[]){
		int n = 234;
		System.out.println(subtractProductAndSum(n));
	}
}
