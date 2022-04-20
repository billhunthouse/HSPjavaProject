package OOP;

public class jude {
    public static void main(String[] args) {
        System.out.println("这是在本函数中调用");
        Sayhi hi = new Sayhi();
        hi.Sayhi();
        System.out.println("我还是在判断函数中");
    }
}


class Sayhi{
    public void Sayhi(){
        System.out.println("hello");
    }
}