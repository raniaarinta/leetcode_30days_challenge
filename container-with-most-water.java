class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int first=0;
        int last= height.length-1;
        while(first<last)
        {
            if(height[first]<height[last])
            {
                max= Math.max(max,height[first] *(last-first));
                first++;
            }
            else
            {
                max= Math.max(max,height[last] *(last-first));
                last--;
            }
        }
        return max;
        
    }
}