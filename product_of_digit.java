import java.util.*;
public class product_of_digit {
    public static void main(String[] args) {
        int a,pro=1;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number:");
        a=obj.nextInt();
        while (int n !=0) {
            pro=pro*(n%10);
        }
        System.out.println("product=" +pro);
    }
}
