package com.sakshi;

public class MaxNum {
    public static void main(String[] args) {
        int[] arr= {2,34,5,67,8};
        System.out.println(max(arr));

        System.out.println(maxInRange(arr,0,2));
    }

    static int max(int[] arr){

        if(arr.length == 0){
            return  -1;
        }
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >maxVal){
                maxVal = arr[i];
            }

        }
        return maxVal;
    }

    //to find in range
    static int maxInRange(int[] arr,int start, int end){

        //creating edge cases

        if(end>start){
            return -1;
        }

        if(arr == null){
            return  -1;
        }

        int maxVal = arr[start];
        for (int i = start; i < end; i++) {
            if (arr[i] >maxVal){
                maxVal = arr[i];
            }

        }
        return maxVal;
    }

}
