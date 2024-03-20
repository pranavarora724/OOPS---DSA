package Lecture3;

public class Box
{
    int l , b , h;

    Box()
    {
        l=-1;
        b=-1;
        h=-1;
        System.out.println("Default Constructor of Box Class");
    }

    Box(int l , int b , int h)
    {
        this.l = l;
        this.b = b;
        this.h = h;
        System.out.println("Parameterized Constructor of Base Class");
    }

    Box(Box other)
    {
        this.l = other.l;
        this.b = other.b;
        this.h = other.h;

        System.out.println("PArameterized Constructor of Base Class");
    }
}
