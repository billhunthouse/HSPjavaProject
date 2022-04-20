package OOP;

public class MethodExercise03 {
    public static void main(String[] args) {
        int[][] testArray = {{1, 2, 3}, {2, 3, 4}};
        MyTools tool = new MyTools();
        tool.MethodsName(testArray);


        Person p = new Person();
        p.name="jack";
        p.age= 23;

        tool.copyPerson(p);
    }
}

class Person {
    String name;
    int age;
}

class MyTools {
    public void MethodsName(int[][] arrName) {
        for (int i = 0; i < arrName.length; i++) {
            for (int j = 0; j < arrName[i].length; j++) {
                System.out.println("方法内的arrName的值为" + arrName[i][j]);
            }
            System.out.println();
        }

    }


    public void copyPerson(Person p) {
        Person p2 = new Person();
        p2.name = p.name;
        p2.age = p.age;
        System.out.println(p.name + p.age);
        System.out.println(p2.name + p2.age);
        if(p2==p){
            System.out.println("yes");

        }
        else{
            System.out.println("not equal");
        }

    }
}