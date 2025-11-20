import java.util.Scanner;

/**
 * Making a simple inventory report for Aushadhi Pasal
 * 
 * @author Aashra Singh
 * @version v4.0
 */
public class AushadhiPasal
{
    public static void main (String[] args){
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Input the name of the medicine: ");
        
        String MedName= scan.nextLine();
        
        System.out.println("Input price of per tablet in NRP: ");
        
        double price= scan.nextDouble();
        
        System.out.println("Input number of tablets in stock: ");
        
        int numb= scan.nextInt();
        
        double Total= price*numb;
        
        System.out.println("Total price of tablets in stock is: " + Total);
        
        System.out.println("\'Welcome to Aushadhi Pasal of Dharan\'\n We have a total of : " +numb+ " tablets in stock \n" + " Total price of tablets in stock with NRP cost is: "+Total);
        
        System.out.println(" \"We are always on stock\"\n Please visit again \n Thank you for visting");
    }
}