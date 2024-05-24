package net.jiabin.sort.algorithm.practice.quicksort;

//快速排序
public class QuickSort {

    public static void main(String[] args) {
        int[] originArr = {1,3,4,2,6,5,8,9,10,7,20,22,26,24,25,23,21};
        int[] arr = quickSort(originArr,0,originArr.length-1);
        for(int i=0; i<arr.length-1; i++){
            System.out.println(arr[i]);
        }
    }


    public static int[] quickSort(int[] arr, int left, int right) {
        if (left < right) {
            //获取中轴元素所处的位置
            int mid = partition(arr, left, right);
            //进行分割
            arr = quickSort(arr, left, mid - 1);
            arr = quickSort(arr, mid + 1, right);
        }
        return arr;
    }

    private static int partition(int[] arr, int left, int right) {
        //选取中轴元素
        int pivot = arr[left];
        int i = left + 1;
        int j = right;
        while (true) {
            // 向右找到第一个小于等于 pivot 的元素位置
            while (i <= j && arr[i] <= pivot) {
                i++;
            }
            // 向左找到第一个大于等于 pivot 的元素位置
            while(i <= j && arr[j] >= pivot ) {
                j--;
            }
            if(i >= j){break;}
            //交换两个元素的位置，使得左边的元素不大于pivot,右边的不小于pivot
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        arr[left] = arr[j];
        // 使中轴元素处于有序的位置
        arr[j] = pivot;
        return j;
    }



//    public static int[] quickSort(int[] arr, int low, int high) {
//        //如果指针在同一位置(只有一个数据时)，退出
//        if (high - low < 1) {
//            return arr;
//        }
//        //标记，从高指针开始，还是低指针（默认高指针）
//        boolean flag = true;
//        //记录指针的其实位置
//        int start = low;
//        int end = high;
//        //默认中间值为低指针的第一个值
//        int midValue = arr[low];
//        while (true) {
//            //高指针移动
//            if (flag) {
//                //如果列表右方的数据大于中间值，则向左移动
//                if (arr[high] > midValue) {
//                    high--;
//                } else if (arr[high] < midValue) {
//                    //如果小于，则覆盖最开始的低指针值，并且移动低指针，标志位改成从低指针开始移动
//                    arr[low] = arr[high];
//                    low++;
//                    flag = false;
//                }
//            } else {
//                //如果低指针数据小于中间值，则低指针向右移动
//                if (arr[low] < midValue) {
//                    low++;
//                } else if (arr[low] > midValue) {
//                    //如果低指针的值大于中间值，则覆盖高指针停留时的数据，并向左移动高指针。切换为高指针移动
//                    arr[high] = arr[low];
//                    high--;
//                    flag = true;
//                }
//            }
//            //当两个指针的位置相同时，则找到了中间值的位置，并退出循环
//            if (low == high) {
//                arr[low] = midValue;
//                break;
//            }
//        }
//        //然后出现有，中间值左边的小于中间值。右边的大于中间值。
//        //然后在对左右两边的列表在进行快速排序
//        quickSort(arr, start, low -1);
//        quickSort(arr, low + 1, end);
//        return arr;
//    }



}
