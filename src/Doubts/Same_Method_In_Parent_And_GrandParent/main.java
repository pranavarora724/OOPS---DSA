package Doubts.Same_Method_In_Parent_And_GrandParent;

public class main
{
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.show1();
        c1.show2();

        c1.name();

//        Child Class can access Both Parent and GrandParent
    }
}
