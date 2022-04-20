package Chapter4_operaSymbol;

public class TernaryOperator4_6 {
    public static void main(String[] args) {
        int a = 10;
        int b = 99;
        int result = a > b ? a++: b--;
        System.out.println("result="+result);
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("----");

//      三元运算符，求最大值
        System.out.println("求最大值 ");
        int n1 = 553;
        int n2 = 353;
        int n3 = 23;
//      1.解包   第1个三元运算符  n1 和n2 比较， 若n1 大取n1, 若n2 大 取n2
//      2.
        int max = (n1 > n2 ?n1:n2) > n3? (n1>n2?n1:n2):n3;
        System.out.println(max);
    }
}
