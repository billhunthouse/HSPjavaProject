package ArrayDemo;

public class ergodicArray {
    public static void main(String[] args) {
        int[][] ergodic = {{4,6},{1,4,5,7},{-2}};
//        遍历数组，并得到和
        int sum = 0;
        for(int i=0;i<ergodic.length;i++){
            for(int j = 0;j<ergodic[i].length;j++){
                sum += ergodic[i][j];
            }
        }
        System.out.println(sum);
//    TODO:使用Python和java 编写一个杨辉三角

    }
}
