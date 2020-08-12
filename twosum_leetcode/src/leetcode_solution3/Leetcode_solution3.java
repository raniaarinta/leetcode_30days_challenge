/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode_solution3;

/**
 *
 * @author USER
 */


public class Leetcode_solution3 {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int list [] = new int[]{2,7,11,15};
        int[] result = new int[]{};
        int target=9;
        // TODO code application logic here
        for(int i=0;i<list.length;i++) 
        {
            //get the second element from the list
            for(int j=i+1; j<list.length;j++)
            {
                if(list[j]== (target- list[i]))
                {
                    // return new list
                    int[] r= new int[]{list[i],list[j]};
                    result=r;
                    
                       
                    
                }
                
            }
             
        }
      //print list;
     
      for(int k=0; k<result.length;k++)
      {
          System.out.println("result:" +result[k]);
      }
        
       
    }
   
}
