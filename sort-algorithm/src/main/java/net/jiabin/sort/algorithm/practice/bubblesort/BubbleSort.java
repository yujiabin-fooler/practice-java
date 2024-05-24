package net.jiabin.sort.algorithm.practice.bubblesort;
//冒泡排序
public class BubbleSort {


    public static void main(String[] args) {

        int[] originArr = {1,3,4,2,6,5,8,9,10,7,20,22,26,24,25,23,21};
        int[] arr = bubbleSort(originArr);
        for(int i=0; i<arr.length-1; i++){
            System.out.println(arr[i]);
        }

    }


    public static int[] bubbleSort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - 1 - i; j++) {
                if (arr[j] > arr[j+1]) {        // 相邻元素两两对比
                    int temp = arr[j+1];        // 元素交换
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

}
