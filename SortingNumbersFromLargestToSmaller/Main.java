import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a;
        int b;
        int c;

        System.out.println("Please enter first number a: ");
        a = scanner.nextInt();
        System.out.println("Please enter second number b: ");
        b = scanner.nextInt();
        System.out.println("Please enter third number c: ");
        c = scanner.nextInt();

        if (a==b || b==c || a==c){
            System.out.println("Same number cannot be entered!");
        }else {
            if (a > b && a > c) {
                if (b > c) {
                    System.out.println("a>b>c");
                } else {
                    System.out.println("a>c>b");
                }

            } else if (b > a && b > c) {
                if (a > c) {
                    System.out.println("b>a>c");
                } else {
                    System.out.println("b>c>a");
                }
            } else {
                if (a > b) {
                    System.out.println("c>a>b");
                } else {
                    System.out.println("c>b>a");
                }
            }
        }









    }
}