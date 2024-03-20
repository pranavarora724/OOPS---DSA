package Lecture2;

public class Human
{
    int age;
    String name;
    String gender;

    static int population = 0;

    public Human(int age , String name , String gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;

        Human.population = Human.population+1;

    }

     public static void displayPopulation(){
         System.out.println("Population = "+Human.population);
    }
}
