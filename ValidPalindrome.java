class Solution {
    public boolean isPalindrome(String s) {
        String result="";
        int first=0;
        int last;
        for(char c: s.toCharArray())
        {
            if(Character.isDigit(c) || Character.isLetter(c))
            {
                result=result+c;
            }

        }
        result=result.toLowerCase();
        last=result.length()-1;
        while(first<=last)
        {
            if(result.charAt(first)!=result.charAt(last))
            {
                return false;
            }
            first++;
            last--;

        }
        return true;
        
    }
}