/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package f_wildcard;

/**
 *
 * @author ikra8
 */
import java.util.Arrays;
import java.util.List;
  
public class MyWildCard
{
  
    private static double sum(List<? extends Number> list) 
    {
        double sum=0.0;
        for (Number i: list)
        {
            sum+=i.doubleValue();
        }
  
        return sum;
    }
    
    public static void main(String[] args)
    {
          
        //Upper Bounded Integer List
        List<Integer> list1= Arrays.asList(4,5,6,7);
          
        //printing the sum of elements in list
        System.out.println("Total sum is:"+sum(list1));
  
        //Double list
        List<Double> list2=Arrays.asList(4.1,5.0,6.1);
          
        //printing the sum of elements in list
        System.out.print("Total sum is:"+sum(list2));
    }
}
