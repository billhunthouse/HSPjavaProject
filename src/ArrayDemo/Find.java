package ArrayDemo;

import java.util.Scanner;
public class Find {
    public static void main(String[] args) {
        String[] names = {"金毛狮王","白眉鹰王","金翼蝠王"};
        System.out.println("请输入名字");
        Scanner myScanner = new Scanner(System.in);
//       定义myScanner  = scanner 对象
        String findName = myScanner.next();
//       将myScanner 赋值给findName
        int index = -1;
        for(int i = 0;i< names.length;i++){
            if(findName.equals(names[i])){
                System.out.println("恭喜您找到"+findName);
                index=i;
                break;
            }
        }
        if(index ==-1){
            System.out.println("没有找到"+findName);
        }
    }


}
