package Lecture5.Abstract_Classes;

abstract public class Parent
{
    abstract void career();
    abstract void partner();

    Parent(){
        System.out.println("Parent Class constructor called");
    }

    public void display(){
        System.out.println("Abstract classes can contain normal methods too");
    }

    static void hello(){
        System.out.println("Abstact classes can contain static methods which have a body (non abstract)");
    }

//    Abstract classes cannot contain Static methods
//    Abstract methods need to be ovveridden
//    Static methods cannot be ovveridden
//    So common sense :)

}
