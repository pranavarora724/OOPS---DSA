package Lecture2;

public class Static_And_Non_Static_Demonstration2
{
    public static void main(String[] args) {
        System.out.println("Inside Main function");
        display();

        Static_And_Non_Static_Demonstration2 ob = new Static_And_Non_Static_Demonstration2();
        ob.message();
    }

//    As discussed
//   Non Static not requires any object
//    So both "static" and "Non static" can both access  "Non Static"  methods
//    static requires an object
//    So only static can access static

    static void display() {
        System.out.println("Inside Non Static Display Function");

//        message();
//        Above Line Will give an Error
    }

    void message() {
        System.out.println("This is non static function message");
        display();
        message2();
    }

    void message2() {
        System.out.println("This is non static function message2");
    }
}


