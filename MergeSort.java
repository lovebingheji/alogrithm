
import java.lang.*;
import java.util.*;

public class MergeSort implements Sort
{
    /**
     * array: 待排序数组
     * low : 已经排序完毕的左队列头部
     * mid : 已经排序完毕的右队列头部
     * high : 右队列尾部 
     */
    public void mergeSort(int[] array, int low, int mid, int high)
    {
    	int[] left = Arrays.copyOfRange(array, low, mid + 1);
    	int[] right = Arrays.copyOfRange(array, mid + 1, high + 1);
    	
    	int lowIndex = 0;
    	int midIndex = 0;
        int index = 0;
    	
    	while((lowIndex < left.length) 
    			|| (midIndex < right.length))
    	{	    		
    		if (midIndex >= right.length)
    		{
    			array[low + index] = left[lowIndex++];
    		}
    		else if (lowIndex >= left.length)
    		{
    			array[low + index] = right[midIndex++];
    		}
    		else if (left[lowIndex] < right[midIndex])
    		{
    			array[low + index] = left[lowIndex++];
    		}
    		else 
    		{
    			array[low + index] = right[midIndex++];
    		}
    		index++;
    	}	
    }

    public void merge(int[] array, int low, int high)
    {
    	int mid = (low  + high) / 2;
        if (low >= high) 
        {
            return  ;
        }

        merge(array, low, mid);
        merge(array, mid +  1, high);
        mergeSort(array, low, mid, high);
    }

    public int[] sort(int[] array)
    {
        merge(array, 0, array.length - 1);
        return array;
    }
}
