class Problem852{
	
	static int peakIndexInMountainArray(int[] arr) {
        
        int start = 0 ;
        int end = arr.length-1;

        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid]<arr[mid+1]){
                //increasing part of array
                start = mid +1;
            }else{
                //decresing part of array
                end = mid;
            }
        }
        //both start and end are approaching to max element in array hence at the end of loop start and end both are pointing at answer
        return start;
    }
	public static void main(String args[]){
		int[] arr = {10,20,30,40,50,40,30,20,10};
		System.out.println(peakIndexInMountainArray(arr));
	}
		
}
