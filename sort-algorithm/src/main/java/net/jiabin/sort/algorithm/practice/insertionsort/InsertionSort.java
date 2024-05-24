package net.jiabin.sort.algorithm.practice.insertionsort;
//插入排序
public class InsertionSort {

    public static void main(String[] args) {
        int[] originArr = {1,3,4,2,6,5,8,9,10,7,20,22,26,24,25,23,21};
        int[] arr = insertionSort(originArr);
        for(int i=0; i<arr.length-1; i++){
            System.out.println(arr[i]);
        }
    }

    public static int[] insertionSort(int[] arr) {
        int len = arr.length;
        int preIndex, current;
        for (int i = 1; i < len; i++) {
            preIndex = i - 1;
            current = arr[i];
            while (preIndex >= 0 && arr[preIndex] > current) {
                arr[preIndex + 1] = arr[preIndex];
                preIndex--;
            }
            arr[preIndex + 1] = current;
        }
        return arr;
    }
}
