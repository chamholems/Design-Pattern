package main.java.strategy;

import java.util.Comparator;

public class Sorters2<T> {

    /**
     * 选择排序
     * @param arr
     */
    public  void sort(T[] arr, Comparator<T> comparator){
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                min = comparator.compare(arr[j],arr[min]) < 0 ? j : min;
            }
            swap(arr,i,min);
        }
    }

    private void swap(T[] arr, int i, int min) {
        T temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;
    }

}
