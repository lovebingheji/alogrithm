import java.lang.*;
import java.util.*;

/**
 *插入排序
 */
public class InsertSort implements Sort
{
    public int[] sort(int[] array)
    {
        int tmp = 0;
        int len = array.length;
        for (int i = 1; i < len ; i++)   
        {
            tmp = array[i];
            for (int j = i; j > 0; j--)        
            {
               if (tmp < array[j - 1]) 
               {
                    array[j] = array[j - 1];
               }
               else
               {
                    array[j] = tmp; 
                    break;
               }
            }
        }
        return array;
    }
}
