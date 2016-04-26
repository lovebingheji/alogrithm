
public class SortTest
{
    public static void main(String[] args)
    {
        test(new InsertSort());  
    }

    public static void test(Sort sort)
    {
        int[] array = RandomArray.randomArray();
        SortUtil.show(array);
        array = sort.sort(array);
        SortUtil.show(array);
    }
}
