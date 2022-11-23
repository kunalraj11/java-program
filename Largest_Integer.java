import java.util.*;
public class Largest_Integer {
    public static void main(String[] args) {
        int a,b,c;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter three Integers:");
        a=obj.nextInt();
        b=obj.nextInt();
        c=obj.nextInt();
        if(a>b && a>c)
        {
            System.out.println("A is the largest Integer");

        }
        else if(b>c && b>a)
        {
            System.out.println("B is the largest Integer" );

        }
        else
        {
            System.out.println("C is the largest Integer");

        }
    }
}