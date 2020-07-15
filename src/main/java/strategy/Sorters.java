package main.java.strategy;

public class Sorters {

    /**
     * 选择排序
     * @param arr
     */
    public static void sort(Comparable[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                min = arr[j].compareTo(arr[min]) < 0 ? j : min;
            }
            swap(arr,i,min);
        }
    }

    private static void swap(Comparable[] arr, int i, int min) {
        Comparable temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;
    }

}
