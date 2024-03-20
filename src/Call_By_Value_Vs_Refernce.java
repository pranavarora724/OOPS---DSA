public class Call_By_Value_Vs_Refernce
{
    public static void main(String[] args) {
        int a = 5;
        int b= 20;

        System.out.println("Before Swapping \n  a ="+a+" b = "+b);
        swap(a,b);
        System.out.println("After Swapping \n  a = "+a+" b = "+b);


        stud mohan = new stud();
        System.out.println("mohan values");
        System.out.println("Before Swapping");
        mohan.display();
        mohan.swap2(mohan);
        System.out.println("After Swapping");
        mohan.display();
    }
      static void swap(int a, int b)
      {
          int temp = a;
          a=b;
          b=temp;
    }
}

 class stud
 {
    int x = 5;
    int y = 10;

    void display()
    {
        System.out.println("x = "+this.x+ " y = "+this.y);
    }

    void swap2(stud st)
    {
        int temp = st.x;
        st.x= st.y;
        st.y= temp;
    }
}
