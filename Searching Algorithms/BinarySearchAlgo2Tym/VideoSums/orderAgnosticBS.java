public class orderAgnosticBS{
    public static void main(String[] args){
        //int[] arr ={-2,0,4,7,9,33,77,90};
          int[] arr ={89,77,45,33,22,10,5,0,-2,-6,-9};
        int target = 33;
        System.out.println(orderAgnosticBSSearch(arr,target));
    }

    static int orderAgnosticBSSearch(int[] arr, int target){
        int start = 0;
        int end =arr.length-1;
        
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