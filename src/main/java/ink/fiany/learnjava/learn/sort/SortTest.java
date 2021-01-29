package ink.fiany.learnjava.learn.sort;

import java.util.Arrays;
import java.util.Random;

public class SortTest {

    public static void main(String[] args) {
        init();
        quickSort();
    }

    private static int[] ints = new int[10000];

    private static void init() {
        Random random = new Random();
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(10000);
        }
        System.out.println(Arrays.toString(ints));
    }

    private static int compare(int[] ints, int left, int right) {
        for (; left < right; left++) {
            swap(ints, left, right);
            right--;
        }
        return left;
    }

    private static void quickSort() {
        quickSort(ints, 0, ints.length - 1);
        System.out.println("=====快速排序");
        System.out.println(Arrays.toString(ints));
    }

    private static void quickSort(int[] ints, int left, int right) {
        if (left + 1 < right) {
            int middle = compare(ints, left, right);
            quickSort(ints, left, middle-1);
            quickSort(ints, middle+1, right);
        }
    }


    private static void swap(int[] ints, int left, int right) {
        if (ints[left] > ints[right]) {
            int var = ints[right];
            ints[right] = ints[left];
            ints[left] = var;
        }
    }
}
