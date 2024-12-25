package com.company;

public class cwh_29_Practice_Set_6 {
    public static void main(String[] args) {

        // Practice Problem 1
        /* float [] marks = {47.7f,67.8f,63.4f,99.2f,100.0f};
        float sum = 0;
        for (float element:marks){
            sum = sum + element;
        }
        System.out.println("The value sum is " + sum);
         */

        /*
        // Practice Problem 2
        float [] marks = {47.7f,67.8f,63.4f,99.2f,100.0f};
        float num = 47.7f;
        boolean isInArray = false;
        for (float element:marks){
            if(num==element){
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.println("The value is present in the array");
        }
        else{
            System.out.println("The value is not present in the array");
        }

         */

        /*
        // Practice problem 3
        float [] marks = {47.7f,67.8f,63.4f,99.2f,100.0f};
        float sum = 0;
        for (float element:marks){
            sum = sum + element;
        }
        System.out.println("The value of average mark is " + sum/marks.length);
         */

        /*
        // Practice problem 4
        int[][] mat1 = {{1, 2, 3},
                {4, 5, 6}};
        int[][] mat2 = {{2, 6, 13},
                {3, 7, 1}};
        int[][] result = {{0, 0, 0},
                {0, 0, 0}};

        for (int i=0; i<mat1.length; i++) { // row number of times
            for (int j = 0; j < mat1[i].length; j++) { //column number of time
                System.out.format("Setting value for i=%d and j=%d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

            // Printing  the element of a 2-D Array
            for (int i=0; i<mat1.length;i++) { // row number of times
                for (int j = 0; j < mat1[i].length; j++) { //column number of time
                    System.out.print(result[i][j] + " ");
                    result[i][j] = mat1[i][j] + mat2[i][j];
                }
                System.out.println(""); // Prints a new line
            }

         */

        /*
        // Practice Problem 5
        int [] arr = {1,2,3,4,5,6};
        int l = arr.length;
        int n = Math.floorDiv(l,2);
        int temp;

        for(int i=0; i<n; i++){
            // Swap a[i] and a[l-i-1]
            // a  b  temp
            // |4|  |3|  | |
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }

        for(int element: arr){
            System.out.print(element + " ");
        }

         */

    /*
        // Practice Problem 6
        int[] arr = {6,9,255,65,455};

        int max = 0;
        for (int e: arr){
            if(e>max)
            {
                max = e;
            }
        }
        System.out.println("The maximum element int the array is :"+  max);

     */

        /*
        // practice Problem 7
        int[] arr = {1,2,3,4,5,6,7,8};

        int min = arr[0];
        for (int i=0; i<arr.length;i++){
            if(min > arr[i])
            {
                min = arr[i];
            }
        }
        System.out.println("The maximum element int the array is :"+  min);

         */


        // Practice problem 8
        boolean isSorted = true;
        int [] arr = {1, 2, 3 , 4, 34, 67};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The Array is sorted");
        }
        else{
            System.out.println("The Array is not sorted");
        }


    }
}
