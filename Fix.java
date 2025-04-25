import java.util.ArrayList;
import java.util.Collections;
/**
 * Exam2-Fix.
 *
 * @author Joeffrey
 */
public class Fix
{
    public Fix()
    {
        ArrayList<Double> temperatures = new ArrayList<Double>();
        
        temperatures.add(36.5);
        temperatures.add(38.5);
        temperatures.add(30.5);
        temperatures.add(50.5);
        temperatures.add(57.5);
        temperatures.add(25.5);
        temperatures.add(45.5);
        
        getMaxTemperature(temperatures);
    }
    
    public String sampleMethod()
    {
        //Question 24
        
        String a = "Hello"; //a)
        String b = "Hello";
        if (a.equals(b))    //b)
        {
            return "Correct";   //c)
        }
        else
        {
            return "Incorrect";
        }
    }
    
    //question 25
    
    public void getMaxTemperature(ArrayList<Double> temperatures) //Fixed method name and return type
    {
        int count = 0;
        double max = 0;
        for(double temps : temperatures)
        {
            if(temps > 37.5)
            {
                count++;
            }
            if (temps > max)
            {
                max = temps;
            }
        }
        System.out.println("Number of cases of fever: " + count);
        System.out.println("Highest temperature recorded: " + max);
        //question 26
        System.out.println("Highest temperature recorded: " + Collections.max(temperatures));
        //question 27
        Collections.sort(temperatures);
        System.out.println("Highest temperature recorded: " + temperatures.getLast());
    }
}
