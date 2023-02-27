public class abstractclass {
    public static void main(String[] args) {
        //Animal a1=new Animal(); this will not work because we cannot make the object of abstract class   
        //Horse h1=new Horse();      //this will call the constructor's of classes, first they call parent or base class then derived class constructor will be called
        //h1.walk();
        //System.out.println(h1.legs());
        // Chicken c1=new Chicken();
        // c1.walk();
        // System.out.println(c1.legs());
        System.out.println("animal's constructor called -> horse's constructor called -> mustang's constructor called");
        Mustang m1=new Mustang();
        
    }
}
abstract class Animal{
    Animal(){
        System.out.println("animal constructor called");
    }
    int legs;
    abstract void walk();    //this will say in every derived class must have this funciton
    void eat(){
        System.out.println("eat's grass");
    }
    abstract int legs();
}
class Horse extends Animal{
    Horse(){
        System.out.println("horse constructor called");
    }
    void walk(){
        System.out.println("Walks on 4 legs");
    }
    int legs(){
        return 4;
    }
}
class Mustang extends Horse{
    Mustang(){
        System.out.println("mustang constructor called");
    }
}
class Chicken extends Animal{
    void walk(){
        System.out.println("walks on 2 legs");
    }
    
    int legs(){
        return 4;
    }
}
