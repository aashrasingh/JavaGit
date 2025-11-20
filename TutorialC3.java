
/**
 * Write a description of class TutorialC3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TutorialC3
{
    int age; // instance variable
    static int qty; //static variable
    public static void main(String[] args){
        
        int n1=10; // local variable
        
        // Implicit typecasting
        
        double dt=n1;
        System.out.println(dt);
        
        //explicit typecasting
        double db= 10.01;
        int itr= (int)db;
        
        System.out.println(itr);
       
        // Finding min, max,size and bytes
        
        System.out.println(Byte.MAX_VALUE); //returns max value
        System.out.println(Byte.MIN_VALUE); //returns min value
        System.out.println(Byte.SIZE); //returns bits
        System.out.println(Byte.BYTES); //returns bytes
        
        //escape sequence
        System.out.println("Hello\nWorld"); // new line
        System.out.println("Hello\tWorld"); //new tab
        System.out.println("\"HelloWorld\""); //double quotation
        System.out.println("\'HelloWorld\'"); //single quotation
        
        //unicode escape
        System.out.println("\u2764");
        
    }
}