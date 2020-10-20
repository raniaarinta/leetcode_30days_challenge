class Solution {
    public boolean backspaceCompare(String S, String T) {
        if(GetBackspace(S).equals(GetBackspace(T)))
        {
            return true;
        }
        return false;
    }

    public String GetBackspace(String mystring)
    {
        Stack<Character> result= new Stack();
        for(Character c: mystring.toCharArray())
        {
            if(c!='#')
            {
                result.push(c);
            }
            else if(!result.isEmpty())
            {
                result.pop();
            }
        }
        return mystring.valueOf(result);
    }

    
}