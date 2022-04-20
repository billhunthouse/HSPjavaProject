package ThisPraticee;

public class This01 {
    public static void main(String[] args) {
        Dog d = new Dog("yellow",23);


    }
}


class Dog{
    public String name;
    public int age;
    public Dog(String name,int in_age){
        this.name = name;
        this.age= in_age;
        System.out.println(name+" "+age);
    }

    public void info(){
        System.out.println(this.name + "\t" + this.age + "当前对象的hashCode是"+this.hashCode());
    }
}