package Doubts.Arrays;

import java.util.Arrays;

public class main
{
    public static void main(String[] args)
    {
      int arr[] = new int[]{2,4,5,7,9};
      int emptyarr[]= new int[]{};

      ArrayClass ob = new ArrayClass();
        System.out.println("Array Before Changing" + Arrays.toString(arr));
      ob.change(arr);
      System.out.println("Array after Changing" + Arrays.toString(arr));

        System.out.println("Empty Array Array Before Changing" + Arrays.toString(emptyarr));
//        Will throw error
        ob.change(emptyarr);
        System.out.println("Empty Array Array after Changing" + Arrays.toString(emptyarr));
    }
}

//In Case of Arrays
//If you pass array as an Argument
//Other Method receives array as an argument
//Any change made to that copy
//Will affect the original array

//But this new copy of Array insoide other method
///Cannot affect the size of array
//If you pass empty array as arguments
//You cannot add any new elements to it
