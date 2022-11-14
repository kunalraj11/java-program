import java.util.*;
class Main {

    public static void main (String args[]){

        int a,Count=0,lastdigit,firstdigit,backup,pow=1,sum;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the number:");
        a=obj.nextInt();
        backup=a;
        while (a>0) {
            Count++;
            a=a/10;
        } 
        System.out.println("digit=" +Count);
        a=backup;
        lastdigit=a%10;
        for(int i=1;i<Count;i++)
        {
            pow=pow*10;
        }
        firstdigit=a/pow;
        sum=lastdigit+firstdigit;
        System.out.println("sum of firstdigit and lastdigit:" +sum);
    }
}