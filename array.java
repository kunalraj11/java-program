import java.util.*;
public class array {
    public static void main(String[] args) {
        int a[]=new int[5];
        int sum=0,avg;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the value");
        for (int i=0;i<5;i++) {
            
            a[i]=obj.nextInt();
            sum=sum+a[i];
            
        }
        System.out.println("sum=" +sum);
        avg=sum/5;
        System.out.println("avg=" +avg);
    }
}
