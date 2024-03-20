package Lecture5.Interfaces;

public class child2  implements Interface1
{
    public void show(){
        System.out.println("This is child class 'show' method");
    }

    @Override
    public void display() {

    }

    public static void main(String[] args) {
        child2 ob = new child2();
        ob.show();
    }
}
