package ArrayDemo;

public class TwoDemension {
    public static void main(String[] args) {
        int[][]  arr = {{0,0,0,0},{0,1,0,0},{0,0,0,1}};
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }
    }
}
