/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Johnstone
 */
public class MouseQuiz {
// declare list of integers to store values in queue
    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        //define the total feets to be covered
        int max=21;
        
        int ways=0;
        //initialize the first values of the tree list
           int value3=0+1;
        int value4=0+2;
        if(value3<max){
            list.add(value3);
        }
        if(value4<max){
        list.add(value4);
        } 
        // loop through the tree checking if end nodes is 21 and record 
        for(int i=0;i<10000000;i++){
        int value1=list.get(list.size()-1)+1;
        int value2=list.get(list.size()-1)+2;
        if(value1<max){
            list.add(value1);
           System.out.println(value1);
        }
        if(value2<max){
        list.add(value2);
        System.out.println(value2);
        }
         System.out.println(value1 +"------"+value2);
       if(value1==max || value2==max){
          ways=ways+1;
          }
      System.out.println("Covered "+ways);
            System.out.println("Covered "+list.toString());
          if((value1==max && value2>max) || (value2==max && value1>max)){
               list.remove(list.size()-1);
  
        
        }
         
          if(value1<max && value2<max){

          list.remove(list.size()-3);

          } else if(value1<max ||value2<max){

          list.remove(list.size()-2);

          }
  
     
   //if tree is empty quit. no need of further classification----no items
        
if(list.size()==0){
    System.out.print("Oyee !!");
break;
}
        }
        // output the total ways to standard output
        System.out.println("total ways   "+ways);
        

    }
   
}
