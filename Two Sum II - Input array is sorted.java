class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int first_index=0;
        int last_index=numbers.length-1;
        
        while(first_index<=last_index)
        {
            int sum=numbers[first_index]+numbers[last_index];
            if(sum>target)
            {
                last_index--;
            }
            else if(sum<target)
            {
                first_index++;
            }
            else
            {
                return new int[] {first_index+1,last_index+1};
            }
        }
        return new int[] {first_index+1,last_index+1};
        
    }
}