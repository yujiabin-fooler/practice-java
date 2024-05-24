package net.jiabin.sort.algorithm.practice.shellsort;

//希尔排序
public class ShellSort {
    public static void main(String[] args) {
        int[] originArr = {1,3,4,2,6,5,8,9,10,7,20,22,26,24,25,23,21};
        int[] arr = shellSort(originArr);
        for(int i=0; i<arr.length-1; i++){
            System.out.println(arr[i]);
        }
    }

    //希尔排序（插入排序变种版）
    public static int[] shellSort(int[] arr){
        //希尔排序（插入排序变种版）
        for (int i = arr.length / 2; i > 0; i /= 2) {
            //i层循环控制步长
            for (int j = i; j < arr.length; j++) {
                //j控制无序端的起始位置
                for (int k = j; k > 0  && k - i >= 0; k -= i) {
                    if (arr[k] < arr[k - i]) {
                        int temp = arr[k - i];
                        arr[k - i] = arr[k];
                        arr[k] = temp;
                    } else {
                        break;
                    }
                }
            }
            //j,k为插入排序，不过步长为i
        }
        return arr;
    }



//        public static int[] shellSort(int arr[]) {
//            if (arr == null || arr.length < 2)
//            {return arr;}
//            int n = arr.length;
//            // 对每组间隔为 h的分组进行排序，刚开始 h = n / 2;
//            for (int h = n / 2; h > 0; h /= 2) {
//                //对各个局部分组进行插入排序
//                for (int i = h; i < n; i++) {
//                    // 将arr[i] 插入到所在分组的正确位置上
//                    insertI(arr, h, i);
//                }
//            }
//            return arr;
//        }
//
//        /**
//         * 将arr[i]插入到所在分组的正确位置上
//         * arr[i]] 所在的分组为 ... arr[i-2*h],arr[i-h], arr[i+h] ...
//         */
//        private static void insertI(int[] arr, int h, int i) {
//            int temp = arr[i];
//            int k;
//            for (k = i - h; k > 0 && temp < arr[k]; k -= h) {
//                arr[k + h] = arr[k];
//            }
//            arr[k + h] = temp;
//        }


}
