/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode_solusion4;

import static java.lang.Double.max;

/**
 *
 * @author USER
 */
public class Leetcode_solusion4 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        int list[]= new int[]{2,7,9,3,1};
        int output=0;
        int result[]=new int[list.length];      
        if(list== null || list.length==0)
        {
            output=0;
        }
        if(list.length==1)
        {
            output= list[0];
        }
        if(list.length==2)
        {
            max(list[0], list[1]);
        }
        result[0]=list[0];
        result[1]= (int) max(list[0], list[1]);
        for(int i=2; i<result.length;i++)
        {
            result[i]= (int) max(list[i]+ result[i-2], result[i-1]);
            output=result[i];
        }
        
        System.out.println("result : "+output);
        
    }
    
}
