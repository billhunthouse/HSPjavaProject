package ArrayDemo;
//数组的详细用法

public class ArrayDetail {
    public static void main(String[] args) {

//        6.1 数组入门

//        Index 4 out of bounds for length 4
//        数组越界
//        int [] detail = {1,2,3,4};
//        System.out.println(detail[3]);

        double[] total = {3.2,3.3,3.4,3.5};
        double totalWeight = 0;

        for (int i=0;i<total.length;i++) {
            totalWeight += total[i];
            System.out.println("总体重为："+ totalWeight);
            System.out.println("平均体重为：" + totalWeight/total.length);
        }

    }
}
