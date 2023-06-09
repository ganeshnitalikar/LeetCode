class Problem162{
	
	static int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length-1;

        while(start<end){
            int mid = start + (end- start)/2;
            if(nums[mid]<nums[mid+1]){
                //decresing part of array
                start = mid +1;
            }else{
                //increasing part of array
                end = mid;
            }
        }
        return start;
        
    }
    public static void main(String args[]){
	int[] arr = {10,20,30,40,50,40,30,20,10};
	System.out.println(findPeakElement(arr));
    }
}
