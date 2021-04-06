
package sorting_algorithms;


public class MergeSort{

    public static Object[] mergeSort(Object [] arr){
        if (arr.length <= 1){
            return arr;
        }else{
            Object [] left = new Object[arr.length/2];
            Object [] right = new Object[arr.length - arr.length/2];
            split(arr, left, right);
            Object [] sortedLeft = mergeSort(left);
            Object [] sortedright = mergeSort(right);

            return merge(sortedLeft, sortedright);
        }
    }

    static private void split(Object [] arr, Object [] left, Object [] right){
        for(int i=0; i < left.length; i++){
            left[i] = arr[i];
        }
        for(int j=0; j < right.length; j++){
            right[j] = arr[left.length+j];
        }
    }

    @SuppressWarnings("unchecked")
    static private <T extends Comparable<? super T>> Object[] merge(Object [] left, Object [] right){
        Object [] result = new Object [left.length + right.length];
        int curr = 0;
        int i = 0;
        int j = 0;
        while(i < left.length && j < right.length){
            T left_curr = (T) left[i];
            T right_curr = (T) right[j];
            if(left_curr.compareTo(right_curr)<0){
                result[curr] = left_curr;
                i ++;
            }else{
                result[curr] = right_curr;
                j ++;
            }
            curr ++;
        }

        while(i < left.length){
            result[curr] = left[i];
            curr ++;
            i++;
        }
        while(j < right.length){
            result[curr] = right[j];
            curr ++;
            j++;
        }

        return result;
    }

    public static void main(String[] args) {
        Integer [] arr = {2,3,5,8,1,4};
        Object [] res = mergeSort(arr);
        for (Object i: res){
            System.out.println(i);
        }
    }
    
}
