/*
 * This program will take in a list of integers and return a
 * new list will all duplicate values removed
 */

import java.util.*;

public class RemovingDuplicates
{
    public static void main(String[] args)
    {
        Integer myList[] = {9, 3, 2, 5, 5, 3, 1, 0, 2, 5, 9, 7};
        System.out.println("The list PRIOR to removing duplicates is: " + Arrays.toString(myList));

        Set<Integer> newList = remove(myList);
        System.out.println("The list AFTER removing duplicates is: " + newList);
    }    
    // Removes duplicates of an array
    public static <Integer> Set<Integer> remove(Integer array[])
    {
        Set<Integer> newSet = new HashSet<Integer>();
        
        // Iterate through array elements and add to set which will remove duplicates
        for (Integer i : array)
        {
            newSet.add(i);
        }
        return newSet;
    }
}
