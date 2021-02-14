package org.example.algorithm.SearchAlgorithm;

/**
 * @author matao
 * 二分查找针对的是一个有序的数据集合，每次通过跟区间中间的元素对比，将待查找的区间缩小为之前的一半，直到找到要查找的元素，或者区间缩小为0。
 * 我们假设数据大小是 n，每次查找后数据都会缩小为原来的一半，也就是会除以 2。最坏情况下，直到查找区间被缩小为空，才停止。
 * 可以看出来，这是一个等比数列。其中 n/2k=1 时，k 的值就是总共缩小的次数。而每一次缩小操作只涉及两个数据的大小比较，所以，经过了 k 次区间缩小操作，
 * 时间复杂度就是 O(k)。通过 n/2k=1，我们可以求得 k=log 2n，所以时间复杂度就是 O(logn)
 * @date 2021-01-26 16:31
 * @description
 */
public class binarySearch {

    public static void main(String[] args) {
        int srcArray[] = {3,5,11,17,21,23,28,30,32,50,64,78,81,95,101};
        //System.out.println(binSearch(srcArray, 101));

        System.out.println(binarysearch(srcArray,  0, 13, 101));

    }
    /**
     * 二分查找普通循环实现
     *
     * @param srcArray 有序数组
     * @param key 查找元素
     * @return
     */
    public static int binSearch(int srcArray[], int key) {
        int mid = srcArray.length / 2;
        if (key == srcArray[mid]) {
            return mid;
        }
        //二分核心逻辑
        int start = 0;
        int end = srcArray.length - 1;
        while (start <= end) {
            mid = (end - start) / 2 +start;
            if (key < srcArray[mid]) {
                end = mid - 1;
            } else if (key > srcArray[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    /**
     * 递归
     * @param array
     * @param low
     * @param high
     * @param target
     * @return
     */
    static int binarysearch(int array[], int low, int high, int target)
    {
        if (low > high) return -1;
        int mid = (low + high)/2;
        if (array[mid]> target)
            return    binarysearch(array, low, mid -1, target);
        if (array[mid]< target)
            return    binarysearch(array, mid+1, high, target);
        return mid;
    }

}
