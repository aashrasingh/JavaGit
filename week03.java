
/**
 * Write a description of class week03 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week03
{
    int age; //instance variable
    static int qty; //static variable
    public static void main(String[] args){
        
        int agr=10; //local variable
        System.out.println(agr);
        
        // <className> <variable>=new <className>();
        
        week03 w1= new week03();
        
        System.out.println(w1.age); //print
        System.out.println(qty);
    }
}