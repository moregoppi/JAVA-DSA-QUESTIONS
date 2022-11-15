class Student{
    String name;
    String fathername;
    int age;
    public void printinfo(int age){
        System.out.println(this.age);
    }
    public void printinfo(String name){
        System.out.println(this.name);
    }
    public void printinfo(int age, String name){
        System.out.println(this.name +" "+this.age);
    }
    public void printinfo(String name, int age){
        System.out.println(this.name +" "+this.age);
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Gurpreet";
        s1.age=20;

        s1.printinfo(s1.name,s1.age);
        
    }
}
