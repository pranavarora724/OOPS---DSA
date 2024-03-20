package Lecture3;

public class BoxWeight extends Box
{
    int weight;

    BoxWeight()
    {
        super();
    }

    BoxWeight(int weight){
        super();
        this.weight = weight;
        System.out.println("PArametrized Constructor for BoxWeight Class");
    }

    BoxWeight(int l , int b , int h , int weight)
    {
        super(l,b,h);
        this.weight = weight;
    }


}
