package Lecture5.Abstract_Classes;

public class Daughter extends Parent{
    @Override
    void career() {
        System.out.println("I want to be Actress");
    }

    @Override
    void partner() {
        System.out.println("I love Chris Evans");
    }

//    Child classes only need to override abstract methods ONLY
}
