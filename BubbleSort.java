import java.lang.*; 
import java.util.*; 
/**
 * 冒泡排序（bubble sort）
 */
public class BubbleSort implements Sort
{
    /**
     * 冒泡排序
     * array: 待排序数组 
     */
    public int[] sort(int[] array)    
    {
        int tmp = 0;
        for (int i = 1; i < array.length; i++)
        {
            for (int j = 0; j < array.length - i ; j++) 
            {
                if (array[j] >= array[j + 1]) 
                {
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        return array;
    }
}
