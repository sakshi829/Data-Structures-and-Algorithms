public class nextGreatestCharacter{
    public static void main(String[] args){
        char[] arr= {'a','c','g','m','r','u'};
        char target = 'm';
        System.out.println(nextGreatestChar(arr,target));

    }

    static int nextGreatestChar(char[] arr,char target){
        
        int start = 0;
        int end = arr.length -1;
        

        while(start <= end){
             int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid-1;
            }else if(target > arr[mid]){
                start = mid+1;
            }
            
        }
        return arr[start % arr.length];
    }
}