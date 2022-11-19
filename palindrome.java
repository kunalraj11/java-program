import java.util.*;
public class palindrome {
    public static void main(String[] args) {
         String name,rev="";
         int len;
         Scanner obj=new Scanner(System.in);
         System.out.println("enter the name:");
         name=obj.nextLine();
         len=name.length();
         for(int i=len-1;i>=0;i--)
        rev=rev+name.charAt(i);
        {
            if (name.equals(rev)) {
                System.out.println("it is a palindrome" ); 
            }
            else{
                System.out.println("it is not a palindrome");
            }
        }
         
    }
}
