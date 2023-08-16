public class SearchInMountain{
    public static void main(String[] args){
        int[] arr ={3,5,7,9,10,25,66,45,33,12,8};
        int target = 45;
        System.out.println(Search(arr,target));
    }

    static int Search(int[] arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBSSearch(arr,target, 0,peak);
        if(firstTry != -1){
            return firstTry;
        }
      return orderAgnosticBSSearch(arr,target,peak+1,arr.length-1);
        
    }

    static int peakIndexInMountainArray(int[] arr){
       int start = 0;
       int end = arr.length - 1;

       while(start< end ){
           int mid = start + (end - start)/2;

           if(arr[mid] > arr[mid+1]){
               //we are in des part of an array
               end = mid;
           }else{
                //we are in asc part of an array
                start = mid + 1;
           }
       }
     return start;//start and end are same we can retuen end also.
    }

    static int orderAgnosticBSSearch(int[] arr, int target,int start, int end){
    
        boolean isAsc = arr[start] < arr[end];

        while(start <= end){

            int mid = start + (end-start)/2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if(target < arr[mid]){
                    end = mid -1;
                }else if(target > arr[mid]){
                    start = mid + 1;
                }
            }else{
                 if(target > arr[mid]){
                    end = mid -1;
                }else if(target < arr[mid]){
                    start = mid + 1;
                }
            }


        }
        return -1;

    }


}