package com.jetbrains;

import java.util.Arrays;

public class Main {

    /***
     * Method to swap values in an array and print out array
     * @throws ArrayIndexOutOfBoundsException when pos 1 or 2 is out of bounds of array
     * @param array the array to be modified
     * @param pos1 the position of the first element to swap
     * @param pos2 the position of the second element to swap
     * @param <T> the type of the array
     * @post the elements of the given places are swapped
     */
    static <T> void  genericArraySwap(T[] array, int pos1, int pos2)
    {
        if (!(0 <= pos1 && pos1 < array.length) || !(0 <= pos2 && pos2 < array.length)){
            throw new ArrayIndexOutOfBoundsException();
        }
        T first = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = first;

        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        genericArraySwap(new Integer[] {1,2,3,4,5,6,7,8,9,10},2,8);
        genericArraySwap(new String[] {"is","dit","een","goede","vraag?"},2,4);
    }
}
