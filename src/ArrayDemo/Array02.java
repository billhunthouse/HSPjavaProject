package ArrayDemo;
import java.util.Scanner;

//动态数组和静态数组的区别

public class Array02 {
//  summary : 数组动态和静态的区别在于： 动态的是为数组指定了长度；
//            静态数组是为数组指定了内容
    public static void main(String[] args) {
//          1.创建一个数组,并提前定义变量的长度
        double arrayLength[] = new double[5];
        Scanner myscanner = new Scanner(System.in);
//          2.定义类型 Scanner,为scanner  创建新对象，开辟地址空间,调用  系统输入方法
        for(int i=0;i<arrayLength.length;i++){
            System.out.println("请输入第"+ (i+1)+"个元素的值");
//          3.调用scanner对象的next的对应方法
            arrayLength[i] = myscanner.nextDouble();

        }
        System.out.println("输出数组情况");
        for(int i = 0;i<arrayLength.length;i++){
            System.out.println(arrayLength[i]);
        }



    }
}

