//Palindrome Number

class Palindrome{
	
	public static boolean isPalindrome(int x) {
        int temp = x;
        int rev = 0;
        while(temp!=0){
            rev = rev*10 + temp%10;
            temp = temp/10;
        }
        if(x<0){
            rev = -rev;
        }
        if(rev==x){
             return true;
        }else{
           return false;
        }

    }
    public static void main(String args[]){
	int target = 2002;
	System.out.println(isPalindrome(target));
    }
}
