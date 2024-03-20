package Lecture5.Abstract_Classes;

public class main
{
    public static void main(String[] args) {
        Daughter d1 = new Daughter();
        Son s1 = new Son();

        s1.career();
        d1.career();

        System.out.println();

        Parent p1  = new Son();
        p1.career();

//        We Cannot create parent class Object
//        But can create with help of child class object
//        Due to runtime polymorphism it wll access Child Class Method only

//        We cannot create Object of Abstract Classes
//        bcoz when We create object of astract classes
//        Means we can access abstract methods inside it
//        But you cannot access abstract methods bcoz uki koi body nahi hoti

//        Abstract Classes can have Constructors
//        They get executed when child class ojects are created
    }
}
