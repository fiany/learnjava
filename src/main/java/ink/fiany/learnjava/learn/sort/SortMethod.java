package ink.fiany.learnjava.learn.sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SortMethod {

    private static final List<Integer> NUMBER_LIST = new ArrayList<>();


    public static void main(String[] args) {
        init();
//        maopao();
        quickSort();
    }

    public static void init() {
        System.out.println("初始化开始=======");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            Random random = new Random();
            NUMBER_LIST.add(random.nextInt(100000));
        }
        long end = System.currentTimeMillis();
        System.out.println("初始化结束,用时:" + (end - start) + "ms");

    }

    public static void swap(List<Integer> list, int i, int j) {
        int num = list.get(i);
        list.set(i, list.get(j));
        list.set(j, num);
    }

    // ========================冒泡排序
    public static void maopao() {
        // 冒泡排序
        System.out.println("冒泡排序开始");
        long start = System.currentTimeMillis();
        for (int i = 1; i < NUMBER_LIST.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (NUMBER_LIST.get(i) < NUMBER_LIST.get(j)) {
                    swap(NUMBER_LIST, i, j);
                }
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("冒泡排序结束,用时:" + (end - start) + "ms");
        System.out.println(NUMBER_LIST.toString());
    }
    // =======================快速排序

    public static int partition(List<Integer> list, int left, int right) {
        int index = left + 1;
        for (int i = index; i <= right; i++) {
            if (list.get(i) < list.get(left)) {
                swap(list, i, index);
                index++;
            }

        }
        swap(list, left, index - 1);
        return index - 1;
    }

    public static List<Integer> quickSort(List<Integer> list, int left, int right) {
        if (left < right) {
            int partitionIndex = partition(list, left, right);
            quickSort(list, left, partitionIndex - 1);
            quickSort(list, partitionIndex + 1, right);
        }
        return list;
    }


    public static void quickSort() {
        // 冒泡排序
        System.out.println("快速排序开始");
        long start = System.currentTimeMillis();
        quickSort(NUMBER_LIST, 0, NUMBER_LIST.size() - 1);
        long end = System.currentTimeMillis();
        System.out.println("快速排序结束,用时:" + (end - start) + "ms");
        System.out.println(NUMBER_LIST.toString());

    }
}
