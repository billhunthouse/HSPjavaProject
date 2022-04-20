package ArrayDemo;
//数组拷贝

public class ArrayCopy {
    public static void main(String[] args) {
            int[] array01= {1,2,3};
            int[] array02 = new int[array01.length];
            for(int i=0;i<array01.length;i++){
                array02[i] = array01[i];
                System.out.println(array02[i]);
//           修改数组2的值并输出数组1 和2 的内容，查看是否有影响


            }
            array02[2] =5;
        System.out.println(array02[2]);
        System.out.println(array01[2]);
    }
}
