package main.java.strategy;

public class Sorter {

    /**
     * 选择排序
     * @param arr
     */
    public static void sort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                min = arr[j] < arr[min] ? j : min;
            }
            swap(arr,i,min);
        }
    }

    private static void swap(int[] arr, int i, int min) {
        int temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;
    }

    public static void sort(Cat[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                min = arr[j].compareTo(arr[min]) == -1  ? j : min;
            }
            swapCat(arr,i,min);
        }
    }

    private static void swapCat(Cat[] arr, int i, int min) {
        Cat temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;
    }

}
