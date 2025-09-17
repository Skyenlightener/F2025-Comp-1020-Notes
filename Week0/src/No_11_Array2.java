import java.util.Arrays;

public class No_11_Array2 {

    // shallow copy and deep copy
    // shallow copy only copy the reference. when modify one, the other will change as well
    // deep copy is to initial a new array with same length and using a for loop to copy all elements

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4, 5]
        int[] arrCopy1 = new int[arr.length];
        for (int i = 0; i < arrCopy1.length; i++) {
            arrCopy1[i] = arr[i];
        }
        System.out.println(Arrays.toString(arrCopy1));
        arr[2] = 10;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrCopy1));

        /*
        public static native void arraycopy(
        Object src,      // 源数组
        int srcPos,      // 源数组的起始位置
        Object dest,     // 目标数组
        int destPos,     // 目标数组的起始位置
        int length       // 要复制的元素个数
);
         */
        int[] arrCopy2 = new int[arr.length];
        System.arraycopy(arr,0,arrCopy2,0,arr.length);
        System.out.println(Arrays.toString(arrCopy2));
    }
}
