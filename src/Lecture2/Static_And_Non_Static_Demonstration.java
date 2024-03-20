package Lecture2;

public class Static_And_Non_Static_Demonstration
{
    public static void main(String[] args) {
        Human akash = new Human(19 , "Akash" , "Male" );
        Human sakshi = new Human(21 , "Sakshi" , "Female");

        System.out.println(akash.name);
        System.out.println(sakshi.name);

        Human.displayPopulation();

//        Static methods and variables are Not Dependent on objects
//        Ex - Population will be same for both "Akash" and "Sakshi"
//        Tabhi static methods and functions are accessed using className and not objectName
    }
}
