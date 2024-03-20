package Lecture3;

public class main
{
    public static void main(String[] args) {
        Box b1 = new Box();
        BoxWeight bw1 = new BoxWeight(10);

        Box b2 = new BoxWeight(20);
        System.out.println(b2.l);

        BoxPrice bp1 = new BoxPrice(100);
//        Child class can access both Parent and Grand_Parent Class

//        Box b2 = new BoxWeight(20);
//        Parent Class Reference can Contain Child Class Object
//        What an object can access is decided by Left Side (Refernce)
//        here "b2" ka left side is "Box"
//        so   "b2" can access only "Box" class variables
//        "b2" cannot access "weight" as it is child class
//        so below line will give error
//        System.out.println(b2.weight);


//        BoxWeight bw2 = new Box();
//        Child Class Refrence Cannot Contain Parent Class Object
//        What an object can access is decided by Left Side (Refernce)
//        Here "bw2" can access Both Parent Class And Child Class Values
//        "bw2" can Access "weight"
//        But here not possible
//        Because usko "Box" class ka object mil rha
//        "Box" class cannot access "weight"


//        b1.weight();
//        Parent Class Cannot Access Child class Methods

    }
}
