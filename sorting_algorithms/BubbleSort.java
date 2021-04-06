package sorting_algorithms;

import java.util.*;
public class BubbleSort{


    public static <T extends Comparable<? super T>> void bubbleSort(T [] arr){
        
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length - i - 1; j++){
                if(arr[j].compareTo(arr[j+1]) > 0){
                    T temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

    }


    public static void main(String[] args) {
        String [] arr = {"a","b","a","c"};
        bubbleSort(arr);
        for (String i: arr){
            System.out.println(i);
        }
    }
}