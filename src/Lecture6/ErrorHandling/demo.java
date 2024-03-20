package Lecture6.ErrorHandling;

public class demo
{
    void display(){
        int a = 5 ;
        int b=0;

        try{
            divide(a, b);
        } catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    int divide(int a,int b) throws ArithmeticException
    {
        if(b==0)
        {
//            System.out.println("Do not divide by zero");
            throw new ArithmeticException("Please Do not divide by zero");
        }
        else return a/b;
    }
}
//  We can have try and catch blocks
//  We can havve multiple catch blocks
//  ut upar wala "Exception" nhi ho sakta
//  upar wale block mein Arithmetic ya koi aur exception hi ho skta hai

//  "throw" -> used to throw or own error
//EXample - divide block
//throw "new Arithmetic Exception("Some random message")"

//"throws" => shows ki this method will throw this error
//EXAMPLE - "throws" Aritmetic Exception


