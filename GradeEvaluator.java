import java.util.Scanner;

/**
 * Write a description of class GradeEvaluator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GradeEvaluator
{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter marks: ");
        float marks=input.nextFloat();
        String isValid= (marks >= 40)? "\'Student is pass\'" : "\'Student is fail\'";
        System.out.println(isValid);
        
        
        
    }
}