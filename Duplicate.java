import java.util.*;;
public class Duplicate
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        // Input for array size
        System.out.println("Enter the size  of array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];

        //Input for array elements
        System.out.println("Enter array values using spaces : ");
        for(int i =0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        SolutionDuplicate s = new SolutionDuplicate();
        boolean ans=s.containsDuplicate(arr);
        System.out.println(ans);
        sc.close();
    }
}
class SolutionDuplicate
{
    public boolean containsDuplicate(int[] nums) 
    {
        if((nums== null)||(nums.length==0)) 
        {
            return false;
        }
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++) 
        {
           if(nums[i-1]==nums[i]) 
           {
              return true;
           }
        }
        return false;
     }
}