/*
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
*/
/* JAVA
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
*/
/*
Time complexity: O(n^2)
Space complexity O(1)
*/
class Solution
{
    public:
    vector<int> twoSum(vector<int> &numbers, int target)
    {
        vector<int> res;
        for(int i=0; i<numbers.size()-1; i++)
        {
            for(int j=i+1; j<numbers.size(); j++)
            {
                if(numbers[i])+numbers[j]==target)
                {
                    res.push_back(i+1);
                    res.push_back(j+1);
                    return res;
                }
            }
        }
        return res;
    }
};
