package Lecture_1;

public class Two_Refernce_Pointing_To_same_Objects
{
    public static void main(String[] args) {
        emp1 naman = new emp1();
        naman.id = 10;

        emp1 rohit = naman;
        rohit.id = 7;

        System.out.println("Namans id " );
        naman.display();

        System.out.println("Rohit's id =");
        rohit.display();
    }
}

class emp1{
    int id;

    void display()
    {
        System.out.println("Employee id = "+id);
    }
}
