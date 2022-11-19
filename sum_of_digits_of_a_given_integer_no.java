import java.util.*;
public class sum_of_digits_of_a_given_integer_no {
    public static void main(String[] args) {
        int a,sum=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the number:");
        a=obj.nextInt();
        for (int i=0;i<=a;i++) 
            sum=sum+i;
            System.out.println("sum=" +sum);
        
    }
}
