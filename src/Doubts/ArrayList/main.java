package Doubts.ArrayList;

import java.util.ArrayList;

public class main
{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        list.add(1);
        list.add(4);
        list.add(2);
        list.add(5);

        ArrayListClass ob = new ArrayListClass();

        System.out.println("List Before Changing "+list);
        ob.change(list);
        System.out.println("List Afer changing" + list);

        System.out.println("Empty List Before Changing "+list2);
        ob.change(list2);
        System.out.println("Empty List After changing" + list2);
    }
}

// In case of Array List same as Arrays
// But here we can change the length of ArrayList
//If passes as an argument then