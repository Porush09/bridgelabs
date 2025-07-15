import java.util.Scanner;
public  class day2{
    public static void main(String[] args){
        Scanner abc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = abc.nextLine();
        System.out.println("Your name is: " + name);
        System.out.println("Enter your age: ");
        int age = abc.nextInt();
        System.out.println("your age is: " + age);

        int num1=10;
        String num2="20";
        System.out.println(num1+num2);
    }
    
}