public class Peak_Index_in_Mountain_Array 
{


    public static void main(String[] args) 
    {

        int[] num = {0,2,5,8,85,77,6,3};
        
        int result = peakIndexInMountainArray(num);
        
            System.out.println("Peak Index is :: " +num[result]);
    
        

        
    }

    static int peakIndexInMountainArray(int[] arr)
    {
        int start = 0;
        int end = arr.length-1;
        // int mid = (start + end) /2;

        while(start < end)
        {
            int mid = (start + end) /2;
            
            
            if(arr[mid] < arr[mid+1])
            {
                //Ascending order of array
                start =mid+1; // because mid + 1 is greater than mid
            }
            else
            {
                // Descending order of array 
                end = mid; // dont know might be answer
            }
            
        }
        return start;

    }
}

// if(arr[mid] > arr[start] && arr[mid]<arr[end])
            // {
            //     return arr[mid];
            // }
            // else 