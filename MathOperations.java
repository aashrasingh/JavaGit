
/**
 * Write a description of class MathOperations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MathOperations
{
    public static void main(String[] args){
        int a=2;
        int b=4;
        int c=a+b;
        int d=a-b;
        int e=a*b;
        int f=a/b;
        System.out.println("Arithmetic operations are:");
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println("unary operations are:");
        System.out.println(++a);
        System.out.println(a++);
        System.out.println("assignment operations are:");
        System.out.println(a!=1);
        System.out.println("relational operations are:");
        System.out.println(a>1);
        System.out.println(a>=1);
        System.out.println(a<=1);
        System.out.println(a<1);
        System.out.println("logical operations are:");
        System.out.println((a>10)&(b>3));
        System.out.println("ternary operations are:");
        int age=18;
        String isValid= (age >= 18)? "Driving is allowed" : "Driving is not allowed" ;
        System.out.println(isValid);
    }
}