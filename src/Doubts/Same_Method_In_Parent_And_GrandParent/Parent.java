package Doubts.Same_Method_In_Parent_And_GrandParent;

public class Parent extends GrandParent
{
    void show2(){
        System.out.println("This is Parent Class");
    }
    void name(){
        super.name();
        System.out.println("My name is Abhishekh");
    }
}
