public class swapping {
    public static void main(String[] args) {

        int a=5,b=12;
        System.out.println("Before Swapping");
        System.out.println("a=" +a);
        System.out.println("b=" +b);
        System.out.println("After Swapping");
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a=" +a);
        System.out.println("b=" +b);

    }
}
