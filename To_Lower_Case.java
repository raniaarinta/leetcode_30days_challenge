class Solution {
    public String toLowerCase(String str) {
        // using build in java function 
      //  return str.toLowerCase();
      //using algoirthm
      String result="";
      for(char c: str.toCharArray())
      {
          if(Character.isUpperCase(c))
          {
              result=result +(char)(c+32);
          }
          else
          {
              result=result+c;
          }
      }
      return result;
    }
}