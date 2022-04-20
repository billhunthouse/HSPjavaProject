package HomeWork;

public class MultiSheet_01 {
    public static void main(String[] args) {
        for(int i=1;i<=9;i++){
            for(int j=1;j<i+1;j++){
                int n=i*j;
                System.out.print(j+"x"+i+"="+n + "\t");
            }
            System.out.println();


        }
    }
}
