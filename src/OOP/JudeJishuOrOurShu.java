package OOP;

public class JudeJishuOrOurShu {
    public static void main(String[] args) {
        Jude jude = new Jude();
        jude.num(3);
    }
}

class Jude{
    public boolean num(int num){
        if(num % 2 == 0 ){
            System.out.println("偶数");
            return true;
        }
        else System.out.println("奇数");
            return false;
    }

}

