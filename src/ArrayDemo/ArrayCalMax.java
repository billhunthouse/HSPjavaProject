package ArrayDemo;

public class ArrayCalMax {
    public static void main(String[] args) {
        int [] letter = {4,-1,9, 10,23};
        int [] max = new int[1];
//        求最大值： 1.先定义一个，新的数组
        max[0] = letter[0];
        for(int i = 0;i<letter.length;i++){
            if(letter[i+1]>letter[i]){
                max[0]=letter[i+1];
            }
            System.out.println(max[0]);



        }
    }
}
