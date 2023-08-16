package com.sakshi;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MultiDimensionArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int[][] arr = new int[3][3];
        System.out.println(arr.length);

        //Input
        for(int row=0;row < arr.length;row++){
            for(int col=0;col <arr[row].length;col++){
                arr[row][col] =in.nextInt();

            }
        }

        //Output
        for(int row=0;row < arr.length;row++){
            for(int col=0;col <arr[row].length;col++){
                System.out.println(arr[row][col] );

            }


        }
    }

}
