import java.util.*;
import java.lang.*;

public class SortUtil
{

    public static void show(int[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }
    
    public static int[] reverse(int[] array)
    {
        int tmp = 0;
        for(int i = 0, j = array.length -1; i < j; i++, j--)
        {
            tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
        }
        return array;
    }
}
