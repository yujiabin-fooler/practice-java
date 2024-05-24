package net.jiabin.sort.algorithm.practice.bucketsort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

//桶排序
public class BucketSort {

    public static void main(String[] args) {
        int[] originArr = {1,3,4,2,6,5,8,9,10,7,20,22,26,24,25,23,21};
        int[] arr = bucketSort(originArr);
        for(int i=0; i<arr.length-1; i++){
            System.out.println(arr[i]);
        }
    }

        public static int[] bucketSort(int[] arr) {
            if(arr == null || arr.length < 2)
            {
                return arr;
            }
            int n = arr.length;
            int max = arr[0];
            int min = arr[0];
            // 寻找数组的最大值与最小值
            for (int i = 1; i < n; i++) {
                if(min > arr[i])
                    min = arr[i];
                if(max < arr[i])
                    max = arr[i];
            }
            //和优化版本的计数排序一样，弄一个大小为 min 的偏移值
            int d = max - min;
            //创建 d / 5 + 1 个桶，第 i 桶存放  5*i ~ 5*i+5-1范围的数
            int bucketNum = d / 5 + 1;
            List<LinkedList<Integer>> bucketList = new ArrayList<>(bucketNum);
            //初始化桶
            for (int i = 0; i < bucketNum; i++) {
                bucketList.add(new LinkedList<Integer>());
            }
            //遍历原数组，将每个元素放入桶中
            for (int i = 0; i < n; i++) {
                bucketList.get((arr[i]-min)/d).add(arr[i] - min);
            }
            //对桶内的元素进行排序，我这里采用系统自带的排序工具
            for (int i = 0; i < bucketNum; i++) {
                Collections.sort(bucketList.get(i));
            }
            //把每个桶排序好的数据进行合并汇总放回原数组
            int k = 0;
            for (int i = 0; i < bucketNum; i++) {
                for (Integer t : bucketList.get(i)) {
                    arr[k++] = t + min;
                }
            }
            return arr;
        }

}
