package ArrayDemo;

// 数组反转练习

public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55, 66};
//        反转思路 int[0] = int[length]
//        反转思路 int[1] = int[length-1]
        int[] arr02 = new int[arr.length];
        for(int i =0;i<=arr.length;i++) {
            arr02[i] = arr[arr.length-i];
//            length = 6；
//            下标等于 5;
            System.out.println(arr02[i]);
        }

    }
}
