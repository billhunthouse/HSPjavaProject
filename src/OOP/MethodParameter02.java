package OOP;

public class MethodParameter02 {
    //编写一个 main 方法
    public static void main(String[] args) {
    B b = new B();
    int [] arr = {1,2,3};
    System.out.println("这是主方法的arr的值");
    for(int i = 0 ;i < arr.length;i++){
        System.out.println(arr[i]);
    }

    b.arr(arr);
    System.out.println("这是主方法的arr的值");
    for(int i = 0 ;i < arr.length;i++){
        System.out.println(arr[i]);
    }
    }
}

class B{
    public void arr(int []arr){
        arr[0] = 100;
        System.out.println("这是aa的值");
        for(int i = 0 ;i < arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}