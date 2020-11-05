package com.jetbrains;

import java.util.ArrayList;

public class Main {
    /**
     * main entry to the quicksort method
     * @param array the array to sort
     * @param <T> the type of the array, must extend Comparable
     * @post the array will be sorted
     */
    static  <T extends Comparable<T>> void  quicksort(ArrayList<T> array){
        sortLogic(array, 0, array.size() - 1);
    }

    /***
     * main logic of the quicksort method
     * @param array the array to sort
     * @param leftBound the left bound for current iteration
     * @param rightBound the right bound for current iteration
     * @param <T> the type of the array, must extend Comparable
     * @post the array will be sorted
     */
    static  <T extends Comparable<T>> void  sortLogic(ArrayList<T> array, int leftBound, int rightBound){
        int leftcursor = leftBound, rightcursor = rightBound;
        T catalyst = array.get((leftBound + rightBound) / 2);

        do{
            while(array.get(leftcursor).compareTo(catalyst) < 0){
                leftcursor++;
            }
            while (array.get(rightcursor).compareTo(catalyst) > 0){
                rightcursor--;
            }
            if(leftcursor <= rightcursor)
            {
                T linksteElement = array.get(leftcursor);
                array.set(leftcursor, array.get(rightcursor));
                array.set(rightcursor, linksteElement);
                leftcursor++;
                rightcursor--;
            }
        } while(leftcursor < rightcursor);

            if(leftBound < rightcursor)
            {
                sortLogic(array, leftBound, rightcursor);
            }
            if(leftcursor < rightBound)
            {
                sortLogic(array, leftcursor, rightBound);
            }

    }

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>(4);
        arr.add("Jeroen");
        arr.add("Jaak");
        arr.add("Dirk");
        arr.add("Lucas");
        quicksort(arr);
        for(String elem: arr){
            System.out.println(elem);
        }
    }
}
