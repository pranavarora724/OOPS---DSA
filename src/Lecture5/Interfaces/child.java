package Lecture5.Interfaces;

public class child implements Interface1,Interface2
{
    public void show()
    {
        Interface2.super.show();
    }

    @Override
    public void display() {

    }
}

// In child class you need to mention which interface ka method you wnt to call
//If two or more default methods of same name
//Default Methods were introduced
//so that Jo pichle classes hai unko ye methods overridde na karne pade and they can simply use the functionality