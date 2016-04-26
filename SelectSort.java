import java.lang.*;
import java.util.*;

public class SelectSort implements Sort
{
    public int[] sort(int[] array)
    {
        int min = 0;
        int len = array.length - 1;
        int tmp = 0;

        //遍历整个数组
        for (int i = 0; i < array.length - 2; i++)
        {
            //找到当前最小值下标
            min = i;
            for  (int j = i + 1; j < array.length - 1; j++)
            {
                if (array[j] < array[min])         
                {
                    min = j;
                }
            }
            
            if (min != i)
            {
                tmp = array[i];
                array[i] = array[min];
                array[min] = tmp;
            }
        }
        return array;
    }
}
