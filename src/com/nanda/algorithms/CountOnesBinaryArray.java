package com.nanda.algorithms;

/**
 * Created by Nandakumar.Menon on 25-05-2017.
 */
// Java program to count 1's in a sorted array
// The idea is to look for last occurrence of 1 using Binary Search. Once we find the index last occurrence, we return index + 1 as count
class CountOnesBinaryArray
{
    /* Returns counts of 1's in arr[low..high].  The
       array is assumed to be sorted in non-increasing
       order */
    int countOnes(int arr[], int low, int high)
    {
        if (high >= low)
        {
            // get the middle index
            int mid = low + (high - low)/2;

            // check if the element at middle index is last 1
            if ( (mid == high || arr[mid+1] == 0) &&
                    (arr[mid] == 1))
                return mid+1;

            // If element is not last 1, recur for right side
            if (arr[mid] == 1)
                return countOnes(arr, (mid + 1), high);

            // else recur for left side
            return countOnes(arr, low, (mid -1));
        }
        return 0;
    }

    /* Driver program to test above functions */
    public static void main(String args[])
    {
        CountOnesBinaryArray ob = new CountOnesBinaryArray();
        int arr[] = {1, 1, 1, 1, 1, 0, 0};
        int n = arr.length;
        System.out.println("Count of 1's in given array is " +
                ob.countOnes(arr, 0, n-1) );
    }
}