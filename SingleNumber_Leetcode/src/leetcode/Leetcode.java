/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class Leetcode {
    
 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //problem 1
        int array [] =new int[5];
        array[0]=2;
        array[1]=2;
        array[2]=1;
        array[3]=1;
        array[4]=4;
        
  List<Integer> no_duplicate_list = new ArrayList<>();
  

    for (int i : array) 
    {
      if (!no_duplicate_list.contains(i)) {
        no_duplicate_list.add(i);
      } else {
        no_duplicate_list.remove(new Integer(i));
      }
    }
     no_duplicate_list.get(0);
     int b= no_duplicate_list.get(0);
        System.out.println("output: "+b);
        
    }
    
    
    
}
