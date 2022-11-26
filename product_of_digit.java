import java.util.*;
public class product_of_digit {
    public static void main(String[] args) {
        int a, pro=1;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the number:");
        a=obj.nextInt();
        while (a>0) {
            int b=a%10;
            pro=pro*b;
            a=a/10;
        }
        System.out.println("Product:" +pro);
    }
}