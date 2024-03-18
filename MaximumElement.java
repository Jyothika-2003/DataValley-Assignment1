public class MaximumElement
{
    public static int findMax(int[] arr) 
    {
        int max = arr[0]; 
        for (int i = 1; i < arr.length; i++) 
	      {
            if (arr[i] > max) 
	          {
                max = arr[i];
            }
        }
        return max;
    }
    
    public static void main(String[] args) 
    {
        int[] arr = {5, 2, 7, 3, 8, 9, 4}; 
        int max = findMax(arr);
        System.out.println("Maximum element : " + max);
    }
}
--
