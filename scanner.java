import java.util.Scanner;

/**
 * scannerr
 *
 * @author Aashra
 * @version v2.1
 */
public class scanner
{
    public static void main(String[]args){
       
       
       //Scanner class
       
       Scanner scan=new Scanner(System.in);
       
       System.out.println("My first number is:");
       
       int firstNum= scan.nextInt(); // for whole numb
       
       System.out.println("My second number is:");
       
       double secondNum= scan.nextDouble(); // for decimal numb
       
       System.out.println("My first Number is:"+ firstNum);
       System.out.println("My second Number is:"+ secondNum);
      
      
      // Ternery operator
      //int age=18;
      
      Scanner input=new Scanner(System.in);
      System.out.println("enter age:");
      int age=input.nextInt();
      
      String isValid= (age >= 18)? "Driving is allowed" : "Driving is not allowed" ;
      
      System.out.println(isValid);
      
       
    }
    
}