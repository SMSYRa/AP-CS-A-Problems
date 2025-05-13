package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        int[] array = {9,1,8,2,7,3,6,4,5};

        System.out.println(Arrays.toString(methodA(array)));

        int[] array2 = {9,1,8,2,7,3,6,4,5};
        System.out.println(Arrays.toString(methodB(array2)));
    }

    public static int[] methodA(int[] array)
    {
        int[] sorted = new int[array.length];
        int count = 0;

        for (int j : array)
        {
            if (j % 2 == 0)
            {
                sorted[count] = j;
                count++;
            }
        }

        for (int j : array)
        {
            if (j % 2 != 0)
            {
                sorted[count] = j;
                count++;
            }
        }

        for(int i = 0; i < array.length; i++)
        {
            array[i] = sorted[i];
        }

        return array;
    }

    public static int[] methodB(int[] array)
    {
        int left = 0, right = array.length - 1;

        while(left < right)
        {
            while(array[left] % 2 == 0)
            {
                left++;
                System.out.println("left" + left);
            }

            while(array[right] % 2 != 0)
            {
                right--;
                System.out.println("right" + right);
            }

            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
        }

        return array;
    }
}