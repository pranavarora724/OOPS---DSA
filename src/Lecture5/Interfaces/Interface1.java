package Lecture5.Interfaces;

public interface Interface1
{
    public default void show()
    {
        System.out.println("Default method of Interface1");
    }

    void display();
}
