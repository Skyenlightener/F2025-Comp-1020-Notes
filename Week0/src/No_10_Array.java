import java.util.Arrays;

public class No_10_Array {

    /*
    An array is an OBJECT that stores a group of values of the SAME DATA TYPE
    Can contain any number of elements,
    Once the size is set/initialized, it cannot change

    We store the reference/memory address in a variable/array's name, not the elements in that array
     */

    /*
    数组的初始化
    int[] arrOfInt; -> Declaring 只是声明, 并未初始化
    int -> the array only holds integers, no other types of data is allowed to store in it

    int[] arrOfInt = {1,2,3,4} Using {}
    int[] arrOfInt = new int[#] # -> length of array
    int[] arr = new int[]{1,2,3,4}
     */

    // arr.length

    //
    public static void reverseArray(int[]arr){
        int temp = 0;
        for (int i = 0; i < arr.length/2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length - i-1] = temp;
        }
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i < arr.length-1) {
                System.out.print(arr[i] + ",");
            } else {
                System.out.print(arr[i]);
            }
        }
        System.out.print("]");
    }

    public static void main(String[] args) {

       /* int[] arr = new int[1];
        System.out.println(arr); // memory address

        // 基本类型数组
        int[] intArr = new int[3];
        double[] doubleArr = new double[3];
        float[] floatArr = new float[3];
        boolean[] boolArr = new boolean[3];
        char[] charArr = new char[3];

        // 引用类型数组 (String)
        String[] strArr = new String[3];

        // 打印结果
        System.out.println("int[]     = " + Arrays.toString(intArr));
        System.out.println("double[]  = " + Arrays.toString(doubleArr));
        System.out.println("float[]   = " + Arrays.toString(floatArr));
        System.out.println("boolean[] = " + Arrays.toString(boolArr));
        System.out.println("char[]    = " + Arrays.toString(charArr)); // 会显示空字符
        System.out.println("String[]  = " + Arrays.toString(strArr));

        int[] data1 = {1,2,3,4,5};
        data1[0] = 7;
        data1[1] = data1[0] + data1[1];
        System.out.println(data1[1]);
        System.out.println(data1.length);

        double[] arr1 = {1.0,2,3.0};
        System.out.println(arr1.length);*/


        // pause and practice
        int[] myArray = {1,2,3,4,5,6};
        reverseArray(myArray);
        System.out.println();
        System.out.println(Arrays.toString(myArray));

    }
}
