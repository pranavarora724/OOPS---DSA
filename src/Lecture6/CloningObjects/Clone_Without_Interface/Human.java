package Lecture6.CloningObjects.Clone_Without_Interface;

public class Human
{
    int age;
    String name;
    int arr[] = new int[5];

    Human()
    {
        this.age = 20;
        this.name="Pranav";
        arr=new int[]{1,2,3,4,5};
    }

//    SHALLOW COPY

//    Human (Human obj)
//    {
//        this.name = obj.name;
//        this.age = obj.age;
//        this.arr=obj.arr;
//    }



//    DEEP COPY
    Human (Human obj)
    {
        this.name= name;
        this.age = age;
        this.arr = new int[obj.arr.length];

        for(int i=0;i<this.arr.length;i++)
        {
            this.arr[i]=obj.arr[i];
        }
    }
}
