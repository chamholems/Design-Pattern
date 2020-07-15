package main.java.strategy;

import java.util.Arrays;

/**
 * 策略模式
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = {9,2,3,4,7,1,8};
        // sort()方法只能对int类型排序，那double、float以及其他类呢
        Sorter.sort(arr);
        System.out.println(Arrays.toString(arr));

        // Cat排序
        Cat cat1 = new Cat(10, 15);
        Cat cat2 = new Cat(20, 55);
        Cat cat3 = new Cat(15, 5);
        Cat[] catArr = {cat3,cat1,cat2};
        Sorters.sort(catArr);
        System.out.println(Arrays.toString(catArr));

        // 但是我如果想改变比较大小的策略，用height不用weight，或者有两种排序方式呢
        System.out.println("==== Comparator ====");
        Sorters2<Cat> sorters2 = new Sorters2<>();
        sorters2.sort(catArr, (o1, o2) -> {
            if(o1.height < o2.height){
                return -1;
            }else if (o1.height > o2.height){
                return 1;
            }else{
                return 0;
            }
        });
        System.out.println(Arrays.toString(catArr));


    }
}
