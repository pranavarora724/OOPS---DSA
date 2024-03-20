package Lecture4.Package2;

import Lecture4.Package1.Parent;

public class Subclass_Of_Parent extends Parent
{
    public static void main(String[] args) {
        Subclass_Of_Parent ob1 = new Subclass_Of_Parent();
        ob1.display2();

//        As seen above
//        "Subclass_Of_Parent " is subclass of Parent Class in other package
//        So We Can Access "protected" members in Other packages through Child Class
//        NOTE -
//        We can only access protected members through
//        "Child" class OBJECT
//        We cannot access default specifier members in other packages
//        So below line throws an error
//        ob1.display();
    }
}
