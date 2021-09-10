//Sebastian Poliuc

import java.util.Scanner;

public class Main {

    public static int getSize(int num)
    {
        return String.valueOf(num).length();
    }

    public static int[] fillArray(int num, int[] intArray)
    {
        int i;

        char[] digits = String.valueOf(num).toCharArray();

        for(i = 0;i<intArray.length;i++)
        {

            intArray[i] = Character.getNumericValue(digits[i]);
        }

        return intArray;
    }

    public static boolean isPalindrome(int[] intArray)
    {
        int size = intArray.length;

        int i;

        if(size == 0)
        {
            return false;
        }
        for(i = 0; i < size/2; i++)
        {
            if(intArray[i] != intArray[size - i - 1])
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int num;
        int size;
        int i;

        Scanner myScan=new Scanner(System.in);
        while(true)
        {
            System.out.print("Enter a number: ");
            num = myScan.nextInt();

            if(num == -99)
            {
                break;
            }

            size = getSize(num);
            int[] intArray = new int[size];
            intArray = fillArray(num, intArray);

            System.out.printf(num + " is a palindrome: %s\n", Boolean.toString(isPalindrome(intArray)));
        }
    }
}
