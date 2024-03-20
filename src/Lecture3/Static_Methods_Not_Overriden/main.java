package Lecture3.Static_Methods_Not_Overriden;

public class main
{
    public static void main(String[] args)
    {
        Parent obj1 = new Derived();
        obj1.display();

//        According to rules of overrding
//        Overriding is decided during Runtime
//        And Method which is Overidden decided by the object passed not type of refernce
//        And herer child class method should be called
//        In case of STATIC methods
//        Method to be overidden decided by type of refernce during Compile time
//        In this case Type of refernce is "Parent"
//        So parent class display method is called
    }
}
