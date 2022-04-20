package OOP;

public class MethodParameter01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        AA aa = new AA();
        aa.swap(a, b);

    }
}

class AA {
    public void swap(int a, int b) {
        System.out.println("a和b交换位置前a的值为" + a + "\nb的值为" + b);

        int tmp = a;
        a = b;
        b = tmp;
        System.out.println("a和b交换位置后a的值为" + a + "\nb的值为" + b + "\ntmp的值为" + tmp);
    }
}