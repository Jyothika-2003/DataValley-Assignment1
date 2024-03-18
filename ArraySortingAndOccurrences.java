import java.util.Arrays;

public class ArraySortingAndOccurrences 
{
    public static int countOccurrences(int[] arr, int num) 
    {
        int count = 0;
        for (int i = 0; i < arr.length; i++) 
	{
            if (arr[i] == num) {
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        int[] arr = {5, 2, 7, 3, 8, 2, 4, 2, 9, 2};
        int numToFind = 2; // Number to find occurrences of
        
        // Sort the array
        Arrays.sort(arr);
        
        // Print sorted array
        System.out.println("Sorted array: " + Arrays.toString(arr));
        
        // Count occurrences of numToFind
        int occurrences = countOccurrences(arr, numToFind);
        System.out.println("Number of occurrences of " + numToFind + ": " + occurrences);
    }
}
