public class Mountain{
    public static void main(String[] args){
            int[] arr={1,3,5,7,9,5,3};
            System.out.println(peakIndexInMountainArray(arr));
    }

    static int peakIndexInMountainArray(int[] arr){
        int start = 0;
        int end =arr.length-1;

        while(start< end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid+1]){
                // we are in des part in an array
                end = mid;
            }else{
                //we are in asc part in array
                start = mid+1;
            }
        }
      return start; // we can return end also cuz start and end are pointing towards one element;  
    }
}