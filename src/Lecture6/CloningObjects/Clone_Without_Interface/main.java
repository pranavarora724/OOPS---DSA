package Lecture6.CloningObjects.Clone_Without_Interface;

import java.util.Arrays;

public class main
{
    public static void main(String[] args) {
        Human Pranav = new Human();
        Human twin = new Human(Pranav);

        twin.age=21;

        System.out.println(twin.name);
        System.out.println("Twin's Age = "+ twin.age);
        System.out.println("Pranav's Age = "+ Pranav.age);
        twin.arr[0]=10;
        System.out.println("Twin's Array = "+ Arrays.toString(twin.arr));
        System.out.println("Pranav's Array = "+Arrays.toString(Pranav.arr));
    }

//    This is Shallow Copy
//    New object k no primitive data type will be new
//    But new object ke non primitives(Arrays,String) are Pointing to Parent

//    This is Deep Copy
//    New object ke primitive and non primitive dono data types ki new cop banegi

}
