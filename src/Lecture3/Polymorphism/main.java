package Lecture3.Polymorphism;

public class main
{
    public static void main(String[] args)
    {
        Shapes s1 = new Shapes();
        Circle c1 = new Circle();
        Square sq1 = new Square();

        s1.area();
        sq1.area();
        c1.area();
//        Functions with same name gets overridden in child class
        System.out.println();

//        IMP
        Shapes s2 = new Square();
        s2.area();

//        As we know what an object can access is decided by left side
//        Here left side of "s2" is "Shapes" class
//        So s2 should call Parent Class Area function
//        But here Child Class Area gets executed
//        Child class overrides area of parent class
//        IMP NOTE -
//        If we remove "area" function of parent class so it will give error

        c1.display();
//        NOTE -
//        "Static Functions" cannot be overridden but can be can be inherited
    }
}
