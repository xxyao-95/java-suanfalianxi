package sorting_algorithms;
import java.util.Random;
public class QuickSort {

    static <T extends Comparable<? super T>> void quickSort(T[] arr){
        quickSort(arr, 0, arr.length);
    }
    static <T extends Comparable<? super T>> void quickSort(T[] arr, int l, int r){
        if (l < r){
            int pivot = choosePivot(l, r);
            swap(arr, l, pivot);
            int pos = partition(arr, l, r);
            quickSort(arr, l, pos);
            quickSort(arr, pos+1, r);
        }
    }
    static private <T extends Comparable<? super T>> int partition(T[] arr, int l, int r){
        T p = arr[l];
        int i = l+1;
        for(int j = l + 1; j < r; j++){
            if (arr[j].compareTo(p) < 0){
                swap(arr, i, j);
                i += 1;
            }
        }
        swap(arr, l, i-1);
        return i-1;
    }
    static private int choosePivot(int l, int r){
        Random random = new Random();
        return random.nextInt(r-l) + l;
    }

    static private <T extends Comparable<? super T>> void swap(T[] arr, int x, int y){
        T temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }


    public static void main(String[] args) {
        String [] arr = {"a","b","a","c","z","m","3","4","1","2"};
        quickSort(arr);
        for (Object i: arr){
            System.out.println(i);
        }
    }
}
