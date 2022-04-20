package ArrayDemo;

public class ArrayPractice {
    public static void main(String[] args) {
        char[] letter = new char[26];
//      数组的定义格式   类型[] 数组名称 =
        for (int i = 0; i < 26; i++) {
            letter[i] = (char) ('A' + i);
        }
        System.out.println(letter);
    }

}
