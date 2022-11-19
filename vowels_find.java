import java.util.*;
public class vowels_find {
    public static void main(String[] args) {
        String name;
        String c;
        int len;

        Scanner obj=new Scanner(System.in);
        System.out.println("Write a sentence");
        name=obj.nextLine();
        name= name+" ";
        len=name.length();
        int pos=0;
        for (int i=0;i<len;i++) {
            char b=name.charAt(i);
            if (b==' ') {
                c=name.substring(pos,i);
                pos=i+1;
                char p = c.charAt(0);
                if (p =='a' || p =='A' || p =='e' || p =='E' || p =='i' || p =='I' || p =='o' || p =='O' || p =='u' || p =='U') {
                System.out.println(c);
                }
            }
        }

    }
}
