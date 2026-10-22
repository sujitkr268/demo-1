import java.util.Scanner;
import java.util.Arrays;
public class j2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target element");
        int t = sc.nextInt();
        System.out.println("Original Array: " + Arrays.toString(arr));
        arr = removeAll(arr, t);
        System.out.println("Array after removing " + t + ": " + Arrays.toString(arr));
    }
    public static int[] removeAll(int[] array, int t)
    {
        int[] result = new int[array.length];
        int index = 0;
        for(int value : array)
        {
            if(value != t)
            {
                result[index] = value;
                index++;
            }
        }
        return Arrays.copyOf(result, index);
    }
}
