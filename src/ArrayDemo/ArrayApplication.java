package ArrayDemo;
//数组练习，为数组赋值

public class ArrayApplication {
    public static void main(String[] args) {
//        创建一个 char 类型的 26 个元素的数组，
//        分别 放置'A'-'Z'。使用 for 循环访问所有元素并打印出来。提示：char 类型 数据运算
//        'A'+2 -> 'C' ArrayExercise01.java

        char[] chars = new char[26];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) ('A' + i);
            System.out.println(chars[i]);


        }


    }

}



