class Solution {
    public int findDuplicate(int[] nums) {
       HashSet<Integer> h = new HashSet<Integer>();
        for(int n:nums)
        {
            if(h.contains(n))
            {
                return n;
            }
            h.add(n);
        }
        return -1;
    }
}