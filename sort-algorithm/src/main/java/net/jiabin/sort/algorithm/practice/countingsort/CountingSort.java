package net.jiabin.sort.algorithm.practice.countingsort;
//计数排序
public class CountingSort {


    public static void main(String[] args) {
        int[] originArr = {1,3,4,2,6,5,8,9,10,7,20,22,26,24,25,23,21};
        int[] arr = countingSort(originArr);
        for(int i=0; i<arr.length-1; i++){
            System.out.println(arr[i]);
        }
    }


    public static int[] countingSort(int[] arr) {
        if(arr == null || arr.length < 2)
        {
            return arr;
        }
        int n = arr.length;
        int min = arr[0];
        int max = arr[0];
        // 寻找数组的最大值与最小值
        for (int i = 1; i < n; i++) {
            if(max < arr[i])
            {
                max = arr[i];
            }
            if(min > arr[i])
            {
                min = arr[i];
            }
        }
        int d = max - min + 1;
        //创建大小为max的临时数组
        int[] temp = new int[d];
        //统计元素i出现的次数
        for (int i = 0; i < n; i++) {
            temp[arr[i] - min]++;
        }
        int k = 0;
        //把临时数组统计好的数据汇总到原数组
        for (int i = 0; i < d; i++) {
            for (int j = temp[i]; j > 0; j--) {
                arr[k++] = i + min;
            }
        }
        return arr;
    }



//    public static int[] countingSort(int[] arr) {
//        if(arr == null || arr.length < 2) {
//            return arr;
//        }
//
//        int n = arr.length;
//        int max = arr[0];
//        // 寻找数组的最大值
//        for (int i = 1; i < n; i++) {
//            if(max < arr[i])
//            {
//                max = arr[i];
//            }
//        }
//        //创建大小为max的临时数组
//        int[] temp = new int[max + 1];
//        //统计元素i出现的次数
//        for (int i = 0; i < n; i++) {
//            temp[arr[i]]++;
//        }
//        int k = 0;
//        //把临时数组统计好的数据汇总到原数组
//        for (int i = 0; i <= max; i++) {
//            for (int j = temp[i]; j > 0; j--) {
//                arr[k++] = i;
//            }
//        }
//        return arr;
//    }
}
