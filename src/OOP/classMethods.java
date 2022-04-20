package OOP;

public class classMethods {
    public static void main(String[] args) {
        cal c1 = new cal();
        int d = c1.getsum(2,3);
        System.out.println(d);
    }
}

class cal{
    public int getsum(int a,int b){
        int res = a+b;
        return res;
    }
}
