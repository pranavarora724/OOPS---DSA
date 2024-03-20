package Lecture2;

public class Greeting
{

//    Lecture_1.Greeting;
    public static void main(String[] args) {
        System.out.println("Hello World");

//        Accessing Contents of other packages
//        NOTE - That should be "Public"
        Lecture_1.Greeting.display();
    }
}
