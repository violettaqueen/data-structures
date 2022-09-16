package com.cydeo;

import java.util.Arrays;

public class TwoSums {

    public static void main(String[] args) {

        int[] arr = {16,11,3,5,15};
        int target = 8;
        System.out.println(Arrays.toString(findSum(arr, target)));
    }
    public static int[] findSum(int[] arr, int target){
        //1. create pointers (indexes)
        int leftPointer = 0;
        int rightPointer = arr.length-1;//4

        //2.sort the array = [3,5,11,15,16] 0(nlogn)
        Arrays.sort(arr);

        //3.while loop
        while (leftPointer < rightPointer){ //0(n)
            if (arr[leftPointer] + arr[rightPointer] == target) {
                return new int[]{arr[leftPointer] , arr[rightPointer]};
            } else if (arr[leftPointer] + arr[rightPointer] > target) {
                rightPointer--;
            }else {
                leftPointer++;
            }
        }
        return new int[]{};
    }
}
