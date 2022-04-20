package ArrayDemo;

public class Photo {
    public static void main(String[] args) {
//        先创建有多少个元素,photo.length = 3
        int[][] photo = new int[2][];
        for(int i= 0;i< photo.length;i++){
//           给每一个数组开辟空间,赋值长度
            photo[i] = photo[i+1];
//            遍历一维数组,并为其赋值.

            for(int j = 0;j<photo[i].length;j++){
                photo[i][j] = i +1;
            }

        }
        for(int i = 0; i<photo.length; i++){
            for (int j=0;j<photo[i].length;j++){
                System.out.println(photo[i][j]);
            }
            System.out.println();
        }
    }
}
