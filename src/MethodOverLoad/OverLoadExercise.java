package MethodOverLoad;


public class OverLoadExercise {


    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.m(3));
        System.out.println(test.m(3, 4));
        System.out.println(test.m("3"));
    }
}
class Test{
    public int m(int a){
        int m = a * a;
        return m;
    }

    public int m(int a,int b){
        int m = a * b ;
        return m;
    }

    public String m(String a){
        return a;
    }


}