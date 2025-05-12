import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        int[] unsortedArray = {9, 1, 8, 2, 7, 3, 6, 4, 5};

        System.out.println(Arrays.toString(bubbleSort(unsortedArray)));
        System.out.println(Arrays.toString(insertionSort(unsortedArray)));
        System.out.println(Arrays.toString(selectionSort(unsortedArray)));
    }

    public static int[] bubbleSort(int[] array)
    {
        for(int i = 0; i < array.length - 1; i++)
        {
            for(int j = 0; j < array.length - i -1; j++)
            {
                int num1 = Math.abs(5 - array[j]);
                int num2 = Math.abs(5 - array[j + 1]);

                if(num1 > num2)
                {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        return array;
    }

    public static int[] insertionSort(int[] array)
    {
        int num1, j;

        for(int i = 1; i < array.length; i++)
        {
            num1 = Math.abs(5 - array[i]);

            for(j = i; j > 0 && (Math.abs(5 - array[j - 1]) > num1); j++)
            {
                array[j] = array[j - 1];
            }

            array[j] = array[i];
        }

        return array;
    }

    public static int[] selectionSort(int[] array)
    {
        for(int i = 0; i < array.length - 1; i++)
        {
            int min = i;

            for(int j = i + 1; j < array.length; j++)
            {
                int num1 = Math.abs(5 - array[j]);
                int num2 = Math.abs(5 - array[min]);

                if (num1 < num2)
                {
                    min = j;
                }
            }

            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }

        return array;
    }
}
