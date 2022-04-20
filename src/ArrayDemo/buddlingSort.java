package ArrayDemo;

public class buddlingSort {
    public static void main(String[] args) {
        int [] buddling = {24,69,80,57,13};
//        冒泡排序，从小到大
//        倒序对比， 如果最后一位比倒数第二位大,不改动， 否则交换位置
        for(int i=0;i<buddling.length;i++){
            if(buddling[buddling.length-1]>buddling[buddling.length-2]){
                System.out.println(buddling[buddling.length-1]);
            }
            else {
                System.out.println(buddling.length-2);
            }

        }
    }
}
