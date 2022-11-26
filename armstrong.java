import java.util.*;
public class armstrong {
    public static void main(String[] args) {
        int a, b,c,x=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the number:");
        a=obj.nextInt();
        b=a;
        while (a>0) {
            c=a%10;
            x=(c*c*c)+x;
            a=a/10;
            
        }
        if (x == b) {
            System.out.println("it is an armstrong number" );
        }
        else{
            System.out.print("it is not an armstrong" );
        }
    }
}
