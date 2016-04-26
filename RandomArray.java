import java.lang.*;
import java.util.*;

/**
 *产生一组随机int类型数组
 */
public class RandomArray
{
    private static int count = 15;
    private static int max = 100;

    public void setCount(int count)
    {
        RandomArray.count = count; 
    }

    public void setMax(int max)
    {
        RandomArray.max = max;
    }

    /**
     * 生成一组max以内的count个随机数
     * param: count表示生成的随机数个数
     * max : 生成随机数的最大范围
     */
    public static int[] randomArray(int count, int max)
    {
        int[] array = new int[count];
        Random random = new Random(); 
    
        for (int i = 0; i < count; i++)
        {
            array[i] = random.nextInt(max);
        }
        return array;
    }

    /**
     * 生成一组100以内的count个随机数
     * param: count表示生成的随机数个数
     */
    public static int[] randomArray(int count)
    {
        return randomArray(count, max);
    }

    /**
     * 默认生成一组100以内的15个随机数
     *
     * */
    public static int[] randomArray()
    {
        return randomArray(count, max);
    }

}

class RandomArrayTest
{
    public static void main(String[] args)
    {
        SortUtil.show(RandomArray.randomArray());
        SortUtil.show(RandomArray.randomArray(5, 10));
        SortUtil.show(RandomArray.randomArray(20, 200));
    }

}
