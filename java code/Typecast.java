public class Typecast{
    public static void main(String[] args){
        double num1 = 50.49;
        int num2 = (int)num1;
        System.out.println(num1);
        System.out.println(num2);
        //Manually typecast into int from double also called NARROWING(Large to small datatype).
        
        int num1=10;
        String num2="20";
        System.out.println(num1+num2);
        //Automatic typecast the num1 into string from integer also calles WIDENING(Small to large datatype).
    }

}
