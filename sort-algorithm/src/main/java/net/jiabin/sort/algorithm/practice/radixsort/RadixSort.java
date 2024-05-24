package net.jiabin.sort.algorithm.practice.radixsort;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//基数排序
public class RadixSort {

    public static void main(String[] args) {
        int[] originArr = {1,3,4,2,6,5,8,9,10,7,20,22,26,24,25,23,21};
        int[] arr = radixSort(originArr);
        for(int i=0; i<arr.length-1; i++){
            System.out.println(arr[i]);
        }
    }



        public static int[] radixSort(int[] arr) {
            if(arr == null || arr.length < 2)
            {
                return arr;
            }
            int n = arr.length;
            int max = arr[0];
            // 找出最大值
            for (int i = 1; i < n; i++) {
                if(max < arr[i])
                {
                    max = arr[i];
                }
            }
            // 计算最大值是几位数
            int num = 1;
            while (max / 10 > 0) {
                num++;
                max = max / 10;
            }
            // 创建10个桶
            List<LinkedList<Integer>> bucketList = new ArrayList<>(10);
            //初始化桶
            for (int i = 0; i < 10; i++) {
                bucketList.add(new LinkedList<Integer>());
            }
            // 进行每一趟的排序，从个位数开始排
            for (int i = 1; i <= num; i++) {
                for (int j = 0; j < n; j++) {
                    // 获取每个数最后第 i 位是数组
                    int radio = (arr[j] / (int)Math.pow(10,i-1)) % 10;
                    //放进对应的桶里
                    bucketList.get(radio).add(arr[j]);
                }
                //合并放回原数组
                int k = 0;
                for (int j = 0; j < 10; j++) {
                    for (Integer t : bucketList.get(j)) {
                        arr[k++] = t;
                    }
                    //取出来合并了之后把桶清光数据
                    bucketList.get(j).clear();
                }
            }
            return arr;
        }




}
