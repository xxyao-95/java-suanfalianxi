package sorting_algorithms;

public class SelectionSort{


    public static <T extends Comparable<? super T>> void selectionSort(T [] arr){
        
        for (int i = 0; i < arr.length; i++){
            int min_index = i;
            for(int j=i; j<arr.length; j++){
                if (arr[min_index].compareTo(arr[j])>0){
                    min_index = j;
                }
            }
            T temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }

    }


    public static void main(String[] args) {
        String [] arr = {"a","b","a","c","z","m","3"};
        selectionSort(arr);
        for (String i: arr){
            System.out.println(i);
        }
    }
}