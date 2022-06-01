public class Duplicate
{
    public static void main(String args[])
    {
        int a[]={1,2,3,4};
        Solution s = new Solution();
        boolean ans=s.containsDuplicate(a);
        System.out.println(ans);
    }
}
class Solution 
{
    public boolean containsDuplicate(int[] nums)
    {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    return true;
                }
            }
        }
        return false;
    }
}