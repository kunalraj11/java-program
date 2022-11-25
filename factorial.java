import java.util.*;
public class factorial {
    public static void main(String[] args) 
    {
        int a ,fact=1;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number:");
        a=obj.nextInt();
        for (int i=1;i<=a;i++) {
            fact=fact*i;
        }
        System.out.println("factorial:"+fact );
    }
}
