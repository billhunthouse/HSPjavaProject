package ArrayDemo;

import java.util.Arrays;

public class ArrayCal {
    public static void main(String[] args) {
        int[] maxvalue = {4,-1,9, 10,23};
//        System.out.println(Arrays.stream(maxvalue).max());
//        冒泡排序
//        假设[i]最大，  然后[i+1] 如果>[i],maxInt = maxValue[i+1]
        int a = 0;
        for(int i = 0;i< maxvalue.length;i++){
            if (maxvalue[i+1]>maxvalue[i]){
                a = maxvalue[i+1];
                System.out.println("最大值为:"+a);
            }}

    }
}
