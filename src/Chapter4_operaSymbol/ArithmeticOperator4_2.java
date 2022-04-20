package Chapter4_operaSymbol;

public class ArithmeticOperator4_2 {
    public static void main(String[] args) {
        int a = 2;
        int b;
        b = ++a;
        System.out.println(b);
        System.out.println("预期b等于3");
        System.out.println("------");

        int day = 59;
        int weeks = 59/7;
        int zero = 59%7;
        System.out.println("剩余假期时间为:"+weeks+"周"+zero+"天");

    }
}
