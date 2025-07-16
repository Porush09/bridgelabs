import java.util.Scanner;
public class Ternary{
    public static void main(String[] args){
        Scanner abc = new Scanner(System.in);
        int a= abc.nextInt();
        int b= abc.nextInt();
        int c= abc.nextInt();
        int d= abc.nextInt();

        String result = (a>b && a>c && a>d)? "A is greater":
                        (b>a && b>c && b>d)? "B is greater":
                        (c>b && c>a && c>d)? "C is greater":
                        (d>b && d>c && d>a)? "D is greater":
                        "All are equal";

        System.out.println(result);
    }
}