import java.lang.*; import java.util.*; 
/**
 * 冒泡排序（bubble sort）
 */
public class Bubble
{
    /**
     * 冒泡排序
     * array: 待排序数组 
     * asc : true  递增排序
     *       false 递减排序
     */
    public static int[] sort(int[] array, boolean asc)    
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

        if (!asc)
        {
            SortUtil.reverse(array);
        }
        return array;
    }

}

class BubbleTest
{
    public static void main(String[] args)
    {
        int[] array =  RandomArray.randomArray();
        SortUtil.show(array);
        SortUtil.show(Bubble.sort(array, true));
        SortUtil.show(Bubble.sort(array, false));
    }



}
