import java.util.*;
public class construction {
    int unit,amt;
    construction(int a)
    {
        unit=a;
    }
        int Calculate()
        {
            if(unit<=100){
            amt=5*unit;
            }
            else if (unit<=200) {
                amt=6*unit;
            }else{
                amt=7*unit;
            }
            return amt;

        }
        public static void main(String[] args) {
            Scanner obj=new Scanner(System.in);
            System.out.println("enter unit");
            int a=obj.nextInt();
            construction cs=new construction(a);
            int bill=cs.Calculate();
            System.out.print("bill =" +bill);;

        }
}
