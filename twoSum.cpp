/*
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
*/
public int[] twoSum(int[] nums, int target)
{
    for(int i=0; i<nums.length; i++)
    {
      for(int j=i+1; j<nums.length, j++)
      {
        if(nums[j]==target-nums[i])
        {
          return new int[]{i,j};
        }
      }
    }
  throw new IllegalArgumentException("No two sum solution");
}

/*
Time complexity: O(n^2)
Space complexity O(1)
*/
