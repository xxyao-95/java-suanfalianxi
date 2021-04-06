package sorting_algorithms;

public class InsertionSort {

    public static <T extends Comparable<? super T>> void insertionSort(T [] arr){
        for (int i = 1; i < arr.length; i++){
            T val = arr[i];
            int hole = i;
            while(hole > 0 && arr[hole-1].compareTo(val)>0){
                arr[hole] =arr[hole-1];
                hole -=1;
            }
            arr[hole] = val;

        }

    }



    public static void main(String[] args) {
        String [] arr = {"a","b","a","c","z","m","3","4","1","2"};
        insertionSort(arr);
        for (String i: arr){
            System.out.println(i);
        }
    }
    
}
