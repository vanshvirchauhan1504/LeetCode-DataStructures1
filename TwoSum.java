import java.util.*;;
public class TwoSum 
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

        // Input for target value
        System.out.println("Enter the target value : ");
        int t=sc.nextInt();

        SolutionTwoSum s = new SolutionTwoSum();
        int ans [] =s.twoSum(arr,t);
        System.out.println("{"+ans[0]+","+ans[1]+"}");
        sc.close();
    }
}
class SolutionTwoSum
{
    public int[] twoSum(int[] nums,int target) 
    {
        int[] x=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    x[0]=i;
                    x[1]=j;
                    break;
                }
            }
        }
        return x;
    }
}
