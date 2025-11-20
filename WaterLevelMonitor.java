
/**
 * que 6
 *
 * @author AASHRA
 * @version v4.0
 */
public class WaterLevelMonitor
{
    public static void main(String[] args){
        int WaterLevel= 1000;
        System.out.println("the current water level is: "+ WaterLevel);
        
        String isValid= (WaterLevel >= 1000)? "WARNING: Water level has reached 1000l or more!" : "Normal";
        System.out.println(isValid);
    }
}