import java.util.Scanner;

/**
 * que 5
 *
 * @author AASHRA
 * @version 8.0
 */
public class wq5
{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        
        System.out.println("My first number is:");
       
       int firstNum= scan.nextInt(); // for whole numb
       
       System.out.println("My second number is:");
       
       int secondNum= scan.nextInt();
       
       int sum= firstNum +secondNum;
       
       System.out.println("the sum is " +sum);
       
        
    }
}